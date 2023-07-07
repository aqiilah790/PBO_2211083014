/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah.dao;

/**
 *
 * @author User
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import aqiilah.model.Pengembalian;

public class PengembalianDaoImpl implements PengembalianDao {
    private Connection cn;
    private Pengembalian pg;

    public PengembalianDaoImpl(Connection cn) {
        this.cn = cn;

    }

    public void insert(Pengembalian pg) throws Exception {
        String insert = "INSERT INTO Pengembalian VALUES (?,?,?,?,?,?)";
        PreparedStatement ps = cn.prepareStatement(insert);
        ps.setString(1, pg.getKodeanggota());
        ps.setString(2, pg.getKodebuku());
        ps.setString(3, pg.getTglpiinjam());
        ps.setString(4, pg.getDikembalikan());
        ps.setInt(5, pg.getTerlambat());
        ps.setDouble(6, pg.getDenda());
        ps.executeUpdate();
    }

    public void update(Pengembalian pg) throws Exception {
        String update = "UPDATE `Pengembalian` SET `dikembalikan` = ?, `terlambat` = ?, `denda` = ? WHERE `Pengembalian`.`kodeanggota` = ? AND `Pengembalian`.`kodebuku` = ? AND `Pengembalian`.`tglpinjam` = ?";
        PreparedStatement ps = cn.prepareStatement(update);
        ps.setString(1, pg.getDikembalikan());
        ps.setInt(2, pg.getTerlambat());
        ps.setDouble(3, pg.getDenda());
        ps.setString(4, pg.getKodeanggota());
        ps.setString(5, pg.getKodebuku());
        ps.setString(6, pg.getTglpiinjam());
        ps.executeUpdate();
    }

    public void delete(Pengembalian pg) throws Exception {
        String delete = "DELETE FROM `Pengembalian` WHERE `Pengembalian`.`kodeanggota` = ? AND `Pengembalian`.`kodebuku` = ? AND `Pengembalian`.`tglpinjam` = ?";
        PreparedStatement ps = cn.prepareStatement(delete);
        ps.setString(1, pg.getKodeanggota());
        ps.setString(2, pg.getKodebuku());
        ps.setString(3, pg.getTglpiinjam());
        ps.executeUpdate();
    }

    @Override
    public Pengembalian getPm(String kodebuku, String kodeanggota, String tglpinjam) throws Exception {
        String all = "select * from Pengembalian where kodeanggota = '?' && kodebuku = '?' && tglpinjam = '?'";
        PreparedStatement ps = cn.prepareStatement(all);
        ps.setString(1, kodebuku);
        ps.setString(2, kodeanggota);
        ps.setString(3, tglpinjam);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            pg = new Pengembalian();
            pg.setKodeanggota(rs.getString(1));
            pg.setKodebuku(rs.getString(2));
            pg.setTglpiinjam(rs.getString(3));
            pg.setDikembalikan(rs.getString(4));
        }
        return pg;
    }

    @Override
    public List<Pengembalian> getAll() throws Exception {
        String getall = "SELECT anggota.kodeanggota, anggota.namaanggota, buku.kodeBuku, buku.judulBuku, peminjaman2.tglpinjam, peminjaman2.tglkembali, pengembalian.dikembalikan, pengembalian.terlambat, pengembalian.denda FROM peminjaman2 JOIN anggota ON peminjaman2.kodeanggota = anggota.kodeanggota JOIN buku ON peminjaman2.kodeBuku = buku.kodeBuku LEFT JOIN pengembalian ON (peminjaman2.kodeanggota = pengembalian.kodeanggota AND peminjaman2.kodebuku = pengembalian.kodebuku AND CAST(peminjaman2.tglpinjam AS DATE) = CAST(pengembalian.tglpinjam AS DATE))";
        PreparedStatement ps = cn.prepareStatement(getall);
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> data = new ArrayList<>();
        while (rs.next()) {
            String tanggaldikembalikan = rs.getString(7);
            if (tanggaldikembalikan == null) {
                pg = new Pengembalian();
                pg.setKodeanggota(rs.getString(1));
                pg.setNamaanggota(rs.getString(2));
                pg.setKodebuku(rs.getString(3));
                pg.setJudulbuku(rs.getString(4));
                pg.setTglpiinjam(rs.getString(5));
                pg.setTglkembali(rs.getString(6));
                pg.setDikembalikan(rs.getString(7));
                pg.setTerlambat(rs.getInt(8));
                pg.setDenda(rs.getDouble(9));
                data.add(pg);
            } // perhatian : hilangkan kode program dibawah
              // String tanggaldikembalikan = rs.getString(7);
              // if (tanggaldikembalikan == null) { }
              // jika ingin program menampilkan data, semua data yang ada.
        }
        return data;
    }

    public int terlambat(String tgl1, String tgl2) throws Exception {
        int selisih = 0;
        String terlambat = "SELECT DATEDIFF(?, ?) AS selisih";
        PreparedStatement ps = cn.prepareStatement(terlambat);
        ps.setString(1, tgl1);
        ps.setString(2, tgl2);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            selisih = rs.getInt(1);
        }
        return selisih;
    }

    @Override
    public List<Pengembalian> cari(String kode) throws Exception {
        String cari = "SELECT anggota.kodeanggota, anggota.namaanggota, buku.kodeBuku, buku.judulBuku, peminjaman2.tglpinjam, peminjaman2.tglkembali, pengembalian.dikembalikan, pengembalian.terlambat, pengembalian.denda FROM peminjaman2 JOIN anggota ON peminjaman2.kodeanggota = anggota.kodeanggota JOIN buku ON peminjaman2.kodeBuku = buku.kodeBuku LEFT JOIN pengembalian ON (peminjaman2.kodeanggota = pengembalian.kodeanggota AND peminjaman2.kodebuku = pengembalian.kodebuku AND CAST(peminjaman2.tglpinjam AS DATE) = CAST(pengembalian.tglpinjam AS DATE)) WHERE anggota.kodeanggota = ?";
        PreparedStatement ps = cn.prepareStatement(cari);
        ps.setString(1, kode);
        ResultSet rs = ps.executeQuery();
        List<Pengembalian> data = new ArrayList<>();
        while (rs.next()) {
            pg = new Pengembalian();
            pg.setKodeanggota(rs.getString(1));
            pg.setNamaanggota(rs.getString(2));
            pg.setKodebuku(rs.getString(3));
            pg.setJudulbuku(rs.getString(4));
            pg.setTglpiinjam(rs.getString(5));
            pg.setTglkembali(rs.getString(6));
            pg.setDikembalikan(rs.getString(7));
            pg.setTerlambat(rs.getInt(8));
            pg.setDenda(rs.getDouble(9));
            data.add(pg);
        }
        return data;
    }
}

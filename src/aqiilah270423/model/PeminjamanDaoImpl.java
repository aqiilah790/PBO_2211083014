/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah270423.model;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class PeminjamanDaoImpl implements PeminjamanDao {
    List<Peminjaman> daftarPeminjaman = new ArrayList<>();
    
    public PeminjamanDaoImpl(){
        AnggotaDao daoAnggota = new AnggotaDaoImpl();
        BukuDao daoBuku = new BukuDaoImpl();
        daftarPeminjaman.add(new Peminjaman(daoAnggota.getAnggota(0),daoBuku.getBuku(0),"09-04-2023","10-04-2023"));
    }

    public void save(Peminjaman peminjaman) {
        daftarPeminjaman.add(peminjaman);
    }
    
    public void update(int index, Peminjaman peminjaman) {
        daftarPeminjaman.set(index, peminjaman);
    }
    
    public void delete(int index) {
        daftarPeminjaman.remove(index);
    }
    
    public Peminjaman getPeminjaman(int index) {
        return daftarPeminjaman.get(index);
    }
    
    public List<Peminjaman> getAll() {
        return daftarPeminjaman;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah270423.controller;
import aqiilah270423.view.FormPeminjaman;
import aqiilah270423.model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author Hp
 */
public class PengembalianController {
    private Pengembalian pengembalian;
    private PengembalianDao pengembalianDao;
    private PeminjamanDaoImpl peminjamanDao;
    private FormPeminjaman  form;
    
    private Peminjaman peminjaman;
    
    private AnggotaDao2 anggotaDao;
    private BukuDao bukuDao;
    
    public PengembalianController(FormPeminjaman form){
        this.form = form;
        pengembalianDao = new PengembalianDaoImpl();
        peminjamanDao = new PeminjamanDaoImpl();
        anggotaDao = new AnggotaDaoImpl2();
        bukuDao = new BukuDaoImpl();
    }
    public void bersihForm(){
        form.getTxtTglpinjam().setText("");
        form.getTxtTglkembali().setText("");
        form.getTxtDikembalikan().setText("");
    }
    public void isiCombo(){
        List<Anggota2> listAnggota = anggotaDao.getAll();
        List<Buku> listBuku = bukuDao.getAll();
        form.getCboAnggota().removeAllItems();
        form.getCboBuku().removeAllItems();
        
        //isi
        for(Anggota2 anggota : listAnggota){
            form.getCboAnggota().addItem(anggota.getNobp());
        }
        for(Buku buku : listBuku){
            form.getCboBuku().addItem(buku.getKode());
        }
    }
    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglpinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(form.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        
        pengembalian = new Pengembalian();
        pengembalian.setDikembalikan("");
        pengembalian.setTerlambat("");
        pengembalian.setDenda();
        pengembalianDao.save(pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Saved");
        
    }
    public void savePengembalian(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        pengembalian.setDikembalikan(form.getTxtDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Saved");
        
    }
    public void getPeminjaman(){
        int index = form.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            form.getCboAnggota().setSelectedItem(peminjaman.getAnggota().getNobp());
            form.getCboBuku().setSelectedItem(peminjaman.getBuku().getKode());
            form.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            form.getTxtTglkembali().setText(peminjaman.getTglkembali());
        }
        pengembalian = pengembalianDao.getPengembalian(index);
        if(pengembalian != null){
            form.getTxtDikembalikan().setText(pengembalian.getDikembalikan());
        }
    }
    
    public void updatePeminjaman(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjaman.setAnggota(anggotaDao.getAnggota(form.getCboAnggota().getSelectedIndex()));
        peminjaman.setBuku(bukuDao.getBuku(form.getCboBuku().getSelectedIndex()));
        peminjaman.setTglpinjam(form.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(form.getTxtTglkembali().getText());
        peminjamanDao.update(idx,peminjaman);
        
        pengembalian.setDikembalikan(form.getTxtDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx,pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "Updated");
    }
    
    public void Kembalikan(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        pengembalian.setDikembalikan(form.getTxtDikembalikan().getText());
        pengembalian.setTerlambat(form.getTxtTglkembali().getText());
        pengembalian.setDenda();
        pengembalianDao.update(idx, pengembalian);
        javax.swing.JOptionPane.showMessageDialog(form, "kembalikan");
    }
    
    public void deletePeminjaman(){
        int idx = form.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(idx);
        pengembalianDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    
    public void tampilData() {
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);

        // Mengambil data dari dua tabel
        java.util.List<Pengembalian> listPengembalian = pengembalianDao.getAll();
        java.util.List<Peminjaman> listPeminjaman = peminjamanDao.getAll();

        // Menambahkan data dari kedua tabel ke dalam satu list
        List<Object[]> dataGabungan = new ArrayList<>();
        for (int i = 0; i < listPeminjaman.size(); i++) {
            Peminjaman peminjaman = listPeminjaman.get(i);
            Pengembalian pengembalian = null;
            if (i < listPengembalian.size()) {
                pengembalian = listPengembalian.get(i);
            }
            Object[] data = {
                peminjaman.getAnggota().getNobp(),
                peminjaman.getAnggota().getNama(),
                peminjaman.getBuku().getKode(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali(),
                (pengembalian == null) ? "" : pengembalian.getDikembalikan(),
                (pengembalian == null) ? "" : pengembalian.getTerlambat(),
                (pengembalian == null) ? "" : pengembalian.getDenda()
            };
            dataGabungan.add(data);
        }

        // Menambahkan data ke dalam tabel
        for (Object[] data : dataGabungan) {
            tabelModel.addRow(data);
        }
    }
}

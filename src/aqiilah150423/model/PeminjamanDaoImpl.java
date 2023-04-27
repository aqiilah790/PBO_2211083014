/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah150423.model;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.List;

public class PeminjamanDaoImpl implements PeminjamanDao {
    List<Peminjaman> daftarPeminjaman = new ArrayList<>();
    
    public PeminjamanDaoImpl(){
        daftarPeminjaman.add(new Peminjaman("2211083014","001","09-04-2023","10-04-2023"));
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

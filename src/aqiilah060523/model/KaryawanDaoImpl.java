/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah060523.model;
import java.util.*;
/**
 *
 * @author User
 */
public class KaryawanDaoImpl implements KaryawanDao {
    List<Karyawan> data = new ArrayList<>();
    
    public void insert(Karyawan karyawan){
        data.add(new Karyawan("aqill","padang","jomblo","2211083014","b","mahasiswa",'1'));
    }
    
    public void save(Karyawan karyawan) {
        data.add(karyawan);
    }
    
    public void update(int index, Karyawan karyawan) {
        data.set(index, karyawan);
    }
    
    public void delete(int index) {
        data.remove(index);
    }
    
    public Karyawan getKaryawan(int index) {
        return data.get(index);
    }
    
    public List<Karyawan> getAll() {
        return data;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah060523.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class KaryawanDaoImpl implements KaryawanDao {
    List<Karyawan> data = new ArrayList<>();
    
    public KaryawanDaoImpl(){
        data.add(new Karyawan("aqill","padang","Single","2211083014","A","mahasiswa",0));
        data.add(new Karyawan("budi","padang","jomblo","2211083015","B","mahasiswa",0));
        data.add(new Karyawan("tomo","padang","jomblo","2211083014","C","mahasiswa",0));
        //data.add(new Karyawan("otsuka","padang","jomblo","2211083014","4","mahasiswa",'4'));
    }
    
    public void insert(Karyawan karyawan){
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


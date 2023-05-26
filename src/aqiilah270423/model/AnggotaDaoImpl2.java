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
public class AnggotaDaoImpl2 implements AnggotaDao2 {
    List<Anggota2> data = new ArrayList<>();
    
    public AnggotaDaoImpl2(){
        data.add(new Anggota2("2211083014", "Ali", "Padang"));
        data.add(new Anggota2("1112", "Deni", "Padang Panjang"));
        data.add(new Anggota2("1113", "Ani", "Padang"));
    }
    
    public void save(Anggota2 anggota){
        data.add(anggota);
    }
    
    public void update(int index, Anggota2 anggota){
        data.set(index, anggota);
    }
    
    public void delete (int index){
        data.remove(index);
    }
    
    public Anggota2 getAnggota(int index){
        return data.get(index);
    }
    
    public List<Anggota2> getAll(){
        return data;
    }
}

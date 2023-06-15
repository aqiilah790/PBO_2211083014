/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah060523.model;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class GajiDaoImpl2 implements GajiDao2 {
    List<Gaji2> data = new ArrayList();
    
    public GajiDaoImpl2(){
        PegawaiDaoImpl data1 = new PegawaiDaoImpl();
        data.add(new Gaji2(data1.getPegawai(0),"IIIA",'0'));
        data.add(new Gaji2(data1.getPegawai(1),"IIIB",'0'));
        data.add(new Gaji2(data1.getPegawai(2),"IIIC",'0'));
        
    }
    
    public void insert(Gaji2 gaji){
        data.add(gaji);
    }
    public void update(int idx, Gaji2 gaji){
        data.set(idx, gaji);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Gaji2 getGaji2(int idx){
        return data.get(idx);
    }
    public List<Gaji2> getAll(){
        return data;
    }
    
}

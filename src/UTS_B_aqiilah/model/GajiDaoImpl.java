/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B_aqiilah.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class GajiDaoImpl implements GajiDao {
    List<Gaji> data = new ArrayList();
    
    public GajiDaoImpl(){
        PegawaiDaoImpl data1 = new PegawaiDaoImpl();
        data.add(new Gaji(data1.getPegawai(0),"",0));
        data.add(new Gaji(data1.getPegawai(1),"",0));
        
    }
    
    public void insert(Gaji gaji){
        data.add(gaji);
    }
    public void update(int idx, Gaji gaji){
        data.set(idx, gaji);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Gaji getGaji(int idx){
        return data.get(idx);
    }
    public List<Gaji> getAll(){
        return data;
    }
    
}

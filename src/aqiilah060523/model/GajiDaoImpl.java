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
public class GajiDaoImpl implements GajiDao {
    List<Gaji> data = new ArrayList<>();
    
    public GajiDaoImpl(){
        KaryawanDao dao = new KaryawanDaoImpl();
        data.add(new Gaji(dao.getKaryawan(0), 3, 2023));
        data.add(new Gaji(dao.getKaryawan(1), 3, 2023));
        data.add(new Gaji(dao.getKaryawan(2), 4, 2024));
    }
    
    public void insert(Gaji gaji){
        data.add(gaji);
    }
    
    
    public void update(int index, Gaji gaji) {
        data.set(index, gaji);
    }
    
    public void delete(int index) {
        data.remove(index);
    }
    
    public Gaji getGaji(int index) {
        return data.get(index);
    }
    
    public List<Gaji> getAll() {
        return data;
    }
}

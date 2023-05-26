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
public class GajiDaoImpl implements GajiDao {
    List<Gaji> data = new ArrayList<>();
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

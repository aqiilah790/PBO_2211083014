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
public class PegawaiDaoImpl implements PegawaiDao {
    List<Pegawai> data = new ArrayList();
    
    public PegawaiDaoImpl(){
        data.add(new Pegawai("1122","aqiil","padang"));
        data.add(new Pegawai("1123","qila","padang"));
        data.add(new Pegawai("1124","udin","padang"));
        data.add(new Pegawai("1125","petot","padang"));
    }
    
    public void insert(Pegawai pegawai){
        data.add(pegawai);
    }
    public void update(int idx, Pegawai pegawai){
        data.set(idx, pegawai);
    }
    public void delete(int idx){
        data.remove(idx);
    }
    public Pegawai getPegawai(int idx){
        return data.get(idx);
    }
    public List<Pegawai> getAll(){
        return data;
    }
}

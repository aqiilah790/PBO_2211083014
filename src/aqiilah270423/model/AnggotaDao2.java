/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aqiilah270423.model;
import java.util.List;
/**
 *
 * @author User
 */
public interface AnggotaDao2 {
    void save(Anggota2 anggota);
    void update(int index, Anggota2 anggota);
    void delete(int index);
    Anggota2 getAnggota(int index);
    List<Anggota2> getAll();
}

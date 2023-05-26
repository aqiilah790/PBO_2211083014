/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package aqiilah060523.model;
import java.util.List;
/**
 *
 * @author User
 */
public interface KaryawanDao {
    void insert(Karyawan karyawan);
    void update(int index, Karyawan karyawan);
    void delete(int index);
    Karyawan getKaryawan(int index);
    List<Karyawan> getAll();
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UTS_B_aqiilah.model;

import java.util.List;

/**
 *
 * @author User
 */
public interface GajiDao {
    void insert(Gaji gaji);
    void update(int index,Gaji gaji);
    void delete(int index);
    Gaji getGaji(int index);
    List<Gaji> getAll();
}

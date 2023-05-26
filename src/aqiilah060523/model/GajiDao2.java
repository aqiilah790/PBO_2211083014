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
public interface GajiDao2 {
    void insert(Gaji2 gaji);
    void update(int index,Gaji2 gaji);
    void delete(int index);
    Gaji2 getGaji2(int index);
    List<Gaji2> getAll();
}

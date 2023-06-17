/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah.dao;

import aqiilah.model.anggota;
import java.util.*;
/**
 *
 * @author User
 */
public interface anggotadao {
    void insert(anggota anggota) throws Exception;
    void update(anggota anggota) throws Exception;
    void delete(anggota anggota) throws Exception;
    anggota getAnggota(String kodeanggota) throws Exception;
    List<anggota> getAll() throws Exception;
}

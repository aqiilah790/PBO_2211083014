/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah060523.controller;

/**
 *
 * @author User
 */
import aqiilah060523.view.FormKaryawan;
import aqiilah060523.model.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

public class KaryawanController {
    private FormKaryawan formKaryawan;
    private KaryawanDao karyawanDao;
    private Karyawan karyawan;
    private Orang orang;
    
    public KaryawanController(FormKaryawan formKaryawan){
    this.formKaryawan  = formKaryawan;
    karyawanDao = new KaryawanDaoImpl();
    }
    
    
}

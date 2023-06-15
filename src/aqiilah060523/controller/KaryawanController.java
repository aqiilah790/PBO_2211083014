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
//import java.util.*;
import javax.swing.table.DefaultTableModel;

public class KaryawanController {
    private FormKaryawan form;
    private KaryawanDao karyawanDao;
    private Karyawan karyawan;
    
    public KaryawanController(FormKaryawan form){
    this.form  = form;
    karyawanDao = new KaryawanDaoImpl();
    }
    
    public void cls(){
        form.getTxtNama().setText("");
        form.getTxtAlamat().setText("");
        form.getCboStatus().setSelectedItem("");
        form.getTxtNip().setText("");
        form.getCboGolongan().setSelectedItem("");
        form.getTxtJabatan().setText("");
        form.getTxtJumlahanak().setText("");
    }
    
    public void saveKaryawan(){
        karyawan = new Karyawan();
        karyawan.setNama(form.getTxtNama().getText());
        karyawan.setAlamat(form.getTxtAlamat().getText());
        karyawan.setStatus(form.getCboStatus().getSelectedItem().toString());
        karyawan.setNip(form.getTxtNip().getText());
        karyawan.setGolongan(form.getCboGolongan().getSelectedItem().toString());
        karyawan.setJabatan(form.getTxtJabatan().getText());
        karyawan.setJumlahanak(Integer.parseInt(form.getTxtJumlahanak().getText()));
        karyawanDao.insert(karyawan);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
    }
    
    public void getKaryawan(){
        int index = form.getTblKaryawan().getSelectedRow();
        karyawan = karyawanDao.getKaryawan(index);
        if(karyawan != null){
            form.getTxtNama().setText(karyawan.getNama());
            form.getTxtAlamat().setText(karyawan.getAlamat());
            form.getCboStatus().setSelectedItem(karyawan.getStatus());
            form.getTxtNip().setText(karyawan.getNip());
            form.getCboGolongan().setSelectedItem(karyawan.getGolongan());
            form.getTxtJabatan().setText(karyawan.getJabatan());
            form.getTxtJumlahanak().setText(Integer.toString(karyawan.getJumlahanak()));
        }
    }
    
    public void updateKaryawan(){
        int index = form.getTblKaryawan().getSelectedRow();
        karyawan.setNama(form.getTxtNama().getText());
        karyawan.setAlamat(form.getTxtAlamat().getText());
        karyawan.setStatus(form.getCboStatus().getSelectedItem().toString());
        karyawan.setNip(form.getTxtNip().getText());
        karyawan.setGolongan(form.getCboGolongan().getSelectedItem().toString());
        karyawan.setJabatan(form.getTxtJabatan().getText());
        karyawan.setJumlahanak(Integer.parseInt(form.getTxtJumlahanak().getText()));
        karyawanDao.update(index, karyawan);
        javax.swing.JOptionPane.showMessageDialog(form, "Update Ok");
    }

    public void deleteKaryawan(){
        int index = form.getTblKaryawan().getSelectedRow();
        karyawanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(form, "Delete Ok");
    }

    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) form.getTblKaryawan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Karyawan> list = karyawanDao.getAll();
        for(Karyawan karyawan : list){
            Object[] data = {
                karyawan.getNama(),
                karyawan.getAlamat(),
                karyawan.getStatus(),
                karyawan.getNip(),
                karyawan.getGolongan(),
                karyawan.getJabatan(),
                karyawan.getJumlahanak()
            };
            tabelModel.addRow(data); 
        }
    }
}

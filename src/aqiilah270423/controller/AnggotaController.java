/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah270423.controller;

/**
 *
 * @author User
 */
import aqiilah270423.view.FormAnggota2;
import aqiilah270423.model.*;
import javax.swing.table.DefaultTableModel;

public class AnggotaController {
    private FormAnggota2 formAnggota;
    private AnggotaDao2 anggotaDao;
    private Anggota2 anggota;
    
    public AnggotaController(FormAnggota2 formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImpl2();
    }
    
    public void bersihForm(){
        formAnggota.getTxtNobp().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    
    public void saveAnggota(){
        anggota = new Anggota2();
        anggota.setNobp(formAnggota.getTxtNobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        javax.swing.JOptionPane.showMessageDialog(formAnggota, "Entri Ok");
    }
    
    public void getAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota != null){
            formAnggota.getTxtNobp().setText(anggota.getNobp());
            formAnggota.getTxtNama().setText(anggota.getNama());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
        }
    }
    
    public void updateAnggota(){
         int index = formAnggota.getTblAnggota().getSelectedRow();
         anggota.setNobp(formAnggota.getTxtNobp().getText());
         anggota.setNama(formAnggota.getTxtNama().getText());
         anggota.setAlamat(formAnggota.getTxtAlamat().getText());
         anggotaDao.update(index, anggota);
         javax.swing.JOptionPane.showMessageDialog(formAnggota, "Update Ok");
    }
    
    public void deleteAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formAnggota, "Delete Ok");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Anggota2> list = anggotaDao.getAll();
        for(Anggota2 anggota : list){
            Object[] data = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat()
            };
            tabelModel.addRow(data); 
        }
    }
}

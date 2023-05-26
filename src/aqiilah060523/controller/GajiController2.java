/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah060523.controller;
import aqiilah060523.view.FormGaji2;
import aqiilah060523.model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author User
 */
public class GajiController2 {
    private Gaji2 gaji;
    private GajiDao2 gajiDao;
    private PegawaiDaoImpl pegawaiDao;
    private FormGaji2 form;
    
    private Pegawai pegawai;
    
    
    public GajiController2(FormGaji2 form){
        this.form = form;
        gajiDao = new GajiDaoImpl2();
        pegawaiDao = new PegawaiDaoImpl();
        
    }
    public void bersihForm(){
        form.getTxtGolongan().setText("");
        form.getTxtTanggal().setText("");
    }
    
    public void isiCombo(){
        List<Pegawai> listPegawai = pegawaiDao.getAll();
        form.getCboNip().removeAllItems();
        
        //isi
        for(Pegawai pegawai : listPegawai){
            form.getCboNip().addItem(pegawai.getNip());
        }
        
    }
    public void insertGaji(){
        gaji = new Gaji2();
        gaji.setPegawai(pegawaiDao.getPegawai(form.getCboNip().getSelectedIndex()));
        gaji.setGolongan(form.getTxtGolongan().getText());
        gaji.setTanggal(Integer.parseInt(form.getTxtTanggal().getText()));
        gajiDao.insert(gaji);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
        
        
    }
    
    public void getGaji2(){
        int index = form.getTblGaji().getSelectedRow();
        gaji = gajiDao.getGaji2(index);
        if(gaji != null){
            form.getCboNip().setSelectedItem(gaji.getPegawai().getNip());
            form.getTxtGolongan().setText(gaji.getGolongan());
            form.getTxtTanggal().setText(Integer.toString(gaji.getTanggal()));
        }
        
    }
    
    public void updateGaji2(){
        int idx = form.getTblGaji().getSelectedRow();
        gaji.setPegawai(pegawaiDao.getPegawai(form.getCboNip().getSelectedIndex()));
        gaji.setGolongan(form.getTxtGolongan().getText());
        gaji.setTanggal(Integer.parseInt(form.getTxtTanggal().getText()));
        gajiDao.update(idx,gaji);
        
    }
    
    
    public void deletePeminjaman(){
        int idx = form.getTblGaji().getSelectedRow();
        gajiDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Deleted");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) form.getTblGaji().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Gaji2> list = gajiDao.getAll();
        for(Gaji2 gaji : list){
            Object[] daftarGaji2 = {
                gaji.getPegawai().getNip(),
                gaji.getGolongan(),
                gaji.getTanggal()
            };
            tabelModel.addRow(daftarGaji2); 
        }
    }
}


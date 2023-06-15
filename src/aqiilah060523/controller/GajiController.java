/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah060523.controller;
import aqiilah060523.model.Gaji;
import aqiilah060523.model.GajiDaoImpl;
import aqiilah060523.model.Karyawan;
import aqiilah060523.model.KaryawanDao;
import aqiilah060523.model.KaryawanDaoImpl;
import aqiilah060523.view.FormGaji;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class GajiController {
    private Gaji gaji;
    private GajiDaoImpl gajiDao;
    private KaryawanDao karyawanDao;
    private FormGaji form;
    
    
    
    public GajiController(FormGaji form){
        this.form = form;
        gajiDao = new GajiDaoImpl();
        karyawanDao = new KaryawanDaoImpl();
        
    }
    public void bersihForm(){
        form.getTxtBulan().setText("");
        form.getCboNip().setSelectedIndex(0);
        form.getTxtTahun().setText("");
    }
    
    public void isiCombo(){
        List<Karyawan> listKaryawan = karyawanDao.getAll();
        form.getCboNip().removeAllItems();
        
        //isi
        for(Karyawan karyawan : listKaryawan){
            form.getCboNip().addItem(karyawan.getNip());
        }
        
    }
    
    private String formatRupiah(Double value) {
        DecimalFormat formmater = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols simbol = formmater.getDecimalFormatSymbols();

        simbol.setCurrencySymbol("Rp. ");
        simbol.setMonetaryDecimalSeparator(',');
        simbol.setGroupingSeparator('.');
        formmater.setDecimalFormatSymbols(simbol);
        return formmater.format(value);
    }
    
    public void insertGaji(){
        gaji = new Gaji();
        gaji.setKaryawan(karyawanDao.getKaryawan(form.getCboNip().getSelectedIndex()));
        gaji.setMonths(Integer.parseInt(form.getTxtBulan().getText()));
        gaji.setYear(Integer.parseInt(form.getTxtTahun().getText()));
        gajiDao.insert(gaji);
        javax.swing.JOptionPane.showMessageDialog(form, "Entri Ok");
        
        
    }
    
    public void getGaji(){
        int index = form.getTblGaji().getSelectedRow();
        gaji = gajiDao.getGaji(index);
        if(gaji != null){
            form.getCboNip().setSelectedItem(gaji.getKaryawan().getNip());
            form.getTxtBulan().setText(Integer.toString(gaji.getMonths()));
            form.getTxtTahun().setText(Integer.toString(gaji.getYear()));
        }
        
    }
    
    public void updateGaji(){
        int idx = form.getTblGaji().getSelectedRow();
        gaji.setKaryawan(karyawanDao.getKaryawan(form.getCboNip().getSelectedIndex()));
        gaji.setMonths(Integer.parseInt(form.getTxtBulan().getText()));
        gaji.setYear(Integer.parseInt(form.getTxtTahun().getText()));
        gajiDao.update(idx,gaji);
        javax.swing.JOptionPane.showMessageDialog(form, "Update Ok");
        
    }
    
    
    public void deleteGaji(){
        int idx = form.getTblGaji().getSelectedRow();
        gajiDao.delete(idx);
        javax.swing.JOptionPane.showMessageDialog(form, "Delete ok");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) form.getTblGaji().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Gaji> list = gajiDao.getAll();
        for(Gaji gaji : list){
            Object[] daftarGaji = {
                gaji.getKaryawan().getNip(),
                gaji.getMonths(),
                gaji.getYear(),
                    this.formatRupiah(gaji.getGajipokok()),
                    this.formatRupiah(gaji.getTunjangananak()),
                    this.formatRupiah(gaji.getTunjanganistri()),
                    this.formatRupiah(gaji.getTotalgaji())
            };
            tabelModel.addRow(daftarGaji); 
        }
    }
}

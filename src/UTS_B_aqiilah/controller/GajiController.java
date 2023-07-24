/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B_aqiilah.controller;
import UTS_B_aqiilah.view.FormGaji;
import UTS_B_aqiilah.model.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
/**
 *
 * @author User
 */
public class GajiController {
    private Gaji gaji;
    private GajiDao gajiDao;
    private PegawaiDao pegawaiDao;
    private FormGaji form;
    
    
    public GajiController(FormGaji form){
        this.form = form;
        gajiDao = new GajiDaoImpl();
        pegawaiDao = new PegawaiDaoImpl();
        
    }
    public void bersihForm(){
        form.getTxtTanggal().setText("");
    }
    
    public void isiCombo(){
        List<Pegawai> listPegawai = pegawaiDao.getAll();
        form.getCboNip().removeAllItems();
        
        //isi
        for(Pegawai pegawai : listPegawai){
            form.getCboNip().addItem(pegawai.getNip());
        }
        
        form.getCbogol().removeAllItems();
        form.getCbogol().addItem("IIIA");
        form.getCbogol().addItem("IIIB");
        form.getCbogol().addItem("IIIC");
        
    }
    public void saveGaji(){
        gaji = new Gaji();
        gaji.setPegawai(pegawaiDao.getPegawai(form.getCboNip().getSelectedIndex()));
        gaji.setGolongan(form.getCbogol().getSelectedItem().toString());
        gaji.setTanggal(form.getTxtTanggal().getText());
        gaji.setTunjangananak();
        gaji.setTunjanganistri();
        gaji.setGajibersih();
        gajiDao.insert(gaji);
        javax.swing.JOptionPane.showMessageDialog(form, "Berhasil ditambahkan");
        
    }
    
    
    public void getGaji(){
        int index = form.getTblGaji().getSelectedRow();
        gaji = gajiDao.getGaji(index);
        if(gaji != null){
            form.getCboNip().setSelectedItem(gaji.getPegawai().getNip());
            form.getCbogol().setSelectedItem(gaji.getGolongan());
            form.getTxtTanggal().setText(gaji.getTanggal());
        }
    }
    
    public void updateGaji(){
        int index = form.getTblGaji().getSelectedRow();
        gaji.setPegawai(pegawaiDao.getPegawai(form.getCboNip().getSelectedIndex()));
        gaji.setGolongan(form.getCbogol().getSelectedItem().toString());
        gaji.setTanggal(form.getTxtTanggal().getText());
        gaji.setGajipokok(gaji.getGolongan());
        gaji.setTunjangananak();
        gaji.setTunjanganistri();
        gaji.setGajibersih();
        gajiDao.update(index,gaji);
        javax.swing.JOptionPane.showMessageDialog(form, "Berhasil diubah");
    }
    
    public void deleteGaji(){
        int index = form.getTblGaji().getSelectedRow();
        gajiDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(form, "Berhasil dihapus");
    }
    
    public void tampilData() {
        DefaultTableModel tabelModel =
                (DefaultTableModel) form.getTblGaji().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Gaji> listGaji = gajiDao.getAll();
        for (Gaji gaji : listGaji) {
            Object[] data = {
                gaji.getPegawai().getNip(),
                gaji.getGolongan(),
                gaji.getTanggal(),
                gaji.getGajipokok(),
                gaji.getTunjangananak(),
                gaji.getTunjanganistri(),
                gaji.getGajibersih()
            };
            tabelModel.addRow(data);
        }
    }
}


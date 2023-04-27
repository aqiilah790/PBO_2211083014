/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah150423.controller;

/**
 *
 * @author User
 */

import aqiilah150423.view.FormPeminjaman;
import aqiilah150423.model.*;
import javax.swing.table.DefaultTableModel;

public class PeminjamanController {
    private FormPeminjaman formPeminjaman;
    private PeminjamanDao peminjamanDao;
    private Peminjaman peminjaman;


public PeminjamanController(FormPeminjaman formPeminjaman){
    this.formPeminjaman = formPeminjaman;
    peminjamanDao = new PeminjamanDaoImpl();
}

    public void bersihForm(){
        formPeminjaman.getTxtNobp().setText("");
        formPeminjaman.getTxtKodebuku().setText("");
        formPeminjaman.getTxtTglpinjam().setText("");
        formPeminjaman.getTxtTglkembali().setText("");
    }

    public void savePeminjaman(){
        peminjaman = new Peminjaman();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setKodebuku(formPeminjaman.getTxtKodebuku().getText());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglkembali().getText());
        peminjamanDao.save(peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Entri Ok");
    }

    public void getPeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman = peminjamanDao.getPeminjaman(index);
        if(peminjaman != null){
            formPeminjaman.getTxtNobp().setText(peminjaman.getNobp());
            formPeminjaman.getTxtKodebuku().setText(peminjaman.getKodebuku());
            formPeminjaman.getTxtTglpinjam().setText(peminjaman.getTglpinjam());
            formPeminjaman.getTxtTglkembali().setText(peminjaman.getTglkembali());
            //formPeminjaman.getTxtTahun().setText(Integer.toString(buku.getTahun()));
        }
    }   

    public void updatePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjaman.setNobp(formPeminjaman.getTxtNobp().getText());
        peminjaman.setKodebuku(formPeminjaman.getTxtKodebuku().getText());
        peminjaman.setTglpinjam(formPeminjaman.getTxtTglpinjam().getText());
        peminjaman.setTglkembali(formPeminjaman.getTxtTglkembali().getText());
        //peminjaman.setTahun(Integer.parseInt(formBuku.getTxtTahun().getText()));
        peminjamanDao.update(index, peminjaman);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Update Ok");
    }

    public void deletePeminjaman(){
        int index = formPeminjaman.getTblPeminjaman().getSelectedRow();
        peminjamanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formPeminjaman, "Delete Ok");
    }

    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTblPeminjaman().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Peminjaman> list = peminjamanDao.getAll();
        for(Peminjaman peminjaman : list){
            Object[] daftarPeminjaman = {
                peminjaman.getNobp(),
                peminjaman.getKodebuku(),
                peminjaman.getTglpinjam(),
                peminjaman.getTglkembali()
            };
            tabelModel.addRow(daftarPeminjaman); 
        }
    }
}

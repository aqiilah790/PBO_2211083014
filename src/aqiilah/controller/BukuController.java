/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah.controller;
import aqiilah.model.*;
import aqiilah.dao.*;
import aqiilah.db.*;
import aqiilah.view.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import javax.swing.JOptionPane;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author User
 */
public class BukuController {
    FormBuku view;
    Buku buku;
    Bukudao dao;
    Connection connection;
    
    public BukuController(FormBuku view) {
        try {
            this.view = view;
            connection = DbHelper.getConnection();
            dao = new BukudaoImpl(connection);
        } catch (SQLException ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cls(){
        view.getTxtKodebuku().setText("");
        view.getTxtJudulbuku().setText("");
        view.getTxtPengarang().setText("");
        view.getTxtPenerbit().setText("");
    }
    
    public void tampil(){
        try {
             DefaultTableModel tabelModel = (DefaultTableModel) view.getTblBuku().getModel();
             tabelModel.setRowCount(0);
             List<Buku> list = dao.getAll();
             for(Buku a : list){
                 Object[]row = {
                     a.getKodebuku(),
                     a.getJudulbuku(),
                     a.getPengarang(),
                     a.getPenerbit()
                 };
                 tabelModel.addRow(row);
             }
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void insert(){
        try {
            buku = new Buku();
            buku.setKodebuku(view.getTxtKodebuku().getText());
            buku.setJudulbuku(view.getTxtJudulbuku().getText());
            buku.setPengarang(view.getTxtPengarang().getText());
            buku.setPenerbit(view.getTxtPenerbit().getText());
            dao.insert(buku);
            JOptionPane.showMessageDialog(view, "tambah data ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void delete(){
        try {
            dao.delete(buku);
            JOptionPane.showMessageDialog(view, "Delete Data Ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public void tabelKlik(){
        try {
            String kodebuku = view.getTblBuku().getValueAt(view.getTblBuku().getSelectedRow(),0).toString();
            buku = dao.getBuku(kodebuku);
            view.getTxtKodebuku().setText(buku.getKodebuku());
            view.getTxtJudulbuku().setText(buku.getJudulbuku());
            view.getTxtPengarang().setText(buku.getPengarang());
            view.getTxtPenerbit().setText(buku.getPenerbit());
        } catch (Exception ex) {
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    public void update(){
        try {
            buku.setKodebuku(view.getTxtKodebuku().getText());
            buku.setJudulbuku(view.getTxtJudulbuku().getText());
            buku.setPengarang(view.getTxtPengarang().getText());
            buku.setPenerbit(view.getTxtPenerbit().getText());
            dao.update(buku);
            JOptionPane.showMessageDialog(view,"update data ok");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(view, ex.getMessage());
            Logger.getLogger(BukuController.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
        
    
}


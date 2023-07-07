/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah.dao;

import aqiilah.model.Buku;
import java.sql.*;
import java.util.*;
/**
 *
 * @author User
 */
public class BukudaoImpl implements Bukudao {
    private Connection connection;
    
    public BukudaoImpl(Connection connection){
        this.connection = connection;   
    }
    
    public void insert(Buku buku) throws Exception{
        String sql = "insert into buku values(?,?,?,?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.executeUpdate();
        ps.close();
    }
    
    public void update(Buku buku) throws Exception {
        String sql = "UPDATE buku SET kodebuku = ?, judulbuku=?, pengarang=?, penerbit=? WHERE kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.setString(2, buku.getJudulbuku());
        ps.setString(3, buku.getPengarang());
        ps.setString(4, buku.getPenerbit());
        ps.setString(5, buku.getKodebuku());
        
        ps.executeUpdate();
        //ps.close(); 
    }
    
    public void delete(Buku buku) throws Exception {
        String sql = "DELETE FROM buku WHERE kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, buku.getKodebuku());
        ps.executeUpdate();
        ps.close(); 
    }
    
    public Buku getBuku(String kodebuku) throws Exception {
        String sql = "SELECT * FROM buku WHERE kodebuku =?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, kodebuku);
        ResultSet rs = ps.executeQuery();
        Buku buku = null;
        if(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
        }
        return buku;
    }
    
    public List<Buku> getAll() throws Exception {
        String sql = "Select * FROM buku";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        Buku buku;
        List<Buku> list = new ArrayList<>();
        while(rs.next()){
            buku = new Buku();
            buku.setKodebuku(rs.getString(1));
            buku.setJudulbuku(rs.getString(2));
            buku.setPengarang(rs.getString(3));
            buku.setPenerbit(rs.getString(4));
            list.add(buku);
        }
        return list;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah060523.model;

/**
 *
 * @author User
 */
public class Orang {
    protected String nama;
    protected String alamat;
    protected String statusnikah;
    
    public Orang(){
    }
    
    public Orang (String nama, String alamat, String statusnikah){
        this.nama = nama;
        this.alamat = alamat;
        this.statusnikah = statusnikah;
    }
    public String getNama(){
        return nama;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public String getStatus(){
        return statusnikah;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;    
    }
    
    public void setStatus(String statusnikah){
        this.statusnikah = statusnikah;    
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah060523.model;

/**
 *
 * @author User
 */
public class Karyawan extends Orang {
    private String nip;
    private String golongan;
    private String jabatan;
    private int jumlahanak;
    
        
    public Karyawan(String nip, String golongan, String jabatan, int jumlahanak) {
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.jumlahanak = jumlahanak;
    }
        
    public Karyawan(String nama, String alamat, String statusnikah, String nip, String golongan, String jabatan, int jumlahanak){
        super(nama,alamat,statusnikah);
        this.nip = nip;
        this.golongan = golongan;
        this.jabatan = jabatan;
        this.jumlahanak = jumlahanak;
        
    }
    
    public Karyawan(){
        
    }

    public String getNip(){
        return nip;
    }
        
    public String getGolongan(){
        return golongan;
    }
    
    public String getJabatan(){
        return jabatan;
    }
    
    public int getJumlahanak(){
        return jumlahanak;
    }

    public void setNip(String nip){
        this.nip = nip;
    }
    
    public void setGolongan(String golongan){
        this.golongan = golongan;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public void setJumlahanak(int jumlahanak){
        this.jumlahanak = jumlahanak;
    }
}
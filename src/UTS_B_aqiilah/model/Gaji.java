/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_B_aqiilah.model;

/**
 *
 * @author User
 */
public class Gaji {
    private Pegawai pegawai;
    private String golongan;
    private int tanggal;
    private double gajipokok;
    private double tunjangananak;
    private double tunjanganistri;
    
    public Gaji(){}
    
    public Gaji(Pegawai pegawai, String golongan, int tanggal){
        this.pegawai = pegawai;
        this.golongan = golongan;
        this.tanggal = tanggal;
    }
    
    public Pegawai getPegawai(){
        return pegawai;
    }
    
    public String getGolongan(){
        return golongan;
    }
    
    public int getTanggal(){
        return tanggal;
    }
    
    public double getGajipokok(){
        return gajipokok;
    } 
    
    public double getTunjangananak(){
        return tunjangananak;
    }
    
    public double getTunjanganistri(){
        return tunjanganistri;
    }
    
    public void setPegawai(Pegawai pegawai){
        this.pegawai = pegawai;
    }
    
    public void setGolongan(String golongan, double gajipokok){
        String IIIA = null;
        String IIIB = null;
        String IIIC = null;
        if(golongan == IIIA){
            gajipokok = 1000000;
        }else if(golongan == IIIB){
            gajipokok = 2000000;
        }else if(golongan == IIIC){
            gajipokok = 3000000;
        }
    }
    
    public void setTanggal(int tanggal){
        this.tanggal = tanggal;
    }
    
    public void setGajipokok(double gajibersih, double gajipokok, double tunjangananak, double tunjananistri){
        gajibersih = gajipokok + tunjangananak + tunjanganistri;
        this.gajipokok = gajipokok;
    }
    
    public void setTunjangananak(double tunjangananak, double gajipokok){
        tunjangananak = gajipokok * 5/100;
        this.tunjangananak = tunjangananak;
    }
    
    public void setTunjanganistri(double tunjanganistri, double gajipokok){
        tunjanganistri = gajipokok * 5/100;
        this.tunjanganistri = tunjanganistri;
    }
}

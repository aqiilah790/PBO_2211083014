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
    private String tanggal;
    private double gajipokok;
    private double tunjangananak;
    private double tunjanganistri;
    private double gajibersih;
    
    public Gaji(){}
    
    public Gaji(Pegawai pegawai, String golongan, String tanggal){
        this.pegawai = pegawai;
        this.golongan = golongan;
        this.tanggal = tanggal;
        setGajipokok(golongan);
        setTunjangananak();
        setTunjanganistri();
        setGajibersih();
        
    }
    
    public Pegawai getPegawai(){
        return pegawai;
    }
    
    public String getGolongan(){
        return golongan;
    }
    
    public String getTanggal(){
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
    
    public double getGajibersih(){
        return gajibersih;
    }
    
    public void setPegawai(Pegawai pegawai){
        this.pegawai = pegawai;
    }
    
    public void setGolongan(String golongan){
        this.golongan = golongan;
    }
    
    public void setTanggal(String tanggal){
        this.tanggal = tanggal;
    }
    
    public void setGajipokok(String golongan){
       if(golongan.equals("IIIA")){
            gajipokok = 1000000;
        }
        else if(golongan.equals("IIIB")){
            gajipokok = 2000000;
        }
        else if(golongan.equals("IIIC")){
            gajipokok = 3000000;
        }
        else{
            gajipokok =0;
            System.out.println("Error!!! Golongan tidak valid");
        }
    }
    
    public void setTunjangananak(){
        tunjangananak = gajipokok * 5/100;
        this.tunjangananak = tunjangananak;
    }
    
    public void setTunjanganistri(){
        tunjanganistri = gajipokok * 5/100;
        this.tunjanganistri = tunjanganistri;
    }
    
    public void setGajibersih(){
        gajibersih = gajipokok + tunjangananak + tunjanganistri;
        this.gajibersih = gajibersih;
    }
}

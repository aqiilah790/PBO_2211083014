/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah060523.model;

/**
 *
 * @author User
 */
public class Gaji {
    private Karyawan karyawan;
    private int months;
    private int year;
    private double gajipokok;
    private double tunjangananak;
    private double tunjanganistri;
    private double totalgaji;
    
    public Gaji(){
    
    }
    
    public Gaji(Karyawan karyawan, int months, int year){
        this.karyawan = karyawan;
        this.months = months;
        this.year = year;
        setTotalgaji();
    }
    
    public Karyawan getKaryawan(){
        return karyawan;
    }
    
    public Double getGajipokok(){
        return gajipokok;
    }
    
    public Double getTunjangananak(){
        return tunjangananak;
    }
    
    public Double getTunjanganistri(){
        return tunjanganistri;
    }
    
    public Double getTotalgaji(){
        return totalgaji;
    }
    
    public void setKaryawan(Karyawan karyawan){
        this.karyawan = karyawan;
    }
    
    public void setMonths(int months){
        this.months = months;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void setMonths(int months){
        this.months = months;
    }
}

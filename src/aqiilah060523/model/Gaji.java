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

    public Karyawan getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Karyawan karyawan) {
        this.karyawan = karyawan;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGajipokok() {
        if (karyawan.getGolongan().equals("A")) {
            gajipokok = 5000000;
        } else if (karyawan.getGolongan().equals("B")) {
            gajipokok = 4000000;
        } else if (karyawan.getGolongan().equals("C")) {
            gajipokok = 3000000;
        } else if (karyawan.getGolongan().equals("D")) {
            gajipokok = 2000000;
        } else {
            gajipokok = 0;
        }
        return gajipokok;
    }

    public void setGajipokok(double gajipokok) {
        this.gajipokok = (gajipokok + tunjangananak + tunjanganistri);
    }

    public double getTunjangananak() {
        if (karyawan.getStatus().equals("Single")) {
            tunjangananak = 0;
        } else {
            tunjangananak = (0.2 * gajipokok * karyawan.getJumlahanak());
        }
        return tunjangananak;
    }

    public void setTunjangananak(double tunjangananak) {
        this.tunjangananak = tunjangananak;
    }

    public double getTunjanganistri() {
        if (karyawan.getStatus().equals("Single")) {
            tunjanganistri = 0;
        } else {
            tunjanganistri = (0.2 * gajipokok);
        }
        return tunjanganistri;
    }

    public void setTunjanganistri(double tunjanganistri) {
        this.tunjanganistri = tunjanganistri;
    }

    public double getTotalgaji() {
        return (tunjangananak + tunjanganistri + gajipokok);
    }

    public void setTotalgaji(double totalgaji) {
        this.totalgaji = totalgaji;
    }
    
    public void setTotalgaji() {
        this.totalgaji = tunjangananak + tunjanganistri + gajipokok;
    }

    
    
    
}

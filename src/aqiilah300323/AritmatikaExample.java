/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah300323;

/**
 *
 * @author User
 */
public class AritmatikaExample {
    public static void main(String[] args){
        Aritmatika aritmatika = new Aritmatika();
        boolean hasil = aritmatika.cekGanjil(5);
        int c = aritmatika.tambah(10,5);
        System.out.println("C :"+c);
        System.out.println("Ganjil"+aritmatika.tambah(10,5));
        System.out.println(hasil);
        aritmatika.BilanganGanjil(5);
        aritmatika.BilanganPrima(5);
    }
    
}

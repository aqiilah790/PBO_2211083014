/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah160323;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Latihan643 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka;
        int pangkat;
        int hasil = 1;
        
        System.out.print("masukkan angka : ");
        angka = in.nextInt();
        System.out.print("masukkan pangkat : ");
        pangkat = in.nextInt();
        
        for (int i = 0; i < pangkat; i++) {
            hasil *= angka;
        }
        
        System.out.println("Hasil pangkat dari " + angka + " pangkat " + pangkat + " adalah "+hasil);
    }
}

    


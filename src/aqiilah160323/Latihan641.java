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
public class Latihan641 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka;
        int pangkat;
        int hasil = 1;
        int i = 0;
        
        System.out.print("masukkan angka : ");
        angka = in.nextInt();
        System.out.print("masukkan pangkat : ");
        pangkat = in.nextInt();
        while (i < pangkat) {
            hasil *= angka;
            i++;
        }
        
        System.out.println("Hasil pangkat dari " + angka + " pangkat " + pangkat + " adalah " + hasil);
    }
}



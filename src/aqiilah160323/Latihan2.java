/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah160323;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.IOException; 
import java.io.InputStreamReader;
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args){
    BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
    String kata1, kata2, kata3;
    Scanner sc = new Scanner(System.in);
    
    

        // Meminta pengguna memasukkan tiga kata
        try{
        System.out.println("Masukkan tiga kata:");
        kata1 = sc.nextLine();
        kata2 = sc.nextLine();
        kata3 = sc.nextLine();

        // Menampilkan output ke layar
        System.out.println("Anda memasukkan kata-kata berikut:");
        System.out.print(kata1+" ");
        System.out.print(kata2+" ");
        System.out.print(kata3+" ");
        } catch (Exception ex) {
        }
    }
}


    
    


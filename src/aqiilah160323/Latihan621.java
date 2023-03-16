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
public class Latihan621 {
    public static void main(String[] args) {
        // Membuat objek scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan angka antara 1-10
        System.out.print("Masukkan angka antara 1-10: ");
        int angka = scanner.nextInt();

        // Memeriksa apakah angka yang dimasukkan sesuai
        if (angka >= 1 && angka <= 10) {
            // Mengonversi angka menjadi kata yang sesuai
            String kata;
            switch (angka) {
                case 1:
                    kata = "satu";
                    break;
                case 2:
                    kata = "dua";
                    break;
                case 3:
                    kata = "tiga";
                    break;
                case 4:
                    kata = "empat";
                    break;
                case 5:
                    kata = "lima";
                    break;
                case 6:
                    kata = "enam";
                    break;
                case 7:
                    kata = "tujuh";
                    break;
                case 8:
                    kata = "delapan";
                    break;
                case 9:
                    kata = "sembilan";
                    break;
                case 10:
                    kata = "sepuluh";
                    break;
                default:
                    kata = "";
                    break;
            }

            // Menampilkan kata yang sesuai dengan angka
            System.out.println("Kata yang sesuai dengan angka " + angka + " adalah " + kata);
        } else {
            // Menampilkan pesan "Invalid number" jika angka yang dimasukkan tidak sesuai
            System.out.println("Invalid number");
        }
    }
}



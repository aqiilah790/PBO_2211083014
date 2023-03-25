/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah250323;

/**
 *
 * @author User
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
public class Latihan772 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = new int[10];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog(null, "Masukkan nomor ke-" + (i+1) + ":");
            numbers[i] = Integer.parseInt(input);

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Input terbesar yang telah diberikan pengguna adalah: " + max);
    }
}



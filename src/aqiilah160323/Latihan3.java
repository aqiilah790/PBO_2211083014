/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah160323;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;
public class Latihan3 {
    public static void main(String[] args) {
        String kata1, kata2, kata3 = "";
        
        kata1 = JOptionPane.showInputDialog("kata pertama");
        kata2 = JOptionPane.showInputDialog("kata kedua");
        kata3 = JOptionPane.showInputDialog("kata ketiga");
        
        String msg = "enter word 1 " + kata1 + " " + kata2 + " " + kata3 + " " + "!";
        
        JOptionPane.showMessageDialog(null, msg);

        
        
        
    }
    
}

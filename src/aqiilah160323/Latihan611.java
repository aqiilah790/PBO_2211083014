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
import java.io.InputStreamReader;
import java.io.IOException; 

public class Latihan611{
    public static void main(String[] args){
    BufferedReader dataIn = new BufferedReader (new InputStreamReader(System.in));
    int nilai1 ;
    int nilai2 ;
    int nilai3 ;
    float avg;
    
    
    try{
        System.out.print("Entri nilai pertama anda : ");
        nilai1 = Integer.parseInt(dataIn.readLine());
        System.out.print("Entri nilai kedua anda : ");
        nilai2 = Integer.parseInt(dataIn.readLine());
        System.out.print("Entri nilai ketiga anda : ");
        nilai3 = Integer.parseInt(dataIn.readLine());
        
        avg = (nilai1+nilai2+nilai3)/3;
        System.out.print("nilai rata-rata : "+avg+" ");
        
        if(avg > 60){
            System.out.println(":-)");
        }else { // nilai < 60
            System.out.println(":-(");
        }
        
    
    } catch (Exception ex) { 
    }
    }
}
    


    
    
    


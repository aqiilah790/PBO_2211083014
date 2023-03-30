/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah300323;

/**
 *
 * @author User
 */
public class CastingExplisit {
    public static void main( String[] args ){
        /*char valChar = 'a';
        int valInt = valChar;
            System.out.print( valInt ); //casting explisit: keluaran 65*/
        double valDouble = 10.12;
        int valInt = (int)valDouble; //men-convert valDouble ke tipe int
        double x = 10.2;
        int y = 2;
        int result = (int)(x/y); //hasil typecast operasi ke int 
            System.out.print((int)(x/y));
    }
}

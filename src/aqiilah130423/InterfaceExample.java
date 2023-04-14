/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah130423;

/**
 *
 * @author User
 */
public class InterfaceExample {
    public static void main(String[] args){
        Relation myInteger = new MyInteger();
        Relation myDouble = new MyDouble();
        
        
        System.out.println(" 10 and 11" +myInteger.isEqual(10,11));
        System.out.println(" 10 and 11" +myDouble.isEqual(10.4,11.6));
        
        
        
        
        
        
    }
}

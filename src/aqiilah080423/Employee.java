/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah080423;

/**
 *
 * @author User
 */
public class Employee extends Person {
    
    public Employee(){
        super("Ali", "Padang");
        System.out.println("Inside Student:Constructor");
    }
    
    public static void main(String[] args){
        Employee emp = new Employee();
        System.out.println("Nama    :"+emp.name);
        System.out.println("Nama    :"+emp.address);
    }
    
}

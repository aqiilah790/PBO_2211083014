/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah080423;

/**
 *
 * @author User
 */
public class Student extends Person {
    
    public Student(){
        super("Ali", "Padang");
        System.out.println("Inside Student:Constructor");
    }
    
    public static void main(String[] args){
        Student student = new Student();
        System.out.println("Nama    :"+student.name);
        System.out.println("Nama    :"+student.address);
    }
}

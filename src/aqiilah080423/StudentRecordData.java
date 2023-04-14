/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah080423;

/**
 *
 * @author User
 */
public class StudentRecordData {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord("John Doe", 17, 11, true);

        System.out.println("Student Record:");
        student.printRecord();

        
        student.setName("Jane Doe");
        student.setAge(18);
        student.setGrade(12);
        student.setMale(false);

        System.out.println("\nNew student record:");
        student.printRecord();
        
        
    }
}


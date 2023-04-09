/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah080423;

/**
 *
 * @author User
 */
public class StudentRecordExample3 { 
    public static void main(String[] args) {
        StudentRecord3 aqiilah = new StudentRecord3("John Doe", "Padang", 19, 80, 80, 70, 0, 'x');
        aqiilah.getHuruf();
        aqiilah.getAverage();
        
        
        System.out.println("Student Record:");
        aqiilah.printRecord();
        aqiilah.setName("aqiil");
        aqiilah.setAddress("Padang");
        aqiilah.setAge(19);
        aqiilah.setMathGrade(90);
        aqiilah.setenglishGrade(90);
        aqiilah.setscienceGrade(70);
        System.out.println();
        
        //menampilkan data
        System.out.println("Biodata aqiil");
        System.out.println("Nama                :" +aqiilah.getName());
        System.out.println("Alamat              :" +aqiilah.getAddress());
        System.out.println("Umur                :" +aqiilah.getAge());
        System.out.println("Nilai rata-rata     :" +aqiilah.getAverage());
        System.out.println("nilai huruf         :" +aqiilah.getHuruf());
        
        
        System.out.println();
        GraduateStudentRecord graduateRecord = new GraduateStudentRecord("John Doe", "123 Main St.", 25, 80, 90, 80, 0, 'x', "The Effects of Climate Change on Coral Reefs", 95);
        graduateRecord.getHuruf();
        graduateRecord.getAverage();
        graduateRecord.printRecord();
    }
}



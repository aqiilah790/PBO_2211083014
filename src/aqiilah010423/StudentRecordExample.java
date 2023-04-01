/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah010423;

/**
 *
 * @author User
 */
public class StudentRecordExample {
    public static void main(String[] args){
        StudentRecord aqiil = new StudentRecord();
        StudentRecord qila = new StudentRecord();
        StudentRecord muhammad = new StudentRecord("muhammad");
        
        //isi data
        aqiil.setName("aqiil");
        aqiil.setAddress("Padang");
        aqiil.setAge(19);
        
        qila.setName("Qila");
        qila.setAddress("Lintau");
        qila.setAge(20);
        
        //menampilkan data
        System.out.println("Biodata aqiil");
        System.out.println("Nama        :" +aqiil.getName());
        System.out.println("Alamat      :" +aqiil.getAddress());
        System.out.println("Umur        :" +aqiil.getAge());
        
        //memanggil method print
        System.out.println("Biodata qila");
        qila.print("");
        qila.print(70, 80, 90);
        
        System.out.println("Biodata muhammad");
        muhammad.print("");
        
        
        //menampilkan jumlah siswa
        System.out.println("Count = "+StudentRecord.getStudentCount());
        
    }
}

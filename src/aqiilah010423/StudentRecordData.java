/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah010423;

/**
 *
 * @author User
 */
public class StudentRecordData {
    public static void main(String[] args){
        StudentRecord2 dataSiswa[] = new StudentRecord2[100];
        StudentRecord2 d1 = new StudentRecord2();
        d1.setName("aqiil");
        d1.setAddress("Padang");
        d1.setAge(19);
        dataSiswa[0] = d1;
        
        dataSiswa[0].setName("aqiil");
        dataSiswa[0].setAddress("Padang");
        dataSiswa[0].setAge(19);
        
        System.out.println("Nama        [0]" + dataSiswa[0].getName());
        
        dataSiswa[0].setName("");
        dataSiswa[0].setAddress("");
        dataSiswa[0].setAge(0);
        
        System.out.println("Nama        [0]" + dataSiswa[0].getName());
    }
}

  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah010423;

/**
 *
 * @author User
 */
public class StudentRecordExample2 {
    public static void main(String[] args){
        StudentRecord2 aqiil = new StudentRecord2();
        StudentRecord2 qila = new StudentRecord2();
        StudentRecord2 muhammad = new StudentRecord2("muhammad");
        
        //isi data
        aqiil.setName("aqiil");
        aqiil.setAddress("Padang");
        aqiil.setAge(19);
        aqiil.setMathGrade(90);
        aqiil.setenglishGrade(90);
        aqiil.setscienceGrade(70);
     
        
        qila.setName("Qila");
        qila.setAddress("Lintau");
        qila.setAge(20);
        qila.setenglishGrade(80);
        qila.setMathGrade(90);
        qila.setscienceGrade(70);
        
        
        //menampilkan data
        System.out.println("Biodata aqiil");
        System.out.println("Nama               :" +aqiil.getName());
        System.out.println("Alamat             :" +aqiil.getAddress());
        System.out.println("Umur               :" +aqiil.getAge());
        System.out.println("Nilai rata-rata    :" +aqiil.getAverage());
        System.out.println("nilai huruf        :" +aqiil.getHuruf());
        
        //memanggil method print
        System.out.println("Biodata qila");
        qila.print("temp");
        qila.print(qila.getMathGrade(),qila.getenglishGrade(),qila.getscienceGrade());
        qila.setAverage(qila.getAverage());
        qila.print(qila.getAverage(), qila.getHuruf());
        
        System.out.println("Biodata muhammad");
        muhammad.print("");
        
        
        //menampilkan jumlah siswa
        System.out.println("Count = "+StudentRecord2.getStudentCount());
        
    }
}

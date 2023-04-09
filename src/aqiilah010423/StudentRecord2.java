/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah010423;

/**
 *
 * @author User
 */
public class StudentRecord2 {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average; 
    private char Huruf;
    
    private static int studentCount;//class variable
    
    public StudentRecord2(){
    //area inisialisasi kode;
        studentCount++;
    }
    public StudentRecord2(String temp){
        this.name = temp;
        studentCount++;
    }
    public StudentRecord2(String name, String address){
        this.name = name;
        this.address = address;
        studentCount++;
    }
    public StudentRecord2(double mGrade, double eGrade, double sGrade){
        mathGrade = mGrade;
        englishGrade = eGrade;
        scienceGrade = sGrade;
        studentCount++;
    } 
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    public double getMathGrade(){
        return mathGrade;
    }
    
    public void setMathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    public double getenglishGrade(){
        return englishGrade;
    }
    
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    public double getscienceGrade(){
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    
     
    public double getAverage(){
        average = (mathGrade + englishGrade + scienceGrade) /3;
        return average;
    }
    
    public void setAverage(double average){
        this.average = average;
    }
   
    
    public static int getStudentCount(){
        return studentCount;
    }
    
     public char getHuruf(){
        if (getAverage() > 80){
            Huruf = 'A';
        }else if(getAverage() > 65){
            Huruf = 'B';
        }else if(getAverage() > 55){
            Huruf = 'C';
        }else if(getAverage() > 40){
            Huruf = 'D';
        }else if(getAverage() > 0){
            Huruf = 'E';   
        }
        return Huruf;
    }
    
    public void print( String temp ){
    System.out.println("Name:" + name);
    System.out.println("Address:" + address);
    System.out.println("Age:" + age);
    }
    public void print(double eGrade, double mGrade, double sGrade){
    //System.out.println("Name:" + name);
    System.out.println("Math Grade      :" + mGrade);
    System.out.println("English Grade   :" + eGrade);
    System.out.println("Science Grade   :" + sGrade);
    }
    
    public void print(double average, char Huruf){
    System.out.println("nilai rata-rata :" + average);
    System.out.println("nilai huruf     :" + Huruf);
    }
} 
    


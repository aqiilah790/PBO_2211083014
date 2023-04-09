/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah080423;

/**
 *
 * @author User
 */

public class GraduateStudentRecord extends StudentRecord3 {
    private String thesisTitle;
    private int thesisDefenseScore;
    
    public GraduateStudentRecord(String name, String address, int age, double mathGrade, double englishGrade, double scienceGrade, double average, char Huruf, String thesisTitle, int thesisDefenseScore) {
        super(name, address, age, mathGrade, englishGrade, scienceGrade, average, Huruf);
        this.thesisTitle = thesisTitle;
        this.thesisDefenseScore = thesisDefenseScore;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    public int getThesisDefenseScore() {
        return thesisDefenseScore;
    }

    public void setThesisDefenseScore(int thesisDefenseScore) {
        this.thesisDefenseScore = thesisDefenseScore;
    }
    
    @Override
    public void printRecord() {
        super.printRecord();
        System.out.println("Thesis Title        :"+thesisTitle);
        System.out.println("Thesis Defense Score:"+thesisDefenseScore);
    }
}



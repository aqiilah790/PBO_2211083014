/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aqiilah080423;

/**
 *
 * @author User
 */
public class Circle extends Shape {
    private double radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "Circle";
    }
    
    public double getRadius() {
        return radius;
    }
}

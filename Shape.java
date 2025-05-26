/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author Lim Joechele
 */
public class Shape {
    protected String name;
    protected double perimeter, area;
    public Shape(String name) {
        this.name = name;
    }
    
    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
    
    public double getPerimeter() {
        return perimeter;
    }
    
    public void setArea(double area) {
        this.area = area;
    }
    
    public double getArea() {
        return area;
    }
    
    public void display() {
        System.out.println("Name: " + name);
        System.out.printf("Perimeter: %.2f%n", perimeter);
        System.out.printf("Area: %.2f%n",area);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;
import java.util.Scanner;
/**
 *
 * @author Lim Joechele
 */
public class Rectangle extends Shape {
    protected double length, width;
    public Rectangle() {
        super("Rectangle");
        input();
        compute();
    }
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = in.nextDouble();
        System.out.print("Enter width: ");
        width = in.nextDouble();
    }
    
    public void compute() {
        this.perimeter = 2*(length + width);
        this.area = length*width;
    }
    
}

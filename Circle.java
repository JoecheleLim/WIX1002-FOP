/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Lim Joechele
 */
public class Circle extends Shape {
    protected double diameter;
    public Circle() {
        super("Circle");
        input();
        compute();
    }
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        diameter = in.nextDouble();
    }
    
    public void compute() {
        this.perimeter = diameter*Math.PI;
        this.area = Math.PI * Math.pow((diameter/2),2);
    }
}

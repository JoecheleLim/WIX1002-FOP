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
public class Square extends Shape {
    protected double length;
    public Square() {
        super("Square");
        input();
        compute();
    }
    
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = in.nextDouble();
    }
    
    public void compute() {
        this.perimeter = 4*length;
        this.area = Math.pow(length,2);
    }
}

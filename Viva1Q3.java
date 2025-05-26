/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
public class Viva1Q3 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter three angles (seperate each angle by space): ");
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();
        
        double sum = angle1 + angle2 + angle3;
        if (sum ==180) {
            System.out.println("The triangle is valid.");
            if (angle1 == 90 || angle2 == 90 || angle3 == 90  )
                System.out.println("It is an right-angled triangle.");
            if (angle1 ==  angle2 && angle2 == angle3) 
            // if(angleA == 60 && angleB == 60 && angleC == 60){
                System.out.println("It is an equilateral triangle.");
            else if (angle1 ==  angle2 || angle2 == angle3 || angle1 ==  angle3)
                System.out.println("It is an isosceles triangle.");
            else 
                System.out.println("It is a scalene triangle.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }   
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.*;
/**
 *
 * @author Lim Joechele
 */
public class L3Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        // radius count from (0,0)?
        System.out.print("Enter x-coordinate: ");
        double x = input.nextDouble();
        System.out.print("Enter y-coordinate: ");
        double y = input.nextDouble();
        
        input.close();
        double distance = Math.sqrt(x*x + y*y);
        
//        if (distance < radius) 
//            System.out.println("The point (" + x + " , " + y + ") is inside the circle");
//        else if (distance == radius)
//            System.out.println("The point (" + x + " , " + y + ") is on the circle");
//        else
//            System.out.println("The point (" + x + " , " + y + ") is outside the circle");
        String result = (distance < radius)? "The point (" + x + " , " + y + ") is inside the circle" : "The point (" + x + " , " + y + ") is outside the circle";
        System.out.println(result);
            
    }
    
}
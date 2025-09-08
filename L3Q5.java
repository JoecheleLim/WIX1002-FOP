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
public class L3Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        System.out.print("Enter c: ");
        int c = input.nextInt();
        System.out.print("Enter d: ");
        int d = input.nextInt();
        System.out.print("Enter e: ");
        int e = input.nextInt();
        System.out.print("Enter f: ");
        int f = input.nextInt();
        
        double x, y;
        
        if ((a*d - b*c)!=0) {
            x = (e*d-b*f)/(a*d-b*c);
            y = (a*f-e*c)/(a*d-b*c);
            
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        } else
            System.out.println("The equation has no solution.");
    }
    
}
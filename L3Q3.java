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
public class L3Q3 {

    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter sales volume: ");
        double sale = input.nextDouble();
        double commn;
        if (sale <= 100)
            commn = sale * 0.05;
        else if (sale > 100 && sale <= 500)
            commn = sale * 0.075;
        else if (sale > 500 && sale <= 1000)
            commn = sale * 0.10;
        else 
            commn = sale * 0.125;
        System.out.printf("Commission: RM %.2f%n", commn);
    }
    
}


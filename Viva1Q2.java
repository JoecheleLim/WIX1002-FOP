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
public class Viva1Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input range start and end
        System.out.print("Enter the starting value: ");
        int startValue = input.nextInt();
        System.out.print("Enter the ending value: ");
        int finValue = input.nextInt();
        
        System.out.println("\nThe output is: ");
        for (int i = startValue; i <= finValue; i++) {
            if (i % 3 == 0 && i%5 ==0) {
                System.out.println("LuluLala"); // A multiple of both 3 and 5 
            } else if (i%3 == 0) {
                System.out.println("Lulu"); // A multiple of 3 only
            } else if (i%5 == 0) {
                System.out.println("Lala"); // A multiple of 5 only
            } else 
                System.out.println(i); // Not a multiple of 3 and 5
        }
        
        input.close();
    }
    
}

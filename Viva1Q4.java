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
public class Viva1Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Please input a positive integer: ");
        while(true){ // To check the input whether is valid or not
            if (input.hasNextInt()) { // check if the input is integer
                num = input.nextInt();  
                if (num > 0) {
                    // Valid input; break the loop
                    break; 
                } else
                    System.out.print("Invalid input. Please re-input a valid +ve integer: ");
            } else {
                System.out.print("Invalid input. Please re-input a valid +ve integer: ");
                input.next(); // Clear invalid input
            }
        }
        input.close();
        
        System.out.println("you've inputed a valid integer!");
        if (num % 2 == 0) 
            System.out.println("The integer is even!");
        else
            System.out.println("The integer is odd!");
    }
    
}


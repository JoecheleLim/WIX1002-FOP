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
public class Viva1Q5 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Please enter a positive integer: ");
            String integer = input.next();

            int length = integer.length();
            
            // To calculate no. of digit group 
            int sumGroup = 1;
            for (int i=1; i < length; i++){
                if (integer.charAt(i) != integer.charAt(i-1)) {
                    sumGroup ++;
                }
            }
            
            
            // To calculate longest group and its length
            int maxLength = 1,currentLength = 1;
            char maxGroupDigit = integer.charAt(0);
            for (int j = 1; j < length; j++) {
                
                if (integer.charAt(j) == integer.charAt(j-1)) {
                    currentLength++;
                }
              
                
                // Update longest group
                if (currentLength > maxLength) {
                     maxGroupDigit = integer.charAt(j);
                     maxLength = currentLength;
                }
                
                // Reset currentLength for a new group
                if (integer.charAt(j) != integer.charAt(j-1))
                    currentLength = 1;
            }
            
            System.out.println("The total number of digit groups: " + sumGroup);
            System.out.println("The digit forming the longest group and its length: " + maxGroupDigit + "  " + maxLength);
            System.out.println("The sum of the length of all digit groups: " + length);
            
            input.close();

    }
    
}


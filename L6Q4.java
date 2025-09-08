/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
public class L6Q4 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter two numbers: ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
                
            System.out.println("GCD (" + num1 + "," + num2 + ") = " + GCD(num1,num2));
    }
    
        public static int GCD(int a, int b) { // a is bigger than b
            if (b == 0) 
                return a;
            
            return GCD(b, a%b); 
        }
}


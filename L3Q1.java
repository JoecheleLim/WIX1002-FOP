/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.*;
/**
 *
 * @author Lim Joechele
 */
public class L3Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integer number: ");
        int int1 = input.nextInt();
        int int2 = input.nextInt();
        System.out.print("Enter the operand: ");
        char operand = input.next().charAt(0); 
        // char operand = input.next();
        // operand.charAt(0);
        
//        switch (operand) {
//            case '+':
//                System.out.println(int1 + " + " + int2 + " = " + (int1+int2));
//                break;
//            case '-':
//                System.out.println(int1 + " - " + int2 + " = " + (int1-int2));
//                break;
//            case '*':
//                System.out.println(int1 + " * " + int2 + " = " + (int1*int2));
//                break;
//            case '/':
//                if (int2 != 0) {
//                    System.out.println(int1 + " / " + int2 + " = " + (int1/int2));
//                }
//                break;
//            case '%':
//                if (int2 != 0){
//                    System.out.println(int1 + " % " + int2 + " = " + (int1%int2));
//                }
//                break;
//            default:
//                System.out.println("Error: Invalid operation or value.");
//        }
        float result = switch (operand) {
            case '+' -> int1 + int2;
            case '-' -> int1 - int2;
            case '*' -> int1 * int2;
            case '/' -> int1 / int2;
            case '%' -> int1 % int2;
            default -> 0;
        };
          
        System.out.printf("%d %c %d is %f%n", int1, operand, int2, result);
        
    }
    
}

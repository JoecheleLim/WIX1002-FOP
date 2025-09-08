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
public class L6Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to copy: ");
        char ch = input.next().charAt(0);
        System.out.print("Enter height of triangle: ");
        int heightT = input.nextInt();
        System.out.print("Enter height of diamond: ");
        int heightD = input.nextInt();
        
        printTriangle(heightT, ch);
        printDiamond(heightD, ch);
        
        input.close();
    }
    
    public static void multiPrint(int n, char c) {
        for(int i = 0; i < n; i++) {
            System.out.print(c);
        }
    }
    
    static void printTriangle(int height, char c){
        for(int i = 1; i <= height; i++) {
            multiPrint(height-i, ' '); // Space be4 character
            multiPrint(2*i-1, c); // Number of character to be print
            System.out.println(); // move to next line

        }
    }
    
    static void printDiamond(int height, char c) {
        // top of diamond
        for(int i = 1; i <=height; i++) {
            multiPrint(height-i, ' '); // Space be4 character
            multiPrint(2*i-1, c); // Number of character to be print
            System.out.println(); // move to next line
        }
        
        // end of diamond
        for(int i = height-1; i>0; i--) {
            multiPrint(height-i, ' ');
            multiPrint(2*i-1, c);
            System.out.println(); // move to next line
        }
    }
}


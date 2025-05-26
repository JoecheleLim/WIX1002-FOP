/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
public class Viva2Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int number = input.nextInt();
        System.out.print("Enter width: ");
        int width = input.nextInt();
        
        char[] result = format(number, width);
        
        System.out.print("Value according width: ");
        for(char ch : result) {
            System.out.print(ch);
        }
        
        input.close();
    }
    
    public static char[] format(int number, int width) { // return char[] or String
        int padding;
        char[] result;
        // Convert int to string to char array
        char[] num = Integer.toString(number).toCharArray(); 
        
        // size based on larger length
        if (num.length > width) {
            return num;
        } else {
            result = new char[width];
        }
        
        // Calculate the array[index] with '0'
        padding = width - num.length; 
        for(int i=0; i < padding; i++) {
            result[i] ='0';
        }
        
        
        for(int i=0; i < num.length; i++) {
            result[padding + i] = num[i]; // padding + i because index start from 0
        }
        
        return result;
    }
}

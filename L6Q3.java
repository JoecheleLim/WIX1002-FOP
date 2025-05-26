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
public class L6Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] integer = new int[10];
        for(int i=0; i<integer.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            integer[i] = input.nextInt();
        }
        
        int[] reverseArray = Reverse(integer);
        for(int j: reverseArray) {
            System.out.print(j);
        }
        input.close();
    }
    
    public static int[] Reverse(int[] integer) {
        int[] reverse = new int[10];
        for(int i=0; i<reverse.length; i++) {
            reverse[i] = integer[reverse.length-i-1];
        }
        return reverse;
    }
}

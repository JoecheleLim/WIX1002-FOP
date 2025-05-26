/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

import java.util.*;
/**
 *
 * @author Lim Joechele
 */
public class L4Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        int termsum=0,sum=0;
        for(int i=1; i<=num; i++){ // for 1 + (1+2) + (1+2+3) +....
            termsum=0;
            for (int j=1; j<=i; j++) { // for 1+2, 1+2+3, ....
                termsum += j;
            }
            sum += termsum;
        }
        System.out.println("The sum of the series of " + num + ": " + sum);
        input.close();
    }
    
}


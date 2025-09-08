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
public class L4Q6 {

    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt();
        System.out.println("Random number: " + num);
        
        System.out.printf("Number of digits in %d is %d.%n", num, (int)(Math.log10(num)+1)); // like that jiu finish liao
        
        int frequency=0;
        do {
            int leftNum = num / 10;
            num = leftNum;
            frequency++;
        }while (num>0);
        System.out.println("Number of Digits: " + frequency);
        
        
    }
    
}
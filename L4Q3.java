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
public class L4Q3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, min = Integer.MIN_VALUE, max = Integer.MAX_VALUE, frequency = 0;
        double average, variance, sd, sum=0,  x2 = 0;
        double a,b,c;
        do {
            System.out.print("Enter a score [neagative scare to quit]: ");
            num = input.nextInt();
            if (num<0)
                break;
            frequency ++;
            sum += num;
            x2 += Math.pow(num,2);
//            if (num<min)
//                min = num;
//            if (num>max)
//                max = num;
           min = Math.min(min,num);
           max = Math.max(max, min);
        } while (num>0);
        
        input.close();
        
        average = sum / frequency;
        
        a = (Math.pow(sum,2))/frequency;
        b = frequency - 1;
        c = x2 - a;
        variance = c/b;
        sd = Math.sqrt(variance);
        
        System.out.println(variance);
        System.out.println("Minimum score: " + min);
        System.out.println("Maximum score: " + max);
        System.out.printf("Average score: %.2f%n", average);
        System.out.printf("Standard deviation: %.2f%n", sd);
    }
    
}
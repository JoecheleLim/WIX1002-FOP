/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

import java.util.Random;
import java.util.Scanner;

public class L5Q1 {

    public static void main(String[] args) {
        Random g = new Random();
        Scanner input = new Scanner(System.in);
        final int MAX = 100;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, sum =0;
               
        System.out.print("Please enter number of students: ");
        int noStu = input.nextInt();
        
        int[] marks = new int[noStu];
        
        System.out.print("The list of score: ");
        for(int i = 0; i < marks.length; i++) {
            marks[i] = g.nextInt(MAX+1);
            System.out.print(marks[i] + "  ");
        }
        
        for(int i = 0; i < marks.length; i++) {
            max = Math.max(max, marks[i]);
            min = Math.min(min, marks[i]);
            sum += marks[i];
        }
        
        double avg = (double) sum / noStu;
        
        System.out.println("\nThe highest score: " + max);
        System.out.println("The lowest score: " + min);
        System.out.printf("The average score: %.2f%n", avg);
        
        input.close();
    }
    
}


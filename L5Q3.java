/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Random;
import java.util.Scanner;

public class L5Q3 {

    public static void main(String[] args) {
        Random g = new Random();
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter number of employee: ");
        int employee = input.nextInt();
        
        int[][] workHour = new int[employee][7];
        int sum = 0;
        
        for(int i = 0; i < employee; i++) {
            System.out.println("\nEmployee " + (i+1) + ": ");
            for(int j = 0; j < 7; j++) {
                workHour[i][j] = g.nextInt(1, 8+1);
                sum += workHour[i][j];
                
            }
//            for(int j = 0; j < 7; j++) {
//                System.out.print("Working hour for day" + (j+1) + ":");
//                System.out.print(workHour[i][j] + "\n");
//            }
            System.out.print("Working hour for a week: ");
            for(int j = 0; j < 7; j++) {
                System.out.print(workHour[i][j] + "  ");
            }
            System.out.println("\nTotal hours worked: " + sum);
        }

    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
public class L8Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of stalls: ");
        int n = input.nextInt();
        
        String[] id = new String[n];
        int[] sales = new int[n];
        
        for (int i=0; i<n; i++) {
            System.out.print("Enter stall ID " + (i+1) + ": ");
            id[i] = input.next();
            System.out.print("Enter sales amount: ");
            sales[i] = input.nextInt();
            Burger burger = new Burger(id[i]);
            burger.salesToday(sales[i]);
        }
        
        for (int i = 0; i<n;i++) {
            Burger burger = new Burger(id[i]);
            burger.setID(id[i]);
            burger.setSold(sales[i]);
            System.out.printf("Number of burgers sold for stall %s: %d\n", burger.getID(), burger.getSold());
            if (i == n-1)
                System.out.println("Total number of burgers sold in all stalls: " + burger.getAllSold());
  
        }
        
    }
}

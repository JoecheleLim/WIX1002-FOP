/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva1;

/**
 *
 * @author Lim Joechele
 */
public class Viva1Q6 {

   public static void main(String[] args) {
        // Loop through each row of the 7x7 grid
        for (int row = 0; row < 7; row++) {
            // Print M
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || (row == col && col <= 3) || (row + col == 6 && col >= 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); // Space between letters

            // Print A
            for (int col = 0; col < 7; col++) {
                if ((col == 0 || col == 6) && row != 0 || row == 0 || row == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Print L
            for (int col = 0; col < 7; col++) {
                if (col == 0 || row == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Print A 
            for (int col = 0; col < 7; col++) {
                if ((col == 0 || col == 6) && row != 0 || row == 0 || row == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Print Y
            for (int col = 0; col < 7; col++) {
                if ((row == col && col < 4) || (row + col == 6 && col > 2) || (col == 3 && row >= 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Print S
            for (int col = 0; col < 7; col++) {
                if (row == 0 || row == 3 ||row == 6|| (col == 0 && row > 0 && row < 3) ||(col == 6 && row > 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Print I
            for (int col = 0; col < 7; col++) {
                if (col == 3 || row == 0 || row == 6) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   ");

            // Print A 
            for (int col = 0; col < 7; col++) {
                if (col == 0 || col == 6 || row == 0 || row == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line
        }
   }
}
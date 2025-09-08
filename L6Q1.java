/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

/**
 *
 * @author Lim Joechele
 */
public class L6Q1 {

    public static void main(String[] args) {
        System.out.println("The first 20 triangular numbers are: ");
        for (int i =1; i<=20; i++) {
            System.out.println("T(" + i + ")= " + NoTriangle(i));
        }
    }
    
    public static int NoTriangle (int n) { // n = no of rows
        return (n*(n+1))/2;
    }
}

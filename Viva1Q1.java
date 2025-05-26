/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package viva1;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
public class Viva1Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your username in lovercase: ");
        String username = input.next().toLowerCase();
        
        int noChar = username.length();
        
        String check = "abcdefghijklmnopqrstuvwxyz"; //26
        int count = 0;
        for (int i = 0; i < check.length(); i++) { //25, index start at 0
            int lettercount = 0;
            for (int j = 0; j < noChar; j++ ) {
                if (username.charAt(j) == check.charAt(i)){
                    lettercount ++;
                    break;
                }
           }
            if (lettercount > 0)
                    count ++;
        }
        if (count %2 == 0) 
            System.out.println("ALLY DETECTED!");
        else 
            System.out.println("ENEMY DETECTED!");
    }
    
}

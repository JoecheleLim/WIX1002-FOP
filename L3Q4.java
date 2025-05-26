/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.*;
/**
 *
 * @author Lim Joechele
 */
public class L3Q4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("Enter player 1: ");
        String player1 = input.nextLine();
        System.out.print("Enter player 2: ");
        String player2 = input.nextLine();
        
        int player1Score1 = rand.nextInt(7);
        int player1Score2 = rand.nextInt(7);
        int player2Score1 = rand.nextInt(7);
        int player2Score2 = rand.nextInt(7);
        
        int totalScore1 = player1Score1 + player1Score2;
        int totalScore2 = player2Score1 + player2Score2;
        
        System.out.println("Total score of " + player1 + ": " + totalScore1);
        System.out.println("Total score of " + player2 + ": " + totalScore2);
        
        if (totalScore1 > totalScore2) 
            System.out.println( player1 + " wins!");
        else if (totalScore2 < totalScore1)
            System.out.println( player2 + " wins!");
        else
            System.out.println("It is tie!");
    }
    
}

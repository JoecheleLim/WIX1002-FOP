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
public class L8Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter name of player 1: ");
        String name1 = input.nextLine();
        
        System.out.print("Enter name of player 2: ");
        String name2 = input.nextLine();
        
        Game player1 = new Game(name1);
        Game player2 = new Game(name2);
        
        boolean isPlayer1Turn = true;
        
        while(Math.max(player1.getScore(), player2.getScore()) < 100) {
            if(isPlayer1Turn)
                player1.roll();
            else 
                player2.roll();
            isPlayer1Turn = false;
        }
        
        int score1 = player1.getScore();
        int score2 = player2.getScore();
        
        if(score1 > score2) {
            System.out.println("Player 1 (" + player1 + ") wins!");
            System.out.println("Score for player 1: " + score1);
            System.out.println("Score for player 2: " + score2);
        } else {
            System.out.println("Player 2 (" + player2 + ") wins!");
            System.out.println("Score for player 1: " + score1);
            System.out.println("Score for player 2: " + score2);
        }
    }
}

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
public class L4Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter player 1's name: ");
        String p1 = input.nextLine();
        System.out.print("Enter player 2's name: ");
        String p2 = input.nextLine();
        
        int scoreP1, totalP1 =0;
        int scoreP2, totalP2=0;
        
        while (totalP1 < 100 || totalP2 < 100) {
            scoreP1 = rand.nextInt(1,7);
            totalP1 += scoreP1;
            if (totalP1 > 100)
                break;
            System.out.println("Player 1 turns! \nScore: " + scoreP1);
            if (totalP1 > 100)
                break;
            if (scoreP1 == 6)
                continue;
            scoreP2 = rand.nextInt(1,7);
            totalP2 += scoreP2;
            System.out.println("Player 2 turns!\nScore: " + scoreP2);
            if (scoreP2 == 6){
                 scoreP2 = rand.nextInt(1,7);
                totalP2 += scoreP2;
                System.out.println("Player 2 turns!\nScore: " + scoreP2);
            }
        }
        System.out.println("Total Score of Player 1 (" + p1 + "): " + totalP1);
        System.out.println("Total Score of Player 2 (" + p2 + "): " + totalP2);
        if (totalP1> 100) 
            System.out.println("Player " + p1 + " wins!!!");
        else
            System.out.println("Player " + p2 + " wins!!!");
        input.close();
        
    }
    
}


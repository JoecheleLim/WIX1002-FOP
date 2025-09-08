/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
import java.util.Random;

public class L6Q5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random g = new Random();
        int ans;
        int score = 0;
        
        do {
        System.out.println("Enter negative number to quit.");
        int rand1 = g.nextInt(12+1);
        int rand2 = g.nextInt(12+1);
        System.out.print(rand1 + " x " + rand2 + " = ");
        ans = input.nextInt();
        score += Score(rand1, rand2, ans);
        } while (ans >0);
        
        System.out.println("Your Score is " + score);
        input.close();
    }
    
    public static int Score (int a, int b, int c) {
        if (a*b == c) {
            return 1;
        }
        return 0;
    }
    
    
}

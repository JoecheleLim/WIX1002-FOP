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
public class L8Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter money 1, M1: ");
        double money1 = input.nextDouble();
       
        System.out.print("Enter money 2, M2: ");
        double money2 = input.nextDouble();
        
        Money m1 = new Money(money1);
        m1.Round();
        m1.numOfNotesNCoins();
        System.out.print("For M1: ");
        m1.display();
        System.out.println();

        Money m2 = new Money(money2);
        m2.Round();
        m2.numOfNotesNCoins();
        System.out.println("For M2: ");
        m2.display();
        
        double totalAdd = m1.addition(m2);
        double totalSub = m1.subtraction(m2);
        
        System.out.println();
        System.out.printf("M1 + M2: RM %.2f\n", totalAdd);
        if (m1.getRound() > m2.getRound())
            System.out.printf("M1 - M2: RM %.2f\n", totalSub);
        else
            System.out.printf("M2 - M1: RM %.2f\n", totalSub);

    }
}

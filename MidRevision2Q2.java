/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midrevision2;

/**
 *
 * @author Lim Joechele
 */
import java.util.*;
public class MidRevision2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, fac, score=0, sumQ=0;
        boolean ans, correctAns;
        
        System.out.print("Enter a number (-1 to quit): ");
        num = input.nextInt();
        
        
        while (num != -1) {
            System.out.print("Enter a factor: ");
            fac = input. nextInt();
            System.out.print(fac + " is a factor of " + num + "? (true/false): ");
            ans = input.nextBoolean();
            if (num%fac ==0)
                 correctAns = true;
            else 
                correctAns = false;
            
            if (ans == correctAns){
                System.out.println("Your answer is correct.");
                score ++;
            } else 
                System.out.println("Your answer is incorrect.");
            sumQ++;
            System.out.print("Enter a number (-1 to quit): ");
            num = input.nextInt();
           }
        System.out.println("The final score is " + score + "/" + sumQ);
        input.close();
        
//        do {
//            System.out.print("Enter a factor: ");
//            fac = input. nextInt();
//            if (num == -1)
//                break;
//            System.out.print(fac + " is a factor of " + num + "? (true/false): ");
//            ans = input.nextBoolean();
//            
//            if (ans == (num%fac==0)){
//                System.out.println("Your answer is correct.");
//                score ++;
//            } else 
//                System.out.println("Your answer is incorrect.");
//            sumQ++;
//            
//           } while (!(num==-1));
    }
    
}


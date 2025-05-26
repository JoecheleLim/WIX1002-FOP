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
public class L4Q7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();
        System.out.print("Enter interest in %: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter total number of month(s): ");
        double noMonth = input.nextDouble();
        
        System.out.println("\nMonth     Monthly Payment     Principal     Interest     Unpaid Balance     Total Interest");
        
        double monthlyPayment,principalMonth,interest, unpaidB, totalInterest=0;
        monthlyPayment = (principal*(interestRate/(12*100)))/(1-Math.pow((1+(interestRate/(12*100))),-noMonth));
        for(int n =1; n<= noMonth; n++){
            principalMonth = monthlyPayment * (Math.pow(1+(interestRate/(12*100)), -(1 + noMonth-n)));
            interest = monthlyPayment - principalMonth;
            unpaidB = interest / (interestRate/(12*100)) - principalMonth;
            totalInterest += interest; 
            System.out.printf("%5d     %15.2f     %9.2f     %8.2f     %14.2f     %14.2f%n\n", n, monthlyPayment, principalMonth, interest, unpaidB, totalInterest);
        }
        
    }
    
}

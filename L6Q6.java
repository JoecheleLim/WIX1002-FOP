/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author Lim Joechele
 */
public class L6Q6 {

    public static void main(String[] args) {
        System.out.println("First 20 Palindromic Prime: ");
        PanlindromicPrime();
        System.out.println();
        System.out.println("First 20 EMIRP: ");
        EMIRP();
        
    }
    public static boolean isPrime(int a) {
        if (a == 1) 
            return false;
        
        for(int i = 2; i <= Math.sqrt(a); i++) {
            if (a%i == 0)
                return false;
        }
        return true;
    }
    
    public static void PanlindromicPrime () {
        int counter = 0, num =1;
        while (counter < 20) {
            String number = String.valueOf(num);
            
            // To check if the number is a palindrome
            String reverse = new StringBuilder(number).reverse().toString();
            if (number.equals(reverse) && isPrime(num)) {
                System.out.print(num + " ");
                counter++;
             }
            num++;
        } 
    }
    
    public static void EMIRP() {
        int counter = 0, num =1;
        while (counter < 20) {
            String number = String.valueOf(num);
            
            // To check if the number is a EMIRP
            int reverse = Integer.parseInt(new StringBuilder(number).reverse().toString());
            if (isPrime(reverse) && isPrime(num) && num != reverse) { // EMIRP cannot be Palindromic Prime
                System.out.print(num + " ");
                counter++;
             }
            num++;
        }   
    }
}

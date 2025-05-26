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
public class L4Q8 {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(0,101);
        System.out.println("Number of prime number: " + n);
        for (int i=2; i<n; i++){
            if(isPrime(i)) { // How can I know it runs?
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int i) {
        if (i <=1)
            return false;
        
        for(int n=2; n<= Math.sqrt(i); n++){ // Here also
            if (i%n == 0)
                return false; // only return false in for loop
        }
        return true;
    }
    
}
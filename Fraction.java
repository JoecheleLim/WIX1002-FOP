/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
public class Fraction {
    private int numerator;
    private int denominator;
    
    public void setNumerator(int num) {
        this.numerator = num;
    }
    
    public int getNumerator() {
        return this.numerator;
    }
    
    public void setDenominator(int denom) {
        this.denominator = denom;
    }
    
    public int getDenominator() {
        if (this.denominator == 0) {
            System.out.println("Denominator cannot be zero.");
        }
        return this.denominator;
    }
    
//    public int gcd(int a, int b) {
//        int i;
//        if (a < b) {
//            i = a;
//        } else 
//            i = b;
//        
//        for(i = i; i>1; i--) {
//            if (a % i == 0 && b % i == 0)
//                return i;
//        }
//        
//        return 1;
//    }
    
    public int gcd(int a, int b) {
        if (b == 0) 
            return a;
        else
            return gcd(b, Math.abs(a-b));
    }
    
    public void displayGCD (){
        System.out.printf("The reduced fraction is %d/%d.\n", (this.numerator/gcd(this.numerator, this.denominator)), (this.denominator/gcd(this.numerator,this.denominator)));
    }
    
}

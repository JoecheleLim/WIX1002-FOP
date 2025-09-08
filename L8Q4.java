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
public class L8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter denominator: ");
        int denom = input.nextInt();
        System.out.print("Enter numerator: ");
        int num = input.nextInt();
        
        Fraction frac = new Fraction();
        frac.setDenominator(denom);
        frac.setNumerator(num);
        frac.displayGCD();
    }
}

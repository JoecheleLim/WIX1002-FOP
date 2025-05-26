/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
public class L8Q1 {
    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number(5);
        Number c = new Number(4,50);
        
        System.out.println("For object a: ");
        a.displayArray();
        a.displayEven();
        a.displayPrime();
        a.displayMax();
        a.displayMin();
        a.displayAvg();
        a.displaySqNum();
        System.out.println();
        
        System.out.println("For object b: ");
        b.displayArray();
        b.displayEven();
        b.displayPrime();
        b.displayMax();
        b.displayMin();
        b.displayAvg();
        b.displaySqNum();
        System.out.println();
        
        System.out.println("For object c: ");
        c.displayArray();
        c.displayEven();
        c.displayPrime();
        c.displayMax();
        c.displayMin();
        c.displayAvg();
        c.displaySqNum();
        System.out.println();
    }
}

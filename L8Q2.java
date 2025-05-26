/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
public class L8Q2 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Joechele Lim", "050713-07-0486", "PA36098", 10000);
        
        acc.Deposit(10000);
        acc.displayBalance();
        acc.WithDraw(1000);
        acc.Deposit(50);
        acc.displayBalance();
        acc.WithDraw(1000000);
    }
}

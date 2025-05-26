/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
public class BankAccount {
    private final String NAME;
    private final String IC;
    private final String PASSPORT;
    private double balance;
    
    public BankAccount(String name, String ic, String passport, double deposit) {
        this.NAME = name;
        this.IC = ic;
        this.PASSPORT = passport;
        this.balance = deposit;
        System.out.printf("Savings Account created by %s (IC [%s] and Passport Number [%s]).\n", this.NAME, this.IC, this.PASSPORT);
        System.out.printf("Current balance: RM %.2f\n", this.balance);
    }
    
    public void Deposit(double amount) {
        this.balance += amount;
    }
    
    public void WithDraw(double amount) {
        if (amount < this.balance)
            this.balance -= amount;
        else
            System.out.printf("This amount [RM %.2f] excess your current savings!\n", amount);
        
    }
    
    public void displayBalance() {
        System.out.printf("Amount in current savings: RM %.2f\n", this.balance);
        
    }
    
}

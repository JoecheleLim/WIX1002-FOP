/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
public class Money {
    private int inputAmount;
    private int roundedMoney;
    private final double[] divisor = {100, 50, 10, 5, 1, 0.5, 0.2, 0.1, 0.05};
    private int[] cashUsed = new int[divisor.length];
    
    public Money(double amount){
        this.inputAmount = (int)(amount*100);
    }
    
    public void Round() {
        int remainder = this.inputAmount%10;
        if (remainder <= 2)
            this.roundedMoney = this.inputAmount - remainder;
        else if (remainder <=7)
            this.roundedMoney = this.inputAmount - remainder + 5;
        else
            this.roundedMoney = this.inputAmount - remainder + 10;
    }
    
    public int getRound(){
        return this.roundedMoney;
    }
    
    public double addition(Money m) {
        double totalMoney = (this.roundedMoney + m.roundedMoney) / 100.0;
        return totalMoney;
    }
    
    public double subtraction(Money m) {
        double totalMoney = Math.abs((this.roundedMoney - m.roundedMoney)/100);

        return totalMoney;
    }
    
    public void numOfNotesNCoins() {
        double tempMoney = this.roundedMoney /100.0; 
        for(int i = 0; i<divisor.length; i++) {
            cashUsed[i] = (int) (tempMoney / divisor[i]);
            tempMoney %= divisor[i];
        }
    }
    
    public void display() {
        System.out.printf("RM %.2f after Round Up: RM %.2f\n", this.inputAmount / 100.0, this.roundedMoney / 100.0);
        System.out.println("Notes: ");
        for(int i = 0; i<5; i++) {
            boolean hasNotes = false;
            if (cashUsed[i] > 0){
                System.out.printf("RM %.0f: %d\n", divisor[i], cashUsed[i]);
                hasNotes = true;
            }
            
            if(!hasNotes) {
                System.out.println("No notes is used.");
            }
        }
        
        System.out.println("Coins: ");
        for(int i = 5; i<divisor.length; i++) {
            boolean hasCoin = false;
            if (cashUsed[i] > 0) {
                System.out.printf("%.0f cents: %d\n", divisor[i]*100, cashUsed[i]);
                hasCoin = true;
            }
            
            if(!hasCoin) {
                System.out.println("No coins is used.");
            }
        }
    }
}

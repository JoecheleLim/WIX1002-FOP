/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author Lim Joechele
 */
public class Game1 extends Dice{
    private final String NAME;
    protected int d1, d2;
    private static int total;
    
    public Game1(String name) {
        super(name);
        this.NAME = name;
        total = 0;
    }
    
    public void roll() {
        d1 = super.rollDice();
        d2 = super.rollDice();
        System.out.printf("%s rolled %d and %d%n", NAME, d1,d2);
        total += d1+d2;
        if (d1==d2) {
            d1 = super.rollDice();
            d2 = super.rollDice();
            System.out.printf("%s rolled %d and %d%n", NAME, d1,d2);
        }
    }
    
    public int getPlayerScore() {
        return total;
    }
    
    public void showPlayerScore(){
        System.out.printf("Score for %s: %d%n", NAME, total);
    }
}

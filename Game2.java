/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author Lim Joechele
 */
public class Game2 extends Dice {
    private final String NAME;
    protected int d1;
    private static int total;
    
    public Game2 (String name) {
        super(name);
        this.NAME = name;
        total = 0;
    }
    
    public void roll() {
        d1 = super.rollDice();
        System.out.printf("%s rolled %d%n", NAME, d1);
        total += d1;
        if (total >100)
            total -= d1;
        if (d1 == 6) {
            d1= super.rollDice();
            System.out.printf("%s rolled %d%n", NAME, d1);
            if (d1 != 6) {
                total += d1;
                if (total >100)
                    total -= d1;
            }
        }
    }
    
    public int getPlayerScore() {
        return total;
    }
    
    public void showPlayerScore() {
        System.out.printf("Score for %s: %d%n", NAME, total);
    }
}

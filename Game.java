/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
import java.util.Random;
public class Game {
    Random g = new Random();
    private final String NAME;
    private int score = 0;
    
    public Game(String name) {
        this.NAME = name;
    }
    
    public void roll() {
        this.score += g.nextInt(7);
    }
    
    public String getName() {
        return this.NAME;
    }
    
    public int getScore() {
        return this.score;
    }
}

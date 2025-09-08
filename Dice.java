/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author Lim Joechele
 */
public class Dice {
    protected String playerName;
    
    public Dice(String playerName) {
        this.playerName = playerName;
    }
    
    public int rollDice() {
       return (int) Math.round(Math.random()*5)+1;
    }
}

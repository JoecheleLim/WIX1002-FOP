/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
public class Player {
    private String name;
    private int health;
    private int attackPower;
    
    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.attackPower = 10;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getHealth() {
        return this.health;
    }
    
    public int attack(Enemy enemy) {
         enemy.setHealth(enemy.getHealth() - this.attackPower);
         return enemy.getHealth();
    }
    
    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    
    public int getAttackPower() {
        return this.attackPower;
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    @Override
    public String toString() {
        return String.format("Player: %s\nHealth: %d\nAttack Power: %d\n", name, health, attackPower);
    }
}

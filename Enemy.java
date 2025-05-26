/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
public class Enemy {
    private String type;
    private int health;
    private int attackPower;
    
    public Enemy(String type) {
        this.type = type;
        this.health = 50;
        this.attackPower = 5;
    }
    
    public void setHealth(int health) {
        this.health = health;
    }
    
    public int getHealth() {
        return this.health;
    }
    
    public void setCurrentAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    
    public int getCurrentAttackPower() {
        return this.attackPower;
    }
    
    public void setNextAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
    
    public int getNextAttackPower() {
        return this.attackPower;
    }
    
    public void attack(Player player) {
        player.setHealth(player.getHealth() - this.attackPower);
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    @Override
    public String toString() {
        return String.format("Enemy: %s\nHealth: %d\nAttack Power: %d\n", type, health, attackPower);
    }
}

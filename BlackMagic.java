/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
public class BlackMagic {
    private String name;
    private int effect;
    
    public BlackMagic(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }
    
    public void effect(Player player, Enemy enemy) {
        if (name.equalsIgnoreCase("Poison")) {
            player.setHealth(player.getHealth() + effect);
            player.setAttackPower((int) (player.getAttackPower()*(1-effect/100)));
        }
        
        if (name.equalsIgnoreCase("Magic Orb")) {
            // current attack
            enemy.setCurrentAttackPower((int)(enemy.getCurrentAttackPower() + enemy.getCurrentAttackPower()*(effect/100)));
            // next attack
            enemy.setNextAttackPower((int)(enemy.getNextAttackPower() + enemy.getNextAttackPower()*(effect/100)));
        }
    }
    
    @Override
    public String toString() {
        return String.format("Item: %s\nEffect: %d\n", name, effect);
    }
}

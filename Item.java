/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
public class Item {
    private String name;
    private int effect;
    
    public Item(String name, int effect) {
        this.name = name;
        this.effect = effect;
    }
    
    public void use(Player player) {
        if (name.equalsIgnoreCase("Health Potion")) {
            player.setHealth(player.getHealth()+effect);
        }
        
        if (name.equalsIgnoreCase("Sword")) {
            player.setAttackPower(player.getAttackPower()+effect);
        }
    }
    
    @Override
    public String toString() {
        return String.format("Item: %s\nEffect: %d\n", name, effect);
    }
}

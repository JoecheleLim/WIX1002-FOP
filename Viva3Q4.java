/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
import java.util.Random;

public class Viva3Q4 {
    public static void main(String[] args) {
        Random g = new Random();
        
        Player player = new Player("Lim");
        Enemy enemy = new Enemy("Monster");
        
        Item healthPotion = new Item("Health Potion", 20);
        Item sword = new Item("Sword", 15);
        
        BlackMagic poison = new BlackMagic("Poison", 10);
        BlackMagic magicOrb = new BlackMagic("Magic Orb", 200);
        
        System.out.println("Game Start!");
        System.out.println(player.toString());
        System.out.println(enemy.toString());
        
        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\n-- Player's Turn --");
            player.attack(enemy);
            System.out.println("Player attacked the enemy!");
            System.out.println(enemy);
            
            int choice = g.nextInt(2);
            // Use health potion if player's health is low
            if (choice == 0) {
                healthPotion.use(player);
                System.out.println("Player used a Health Potion.");
                System.out.println(player);
            } else {
                // Use sword for extra attack power
                sword.use(player);
                System.out.println("Player used a Sword to boost attack power.");
                System.out.println(player);
            }

            if (!enemy.isAlive()) {
                System.out.println("Enemy defeated!");
                break;
            }

            System.out.println("\n-- Enemy's Turn --");
            enemy.attack(player);
            System.out.println("Enemy attacked the player!");
            System.out.println(player);
            
            // Enemy uses black magic
            int choice1 = g.nextInt(2);
            if (choice1 == 0) {
                poison.effect(player, enemy);
                System.out.println("Enemy used Poison!");
                System.out.println(player);
                System.out.println(enemy);
            } else {
                magicOrb.effect(player, enemy);
                System.out.println("Enemy used Magic Orb!");
                System.out.println(player);
                System.out.println(enemy);
            }

            if (!player.isAlive()) {
                System.out.println("Player defeated!");
                break;
            }
        }
        
        System.out.println("\nGame Over!");
        if (player.isAlive()) {
            System.out.println("Congratulations! Player wins!");
        } else {
            System.out.println("The enemy has won. Better luck next time!");
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
public class Monster {
    private String name;
    private double pyroR, hydroR, electroR, cryoR, hp;
    public Monster() {
        name = null;
        pyroR = 0.0;
        hydroR = 0.0;
        electroR = 0.0;
        cryoR = 0.0;
        hp = 0.0;
    }
    
    public Monster(String name, double pyroR, double hydroR, double electroR, double cryoR, double hp) {
        this.name = name;
        this.pyroR = pyroR;
        this.hydroR = hydroR;
        this.electroR = electroR;
        this.cryoR = cryoR;
        this.hp = hp;
    }
    
    public String getName() {
        return name;
    }
    
    public double getHp() {
        return hp;
    }
    public double getResistance(String element) {
        return switch(element) {
            case "Pyro" -> pyroR/100;
            case "Hydro" -> hydroR/100;
            case "Electro" -> electroR/100;
            case "Cryo" -> cryoR/100;
            default -> 0.0;
        };
    }
    
    
}

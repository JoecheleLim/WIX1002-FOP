/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
public class Hero {
    private String name, element;
    private double power;
    
    public Hero() {
        name = null;
        element = null;
        power = 0.0;
    }
    
    public Hero(String name, String element, double power) {
        this.name = name;
        this.element = element;
        this.power = power;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setElement(String element) {
        this.element = element;
    }
    
    public String getElement() {
        return element;
    }
    
    public void setPower(double power) {
        this.power = power;
    }
    
    public double getPower() {
        return power;
    }
}

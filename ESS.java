/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author Lim Joechele
 */
public abstract class ESS {
    protected String name, type;
    
    public abstract double getSalary();
    
    public String toString() {
        return "Name: " + name + "\nType: " + type + String.format("\nSalary: RM%.2f\n", getSalary());
    }
    
}

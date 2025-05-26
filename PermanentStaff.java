/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author Lim Joechele
 */
public class PermanentStaff extends ESS {
    public char category;
    
    public PermanentStaff (String name, char category) {
        this.name = name;
        this.type = "Permanent Staff";
        this.category = category;
    }
    
    public double getSalary() {
        return switch (category) {
            case 'A' -> 4000;
            case 'B' -> 3000;
            case 'C' -> 2000;
            default -> 0;
        };
    }
}

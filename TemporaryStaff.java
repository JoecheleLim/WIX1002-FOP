/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author Lim Joechele
 */
public class TemporaryStaff extends ESS{
    public int workHrs;
    
    public TemporaryStaff (String name, int workHrs) {
        this.name = name;
        this.type = "Temporary Staff";
        this.workHrs = workHrs; 
    }
    
    public double getSalary() {
        return workHrs*15;
    }
}

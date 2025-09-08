/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author Lim Joechele
 */
public class ContractStaff extends ESS{
    private double sales;
    
    public ContractStaff(String name, double sales) {
        this.name = name;
        this.type = "Contract Staff";
        this.sales = sales;
    }
    
    public double getSalary() {
        return 500 + sales*0.5;
    }
}

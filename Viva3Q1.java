/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
class Vehicle {
    protected String ID, type, brand;
    protected double rentalRate, updatedRate,fuelLvl;
    protected double totalCost;
    protected int day;
    public Vehicle() {
        this.ID = "0000";
        this.type = "Car";
        this.brand = "Myvi";
        this.rentalRate = 100;
        this.fuelLvl = 100;
    }
    
    public Vehicle(String ID, String type, String brand, double rentalRate, double fuelLvl) {
        this.ID = ID;
        this.type = type;
        this.brand = brand;
        this.rentalRate = rentalRate;
        this.fuelLvl = fuelLvl;
    }
    
    public void setID(String ID) {
        this.ID = ID;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public String getType() {
        return this.type;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public void setRental(double rentalRate) {
        this.rentalRate = rentalRate;
    }
    
    public double getRental() {
        return this.rentalRate;
    }
    
    public void setFuelLvl(double fuelLvl) {
        this.fuelLvl = fuelLvl;
    }
    
    public double getFuelLvl() {
        return this.fuelLvl;
    }
    
    public void calculateRentalRate() {
        if (type.toUpperCase().equals("VAN")) {
            updatedRate = rentalRate * 1.2;
        }
        
        if (type.toUpperCase().equals("MOTORCYCLE") ) {
            updatedRate = rentalRate * 0.75;
        }
    }
    
    public double calculateRentalCost(int day) {
        this.day = day;
        double cost = updatedRate*day;
        if (day > 14)
            cost *= 0.9;
        else if (day >= 7)
            cost *= 0.95;
        return cost;
    }
    
    public double calculateFuelCharge() {
        totalCost = calculateRentalCost(day);
        if(fuelLvl <= 50)
            totalCost += 50.0;
        return totalCost;
    }
    
    @Override
    public String toString() {
        return String.format("Vehicle ID: %s\nType: %s\nBrand: %s\nRental Rate: $%.1f\nFuel Level: %.1f%%\nRental Days: %d\nTotal Cost: RM%.1f", ID,type,brand,rentalRate,fuelLvl,day,calculateFuelCharge());
    }
}
 
public class Viva3Q1 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        
//        System.out.print("Enter vehicle ID: ");
//        String ID = in.nextLine();
//        
//        System.out.print("Enter type: ");
//        String type = in.nextLine();
//        
//        System.out.print("Enter brand: ");
//        String brand = in.nextLine();
//        
//        System.out.print("Enter rental rate per day: ");
//        double rentalRate = in.nextDouble();
//        
//        System.out.print("Enter fuel level per %: ");
//        double fuelLvl = in.nextDouble();
//        
//        System.out.print("Enter day: ");
//        int day = in.nextInt();
//        
//        Viva3Q1 v = new Viva3Q1(ID, type, brand, rentalRate, fuelLvl);
//        v.calculateRentalCost(day);
//        v.calculateFuelCharge();
//        System.out.println(v.toString());
        Vehicle v1 = new Vehicle("0111", "Van", "Toyota", 100.0, 50.0);
        v1.calculateRentalRate();
        v1.calculateRentalCost(2);
        v1.calculateFuelCharge();
        System.out.println(v1.toString());
        System.out.println();
        
        Vehicle v2 = new Vehicle("0111", "Van", "Toyota", 100.0, 50.0);
        v2.calculateRentalRate();
        v2.calculateRentalCost(14);
        v2.calculateFuelCharge();
        System.out.println(v2.toString());
        System.out.println();
        
        Vehicle v3 = new Vehicle("0100", "Car", "BMW", 150.0, 40.0);
        v3.calculateRentalRate();
        v3.calculateRentalCost(5);
        v3.calculateFuelCharge();
        System.out.println(v3.toString());
    }
}


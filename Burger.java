/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
public class Burger {
    private String ID;
    private int totalAmt;
    private static int allSales = 0; // variable belongs to class
    
    public Burger(String id) {
        this.ID = id;
        this.totalAmt = 0;
    }
    
    public void salesToday(int count) {
        if (count>0) {
            this.totalAmt += count;
            allSales += count;
        }
    }
    
    public void setID(String id) {
        this.ID = id;
    }
    
    public String getID() {
        return this.ID;
    }
    
    public void setSold(int count) {
        this.totalAmt = count;
    }
    
    public int getSold() {
        return this.totalAmt;
    }
    
    public int getAllSold() {
        return allSales;
    }
}

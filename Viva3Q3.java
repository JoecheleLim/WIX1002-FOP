/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva3;

/**
 *
 * @author Lim Joechele
 */
class Room {
    private String roomNumber;
    private String roomType;
    private double rentalPrice; 
    private static int totalRooms =0;
    
    public Room( String roomNumber, String roomType, double rentalPrice) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.rentalPrice = rentalPrice;
        totalRooms ++;
    }
    
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    public String getRoomNumber(){
       return roomNumber; 
    }
    
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    
    public String getRoomType(){
       return roomType; 
    }
    
    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    
    public double getRentalPrice(){
       return rentalPrice; 
    }
    
    public double calculateRent(int days) {
        return rentalPrice*days;
    }
    
    public double calculateRent(int days, double discount) {
        return rentalPrice*days*(1-discount/100);
    }
    
    public double calculateDiscount(int days, double discount){
        return rentalPrice*days*discount/100;
    }
    
    public static Integer getTotalRooms() {
        return totalRooms;
    }
    
    public static void displayRoomDetails(Room room) {
        System.out.println("Room Number: " + room.getRoomNumber());
        System.out.println("Room Type: " + room.getRoomType());
        System.out.printf("Rental Price: $%.1f\n", room.getRentalPrice());
        System.out.println("Total Rooms: " + getTotalRooms());
    }
}
public class Viva3Q3 {
    public static void main(String[] args) {
        double discount = 10.0;

        Room r1 = new Room("101", "Single", 100.0);
        int days = 5;
       
        Room.displayRoomDetails(r1);
        
        System.out.printf("Total Rent for %d days: $%.1f\n", days, r1.calculateRent(days));
        System.out.printf("Total Rent for %d days with $%.1f discount: $%.1f\n", days, r1.calculateDiscount(days, discount), r1.calculateRent(days, discount));
        System.out.println();
        
        Room r2 = new Room("102", "Double", 200.0);
        days = 14;
        
        Room.displayRoomDetails(r2);
        
        System.out.printf("Total Rent for %d days: $%.1f\n", days, r2.calculateRent(days));
        System.out.printf("Total Rent for %d days with $%.1f discount: $%.1f\n", days, r2.calculateDiscount(days, discount), r2.calculateRent(days, discount));
        System.out.println();

        Room r3 = new Room("103", "Suite", 300.0);
        days = 8;
        
        Room.displayRoomDetails(r3);
        
        System.out.printf("Total Rent for %d days: $%.1f\n", days, r3.calculateRent(days));
        System.out.printf("Total Rent for %d days with $%.1f discount: $%.1f\n", days, r3.calculateDiscount(days, discount), r2.calculateRent(days, discount));
        System.out.println();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
public class Viva2Q5 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String[] fruits = {"Apple", "Grape", "Banana", "Mango", "Orange", "Strawberry", "Blueberry"};
        int[] storage = {45, 57, 75, 34, 75, 65, 78};
        double[] price = {5.00, 10.00, 2.50, 6.00, 3.00, 15.00, 12.00};
        
        printFruit(fruits);
        
        System.out.print("Please enter the fruit you want to buy: ");
        String fruitSelect = in.nextLine();
        
        System.out.print("Unit or Box: ");
        int quantity = in.nextInt();
        
        int fruitIdx = getIdxFruit(fruits, fruitSelect);
        
        if (!haveProduct(fruits, fruitIdx)) {
            System.out.println("Sorry we currently do not offer this product.");
        } else if (!haveStock(fruitIdx, storage, quantity)) {
            System.out.println("Sorry, we do not have enough stock for " + fruits[fruitIdx] + ". Please come again later!");
        } else {
            System.out.println("\nKindly Checkout here: ");
            generateBill(fruits, fruitIdx, price, quantity);
        }
    }
   
   public static void printFruit(String[] fruits) {
       System.out.println("FreshMart Fruit Selection");
       for(int i = 0; i < fruits.length; i++) {
           System.out.println((i+1) + ". " + fruits[i]);
       }
   }
   
   public static int getIdxFruit(String[] fruits, String selectedFruit) {
       for(int i =0; i < fruits.length; i++) {
           if (fruits[i].toLowerCase().equals(selectedFruit.toLowerCase())) {
               return i;
           }
        }
        return -1;
   }
   
   public static boolean haveProduct(String[] fruits, int fruitIdx) {
       if (fruitIdx < fruits.length) {
           return true;
       }
       return false;
   }
   
   public static boolean haveStock(int fruitIdx, int[] storage, int quantity){
       if (storage[fruitIdx] > quantity) {
           return true;
       }
       return false;
   }
   
   public static void generateBill(String[] fruits, int fruitIdx, double[] price, int quantity) {
       double totalPrice = quantity * price[fruitIdx];
       System.out.println("-------------------------------------------------------------");
       System.out.println("---------------------Fresh Mart Receipt----------------------");
       System.out.println("-------------------------------------------------------------");
       System.out.println("|        Product         |   Quantity  | Price per Unit(RM) |");   
       System.out.printf("|%15s         |%11d  |%19.2f |\n",fruits[fruitIdx], quantity, price[fruitIdx]);
        System.out.println("-------------------------------------------------------------");
       System.out.printf("Total Price: %.2f\n", totalPrice);
        System.out.println("-------------------------------------------------------------");
   }
}

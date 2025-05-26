/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midrevision1;

/**
 *
 * @author Lim Joechele
 */
import java.util.*;
public class MidRevision1Q2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the type of durian [Quit] to terminate: ");
        String type = input.next();
        System.out.print("Enter the sales in kg: ");
        double sales = input.nextDouble();
        double price = 0, sum=0;
        while (type != "Quit") {
            switch (type) {
                case "MK":
                    price = sales*25;
                    break;
                case "HL":
                    price = sales*22;
                    break;
                case "D24":
                    price = sales*20;
                    break;
                case "UM":
                    price = sales*18;
                    break;
                default:
                    System.out.println("Invalid type: "+ type);
            }
            sum= sum + price;
            System.out.print("Enter the type of durian [Quit] to terminate: ");
            type = input.next();
            System.out.print("Enter the sales in kg: ");
            sales = input.nextDouble();
        }
        System.out.printf("Total sales : %.2f%n", price);
        input.close();
        
//        switch (type) {
//                case "MK" -> price = sales*25;
//                case "HL" -> price = sales*22;
//                case "D24" -> price = sales*20;
//                case "UM" -> price = sales*18;
//                default -> System.out.println("Invalid type: "+ type);
//            }
    }
    
}


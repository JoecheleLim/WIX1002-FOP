/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
public class WeightCalculator {
//    private int AGE;
//    private double HEIGHT;
//    public WeightCalculator(int age, double height){
//        this.AGE = age;
//        this.HEIGHT = height;
//    }
//    
//    public double getRecomendedWeight(){
//        return ((this.HEIGHT - 100 + this.AGE / 10)*0.9);
//    }
//    
//    public void displayInfo() {
//        System.out.printf("Age: %d\nHeight: %.2fcm\n", this.AGE, this.HEIGHT);
//        System.out.printf("Your recommend weight: %.2fkg\n", getRecomendedWeight());
//    }
    
    Scanner input = new Scanner(System.in);
    private int age;
    private double height;
    public WeightCalculator(){
        System.out.print("Enter age: ");
        this.age = input.nextInt();
        System.out.print("Enter height(in centimeter, cm):  ");
        this.height = input.nextDouble();
    }
    
    public double getRecomendedWeight(){
        return ((this.height - 100 + this.age / 10)*0.9);
    }
    
    public void displayInfo() {
        System.out.printf("Age: %d\nHeight: %.2fcm\n", this.age, this.height);
        System.out.printf("Your recommend weight: %.2fkg\n", getRecomendedWeight());
    }

}
    


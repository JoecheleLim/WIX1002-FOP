/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4;

import java.util.*;
/**
 *
 * @author Lim Joechele
 */
public class L4Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int num = input.nextInt();
        System.out.print("The factors are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i ==0){
                System.out.print(i + ", ");
            }
        }
        input.close();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
        
    public static void main(String[] args) {
        Random g = new Random();
        Scanner input = new Scanner(System.in); 
        final int MAX = 100;
        int[] random = new int[20];
        int search, result, middle;
        int low = 0, high = 19,binarySearchCnt = 0 ;
        boolean freq = false, found = false;
        
        System.out.println("A list of 20 random integer within 0 to 100");
        for(int i=0; i < random.length; i++) {
            random[i] = g.nextInt(MAX+1);
            System.out.print(random[i] + " ");
        }
        
        int temp;
        for(int i=0; i < random.length; i++) {
            for (int j = 1; j < random.length; j++) {
                if (random[j] > random[j-1]){
                    temp = random[j];
                    random[j] = random[j-1];
                    random[j-1] = temp;
                } 
            }
        }
        
        System.out.println("\nArray in descending order");
        for(int i=0; i < random.length; i++) {
            System.out.print(random[i] + " ");
        }
        
        System.out.print("\nEnter a number to search: ");
        search = input.nextInt();
        for(int i=0; i < random.length; i++) {
            if (search == random[i]) {
               result = i;
               System.out.println(search + " is found");
               System.out.println("Linear Search - " + i + " loop(s)");
               freq = true;
            } 
        }
        if (freq == false) {
            System.out.println("Number is not found in linear search.");
        }
        
        while (low <= high) {
            binarySearchCnt++;
            middle = (low + high) / 2; 
            if (search == random[middle]) {
                found = true;
                System.out.println(search + " is found");
                System.out.println("Binary Search - " + binarySearchCnt + " loop(s)");
                break;
             } else if (search > random[middle]) {
                high = middle - 1;
             } else {
                low = middle + 1;
             }
        } 
            
        if (found == false){
            System.out.println("Number is not found in binary search.");
        }
     
    }
    
}


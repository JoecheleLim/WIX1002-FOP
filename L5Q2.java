/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Random;
public class L5Q2 {

    public static void main(String[] args) {
        Random g = new Random();
//        final int MAX = 20;
//        
//        int[] random = new int[10];
//        for(int i = 0; i < random.length; i++) {
//            boolean unique;
//            do {
//                unique = true;
//                random[i] = g.nextInt(MAX+1);
//                for(int j = 0; j < i; j++) {
//                    if (random[j] == random[i]) {
//                       unique = false;
//                       break;
//                    }
//                } 
//            } while (!unique); // repeat if the number is not unique
//        }
//         
//        System.out.println("10 random integer:");
//        for(int i = 0; i< random.length; i++) {
//            System.out.print(random[i] + "  ");
//        }
        
        boolean[] repeat = new boolean[21];
        int[] num = new int[20];
        int count = 0;
        
        while (count < num.length){
            int randNum = g.nextInt(20+1);
            if (!repeat[randNum]) {
                repeat[randNum] =true;
                num[count] = randNum;
                count++;
            }
        }
        
        System.out.println("10 random integer:");
        for(int i = 0; i< num.length; i++) {
            System.out.print(num[i] + "  ");
        }
    }
    
}
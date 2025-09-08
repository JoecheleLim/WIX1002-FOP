/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab8;

/**
 *
 * @author Lim Joechele
 */
import java.util.Random;
public class Number {
    private final int[] num;
    Random g = new Random();
    public Number() {
        num = new int[10];
        for (int i = 0; i<10; i++) {
          num[i] = g.nextInt(101);
        }          
    }
    
    public Number(int size) {
        num = new int[size];
        for (int i = 0; i<size; i++) {
          num[i] = g.nextInt(101);
        }          
    }
    public Number(int size, int max) {
        num = new int[size];
        max = max+1;
        for (int i = 0; i<size; i++) {
          num[i] = g.nextInt(max);
        }          
    }
    
    public void displayArray() {
        System.out.print("Array: ");
        for (int i : this.num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public void displayEven() {
        System.out.print("Even number: ");
        for(int i : this.num) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public void displayPrime() {
        boolean isPrime = false;
        System.out.print("Prime number: ");
        for(int i : this.num){
            for(int j=2; j<= Math.sqrt(i);j++) {
                if(i%j == 0) {
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public void displayMax() {
        int max = Integer.MIN_VALUE;
        for(int i : this.num) {
            max = Math.max(max, i);
        }
        System.out.println("Maximum number: " + max);
    }
    
    public void displayMin() {
        int min= Integer.MAX_VALUE;
        for(int i: this.num){
            min = Math.min(min, i);
        }
        System.out.println("Minimum number: " + min);
    }
    
    public void displayAvg(){
        int sum = 0;
        for(int i : this.num) {
            sum+=i;
        }
        double avg = (double) sum/this.num.length;
        System.out.println("Average: " + avg);
    }

    public void displaySqNum() {
        boolean isSq = false;
        System.out.print("Square number: ");
        for(int i : this.num) {
            if(Math.sqrt(i) == 0) {
                System.out.println(i + " ");
                isSq = true;
            }
        }
        if(!isSq) {
            System.out.println("None");
        }
        System.out.println();
    }
    
}

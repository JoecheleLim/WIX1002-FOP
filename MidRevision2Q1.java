/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midrevision2;

/**
 *
 * @author Lim Joechele
 */
import java.util.*;
public class MidRevision2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int i = 0, noWorker=0;
        int N, ID;
        
        System.out.print("Enter the number of staff [N]: ");
        N = input.nextInt(); 
        
        while (i < N) {
            ID = rand.nextInt(10000, 100000);
            System.out.println("Staff ID: " + ID);
            if (((ID/10)%10)%2 ==0) {          //if (Character.getNumbericValue(temp.charAt(1))%2 !=0 &&)Character.getNumbericValue(temp.charAt(3))%2 ==0 
                if (((ID/1000)%10)%2 != 0) {
                    System.out.println("Weekend Duty");
                    noWorker ++;
                } else 
                    System.out.println("Weekend Off");
            } else
                System.out.println("Weekend Off");
            i++;
        }
        System.out.println("The number of staffs work during weekend is " + noWorker);
        input.close();
        
      
    }
    
    
}

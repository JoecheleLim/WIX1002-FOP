/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.util.Scanner;
public class L5Q6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        int n = input.nextInt();
        
        System.out.println("The Pascal Triangle with " + n + " row(s)");
        int[][] PascalTri = new int[n][n];
        for (int i = 0; i < PascalTri.length; i++) {
            for(int j = 0; j< PascalTri[i].length; j++) {
                if ( j ==0 && !(i==0&&j==1)) 
                    PascalTri[i][j] = 1;
                else if (j <= i ) 
                    PascalTri[i][j] = PascalTri[i-1][j-1] + PascalTri[i-1][j]; // Top plus left
            }
        }
        
        for (int i = 0; i < PascalTri.length; i++) {
            for(int j = 0; j< PascalTri[i].length; j++) {
                System.out.print(PascalTri[i][j] + "  ");
            }
             System.out.println();
        }
        
    }
    
}

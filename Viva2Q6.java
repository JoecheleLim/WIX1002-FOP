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
public class Viva2Q6 {
    public static void main(String[] args) {
        int[][] matrix = parseMatrix();
        displayMatrix(matrix);
        
        int[][] rotatedMatrix = rotateMatrix(matrix);
        displayMatrix(rotatedMatrix);
    }
    
    public static int[][] parseMatrix(){
        Scanner input = new Scanner(System.in);
        int n;
        
        do {
        System.out.println("Dimension should between 0 and 100");
        System.out.print("Enter the dimension of the square matrix: ");
        n = input.nextInt();
        if (n >= 0 && n <= 100) {
            break;
        } else {
            System.out.println("Invalid input.");
            System.out.println("Please enter number between 0 and 100.");
        }
        }while(true);
        
        int[][] matrix = new int[n][n];
        
        for(int i =0; i<n; i++) {
            System.out.print("Enter row number " + (i+1) + " (seperated by space): ");
            for(int j=0; j<n; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }
    
    public static void displayMatrix(int[][] matrix) {
        System.out.println("The original matrix: ");
        for(int[] row : matrix) {
            for(int column : row) {
                System.out.print(column + " ");
            }
            System.out.println(); // To enter a new line
        }
    }
    
    public static int[][] rotateMatrix(int[][] matrix) {
        int n = matrix.length;
        int[][] rotatedMatrix = new int[n][n];
        
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                rotatedMatrix[j][n-1-i] = matrix[i][j];
            }
        }
        return rotatedMatrix;
    }
}

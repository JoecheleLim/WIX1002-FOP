/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

public class L5Q4 {

    public static void main(String[] args) {
        int[][] matrix = {{1,5,7}, {3,6,9}, {5,3,8}};
        int[][]rotateMatrix = new int[3][3];
                
        System.out.println("3 by 3 Matrix");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                    System.out.print(matrix[i][j]+ "  ");
            }
            System.out.println();
        }
        
        
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                    rotateMatrix[j][2-i] = matrix[i][j];
            }
        }
        
        System.out.println("After rotates 90 degrees clockwise");
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[i].length; j++) {
                     System.out.print(rotateMatrix[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
    

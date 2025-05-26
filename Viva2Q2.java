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
public class Viva2Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter two arrays with integers (comma-seperated).");
        System.out.print("Array 1: ");
        String array1 = input.nextLine();
        
        System.out.print("Array 2: ");
        String array2 = input.nextLine();
        
        // Call array
        int[] intArray1 = parseArray(array1);
        int[] intArray2 = parseArray(array2);
        
        int[] finalArray = mergeArray(intArray1, intArray2);
        
        System.out.print("Merge Array: [");
        for (int i=0; i< finalArray.length; i++) {
            if (i == finalArray.length-1) {
                System.out.print(finalArray[i]); 
            } else {
                System.out.print(finalArray[i] + ", ");
            }
        }
        System.out.println("]");
        
        input.close();
    }
   
    public static int[] parseArray(String line) {
        // Split array when there are ","
        String[] stringArray = line.split(",");
        
        int[] intArray = new int[stringArray.length];
        
        // To input number in intArray from stringArray
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        
        return intArray;
    }
    
        
    public static int[] mergeArray (int[] intArray1, int[] intArray2) {
        int size1 = intArray1.length;
        int size2 = intArray2.length;
        int[] tempArray = new int[size1 + size2];
        
        for(int i=0; i<size1; i++)  {
            tempArray[i] = intArray1[i];
        }
        
        for(int i=0; i<size2; i++) {
                tempArray[size1 +i] = intArray2[i];
        }
        
        // To sort number in ascending
        int temp;
        for(int i=1; i<tempArray.length; i++) {
            for(int j =0; j<tempArray.length-1; j++) {
                if(tempArray[j] > tempArray[j+1]) {
                    temp = tempArray[j];
                    tempArray[j] = tempArray[j+1];
                    tempArray[j+1] = temp;
                }
            }
        } 
        
        // Calculate size without repeating element
        int uniqueCount = 1;
        for(int i=0; i<tempArray.length-1; i++) {
            if(!(tempArray[i] == tempArray[i+1])) {
                uniqueCount++;
            }
        }
        
        int[] result = new int[uniqueCount];
        result[0] = tempArray[0]; // Frist element is always include
        int index = 1;  // Result array index
        for(int i=0; i<tempArray.length-1; i++) {
            if(!(tempArray[i] == tempArray[i+1])) {
                result[index++] = tempArray[i+1];
            }
        }
        return result;
    }
}

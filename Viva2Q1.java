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
public class Viva2Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("String must be lowercase and without any special character or whitespaces");
        System.out.print("Enter string: ");
        String line = input.nextLine();
        
        if(Validity(line))
            findLongestPalindromicSubstring(line);
        else
            System.out.println("Invalid input");
        
        input.close();
    }
    
    public static boolean Validity(String line) {
        char[] check = line.toCharArray();
        boolean isValid = true;
          // To check line is lowercase and no special character
        for(int i = 0; i < check.length; i++) {
            if (!(check[i] >= 'a' && check[i] < 'z' )) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }
    public static void findLongestPalindromicSubstring(String line) {
        char[] check = line.toCharArray();
        char[] reverse = new char[check.length];
        
              // Reverse the words
        for(int i = 0; i < check.length; i++) {
            reverse[i] = check[check.length-1 -i];
        }
        
        System.out.print("Longest Panlindromic Substring: ");
        for(int i = 0; i < check.length; i++) {
            if (reverse[i] == check[i])
                System.out.print(check[i]);
        }
        
    }
}

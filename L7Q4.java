/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class L7Q4 {
    public static void main(String[] args) {
        int noCh =0;
        int noWord =0;
        int noLine =0;
        try {
            Scanner input = new Scanner(new FileInputStream("lecturer.txt"));
            
            while(input.hasNextLine()) {
                String line = input.nextLine();
                noLine++;
                noCh += line.length();
                noWord += line.split(" ").length;
            }
            
            System.out.println("Number of characters: " + noCh);
            System.out.println("Number of words: " + noWord);
            System.out.println("Number of lines: " + noLine);
            
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
        } catch (IOException e) {
            System.out.println("IO Error: "  + e.getMessage());
        }
    }
}

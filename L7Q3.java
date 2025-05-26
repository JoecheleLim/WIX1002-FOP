/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Lim Joechele
 */
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class L7Q3 {
    public static void main(String[] args) {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream("reverse.txt"));
            Scanner in = new Scanner(new FileInputStream("C://UM//Year 1//Sem 1//WIX1002//NetBeans//Lab7/lecturer.txt"));
            
            while(in.hasNextLine()) {
                String line = in.nextLine();
                out.print("Original line: ");
                out.println(line);
                out.print("Reverse line: ");
                for (int i = line.length() - 1; i >=0; i--) {
                    out.print(line.charAt(i));
                }
                out.println();
            }
            
            out.close();
            in.close();
            System.out.println("The file is sucessfully created.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Problem with file output");
        }
    }
}

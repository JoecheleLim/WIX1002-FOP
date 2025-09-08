/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Lim Joechele
 */
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.EOFException;

public class L7Q1 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream( new FileOutputStream("coursename.dat"));
            
            String[] courseCode = new String[4];
            courseCode[0] = "WXES1116";
            courseCode[1] = "WXES1115";
            courseCode[2] = "WXES1110";
            courseCode[3] = "WXES1112";
            
            String[] courseName = new String[4];
            courseName[0] = "Programming I";
            courseName[1] = "Data Structure";
            courseName[2] = "Operating System";
            courseName[3] = "Computing Mathematics I";
            
            outputStream.writeUTF("Course Code : Course Name\n");
            outputStream.writeUTF(" ");
            for(int i = 0; i<courseCode.length; i++) {
                outputStream.writeUTF(courseCode[i]);
                outputStream.writeUTF(courseName[i] + "\n");
            }
            
            outputStream.close();
            System.out.println("The file is sucessfully created.");
        } catch (IOException e) {
            System.out.println("Problem with file output.");
        }
        
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("coursename.dat"));
            Scanner input = new Scanner(System.in);
            boolean found = false;
            
            System.out.print("Enter subject code: ");
            String code = input.next();
            
            try {
                while (true) {
                    String ref = inputStream.readUTF();
                    String name = inputStream.readUTF();

                    if (code.equalsIgnoreCase(ref)) {
                        System.out.println(name);
                        found = true;
                        break;
                    } 
                }   
            }catch (EOFException e) {}
            
            if (!found)
                System.out.println("Invalid code");
            
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("Problem with file input.");
        }
    }
}

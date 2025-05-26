/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

/**
 *
 * @author Lim Joechele
 */
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.EOFException;

public class L7Q5 {
    public static void main(String[] args) {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.dat"));
            
            try {
               while(true) {
                int noRecord = in.readInt();
                String[] name = new String[noRecord];
                int[] age = new int[noRecord];
                char[] gender = new char[noRecord];
                
                for(int i = 0; i<noRecord; i++) {
                    name[i]= in.readUTF();
                    age[i] = in.readInt();
                    gender[i] = in.readChar();
                }
                
                for(int i = 0; i<noRecord; i++) {
                    for (int j=0; j<noRecord-i-1; j++) {
                        if (name[j].charAt(0)>name[j+1].charAt(0)) { // Bubble Sort
                            String temp = name[j];
                            name[j] = name[j+1];
                            name[j+1] = temp;
                            
                            int temp1 = age[j];
                            age[j] = age[j+1];
                            age[j+1] = temp1;
                            
                            char temp2 = gender[j];
                            gender[j] = gender[j+1];
                            gender[j+1] = temp2;
                        }
                    }
                }
                
                for(int i =0; i<noRecord; i++) {
                    System.out.print("Name: " + name[i] + "\t\t");
                    System.out.print("Age: " + age[i] + "\t\t");
                    System.out.print("Gender: ");
                    switch (gender[i]) {
                        case 'M' -> System.out.print("Male");
                        case 'F' -> System.out.print("Female");
                    }
                    System.out.println();
                }
               }
               
            } catch (EOFException e) {
                System.out.println("End of file reached.");
            }
            
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}

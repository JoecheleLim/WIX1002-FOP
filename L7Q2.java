/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

/**
 *
 * @author Lim Joechele
 */
// Read URL
import java.util.Scanner; 
import java.net.URL; 
import java.io.InputStream; 
import java.net.URLConnection; 

// Write content
import java.io.PrintWriter; 
import java.io.FileOutputStream; 
import java.io.IOException; 

public class L7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try { 
            URL u = new URL("http://www.fsktm.um.edu.my"); 
            URLConnection cnn = u.openConnection(); 
            InputStream stream = cnn.getInputStream(); 
            Scanner in = new Scanner(stream); 
            
            PrintWriter out = new PrintWriter(new FileOutputStream("C://UM//Year 1//Sem 1//WIX1002//NetBeans//Lab7/index.htm", true));

            while(in.hasNextLine()) {
                out.println(in.nextLine());
            }
            
            out.close();
            in.close();
            System.out.println("The file is sucessfully created.");
        } catch (IOException e) { 
            System.out.println("IO Error:" + e.getMessage()); 
        }
    }

}

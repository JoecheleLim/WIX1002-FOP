/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author Lim Joechele
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
public class SubstitutionCipher implements MessageEncoder{
    private String inputFileName, outputFileName;
    private int shift;
    
    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }
    
    public String encode(String plainText) {
        String encodedMessage = "";
        for(int i = 0; i < plainText.length(); i++) {
            encodedMessage += (char) plainText.charAt(i) + shift;
        }
        return encodedMessage;
    }
    
    public String decode(String cipherText) {
        String decodedMessage = "";
        for(int i = 0; i < cipherText.length(); i++) {
               decodedMessage += cipherText.charAt(i) - shift;
        }
        return decodedMessage;
    }
    
    public void convertForm(String text) {
        try{
            BufferedReader r = new BufferedReader(new FileReader(inputFileName));
            PrintWriter w = new PrintWriter(new FileOutputStream(outputFileName));
            String input;
            String content = "", converted = "";
            
            while ((input = r.readLine())!= null) {
                content += input + "\n";
            }
            
            if(text.toLowerCase().contains("plain")) 
                converted += encode(content);
            else if (text.toLowerCase().contains("cipher"))
                converted += decode(content);
            
            w.println(converted);
            r.close();
            w.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}

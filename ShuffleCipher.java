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
public class ShuffleCipher implements MessageEncoder{
    private String inputFileName, outputFileName;
    private int shuffleCount;
    
    public ShuffleCipher (String inputFileName, String outputFileName, int N) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shuffleCount = N;
    }
    
    public String encode(String plainText) {
        String left = plainText.substring(0, plainText.length()/2);
        String right = plainText.substring(plainText.length()/2);
        String shuffle = "";
        
        for(int i = 0; i<Math.max(left.length(), right.length()); i++) {
            if(i< left.length())
                shuffle += left.charAt(i);
            shuffle += right.charAt(i);
        }
        return shuffle;
    }
    
    public String decode(String cipherText) {
        String left = "";
        String right = "";
        int length = cipherText.length();
        
        for(int i = 0; i<length; i+=2) {
            left += cipherText.charAt(i);
            right += right.charAt(i+1);
        }
        
        if (length %2 == 0 ) 
            return left + right + cipherText.charAt(length - 1);
        
        return left + right;
    }
    
    public void shuffleForm(String text) {
        try{
            BufferedReader r = new BufferedReader(new FileReader(inputFileName));
            PrintWriter w = new PrintWriter(new FileOutputStream(outputFileName));
            String input;
            String content = "";
            
            while ((input = r.readLine())!= null) {
                content += input + "\n";
            }
            for(int i = 0; i<this.shuffleCount; i++) {
                if(text.toLowerCase().contains("normal")) 
                    content = encode(content);
                else if (text.toLowerCase().contains("shuffle"))
                    content = decode(content);
            }
            
            w.println(content);
            r.close();
            w.close();
        } catch(FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
}

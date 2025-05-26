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

public class L7Q6 {
    public static void main(String[] args) {
        try {
            Scanner product = new Scanner(new FileInputStream("product.txt"));
            Scanner order = new Scanner(new FileInputStream("order.txt"));
            
            String[] pID = new String[7];
            String[] pName = new String[7];
            double[] pPrice = new double[7];
            String[] oID = new String[5];
            String[] pID_ord = new String[5];
            int[] oQty = new int[5];
            
            int i =0,j =0;
            while(product.hasNextLine()){
                String[] prod = product.nextLine().split(",");
                pID[i] = prod[0];
                pName[i] = prod[1];
                pPrice[i] = Double.parseDouble(prod[2]);
                i++;
            }
            
            while(order.hasNextLine()){
                String[] ord = order.nextLine().split(",");
                oID[j] = ord[0];
                pID_ord[j] = ord[1];
                oQty[j] = Integer.parseInt(ord[2]);
                j++;
            }
            
            System.out.println("ProductID\t\tProductName\t\tQuantity\tPricePerUnit\t\t  Total");
            
            for (i=0; i<pID.length; i++) {
                for(j=0; j<oID.length; j++) {
                    if(pID_ord[j].equals(pID[i])) {
                        double total = oQty[j]*pPrice[i];
                        System.out.printf("%9s\t%19s\t\t%8d\t%12.2f\t\t%7.2f\n", pID_ord[j], pName[i], oQty[j], pPrice[i], total );
                    }
                }
            }
            
            product.close();
            order.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}

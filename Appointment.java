/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab10;

/**
 *
 * @author Lim Joechele
 */
import java.io.*;
import java.time.LocalDateTime;

public class Appointment implements Searchable{
    public void book(String dateStartTime, String dateEndTime) {
        try {
            PrintWriter w = new PrintWriter(new FileOutputStream("Appointment.txt"), true);
            String appointment = String.format(dateStartTime, dateEndTime);
            if(search(dateStartTime,dateEndTime)) {
                 w.println(appointment);
                 System.out.println("Appointment Booked!");
            } else
                System.out.println("There are other appointments already!");
        } catch (IOException e) {
            System.out.println("IO Exception: " + e.getMessage());
        }
    }
    
    public boolean search(String dateStartTime, String dateEndTime) {
         boolean isAvailable = true;
         try{
             BufferedReader r = new BufferedReader(new FileReader("Appointment.txt"));
             String input;
             
             while((input = r.readLine()) != null) {
                 if(!noCrash(dateStartTime, dateEndTime, input)) {
                     isAvailable = false;
                     break;
                 }
             }
             
             r.close();
         } catch (FileNotFoundException e) {
             System.out.println("File not found!");
         } catch (IOException e) {
             System.out.println("IO Exception" + e.getMessage());
         }
         
         return isAvailable;
    }
   
    public boolean noCrash(String dateStartTime, String dateEndTime, String fileTime) {
        String start = fileTime.split(",")[0], end = fileTime.split(",")[1];
        LocalDateTime date_start = LocalDateTime.of(
                Integer.parseInt(dateStartTime.substring(4, 8)), // year
                Integer.parseInt(dateStartTime.substring(2, 4)), // month
                Integer.parseInt(dateStartTime.substring(0, 2)), // day
                Integer.parseInt(dateStartTime.substring(9)), // hour
                0, 0 // minute, second
        );
        LocalDateTime date_end = LocalDateTime.of(
                Integer.parseInt(dateEndTime.substring(4, 8)), 
                Integer.parseInt(dateEndTime.substring(2, 4)), 
                Integer.parseInt(dateEndTime.substring(0, 2)),
                Integer.parseInt(dateEndTime.substring(9)), 0, 0
        );
        LocalDateTime line_start = LocalDateTime.of(
                Integer.parseInt(start.substring(4, 8)), 
                Integer.parseInt(start.substring(2, 4)), 
                Integer.parseInt(start.substring(0, 2)),
                Integer.parseInt(start.substring(9)), 0, 0
        );
        LocalDateTime line_end = LocalDateTime.of(
                Integer.parseInt(end.substring(4, 8)), 
                Integer.parseInt(end.substring(2, 4)), 
                Integer.parseInt(end.substring(0, 2)),
                Integer.parseInt(end.substring(9)), 0, 0
        );
        return date_end.isBefore(line_start) || date_start.isAfter(line_end);
    }
}
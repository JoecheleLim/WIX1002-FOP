/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        // Question 1
//        System.out.println("Rectangle");
//       Rectangle rectangle = new Rectangle();
//       rectangle.display();
//       
//        System.out.println("\nSquare");
//       Square square = new Square();
//       square.display();
//       
//        System.out.println("\nCircle");
//       Circle circle = new Circle();
//       circle.display();
       
//       // Question 2 
//        System.out.print("Enter name: ");
//        String name = in.nextLine();
//        System.out.print("Enter gender: ");
//        String gender = in.nextLine();
//        System.out.print("Enter date of birth: ");
//        String DOB = in.nextLine();
//        
//        String fileName = name + " Profile";
//        
//        Student student = new Student(name, gender, DOB, fileName);
//        student.display();
//        
//        // Question 3
//        Lecturer lecturer = new Lecturer(name, gender, DOB);
//        lecturer.display();
          
          // Question 4
          System.out.print("Enter player 1's name: ");
          String name1 = in.nextLine();
          System.out.print("Enter player 2's name: ");
          String name2 = in.nextLine();
          System.out.println();
          
          Game1 p1 = new Game1(name1);
          Game1 p2 = new Game1(name2);
          
          System.out.println("Game 1");
          while(true) {
              p1.roll();
              p1.showPlayerScore();
              if (p1.getPlayerScore() >= 100)
                  break;
              p2.roll();
              p2.showPlayerScore();
              if(p2.getPlayerScore() >= 100)
                  break;
          }
          
         System.out.printf("%s won!%n", (p1.getPlayerScore() >= 100)? name1:name2);
         System.out.println();
          
         System.out.println("Game 2");
         Game2 p3 = new Game2(name1);
         Game2 p4 = new Game2(name2);
         
         while(true) {
             p3.roll();
             p3.showPlayerScore();
             if (p3.getPlayerScore() == 100)
                 break;
             p4.roll();
             p4.showPlayerScore();
             if (p4.getPlayerScore() == 100)
                 break;
         }
         
        System.out.printf("%s won!%n", (p3.getPlayerScore() == 100)? name1:name2);
        System.out.println();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midrevision1;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;
public class MidRevision1Q1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the coordinate X and Y: ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.print("Enter the move: ");
        String move = input.next();   // String move = input.next().toUpperCase();
        
        char[] charac = move.toCharArray();   // Print initial coordinate here so no need to assign more variable!!
        
        int i, ModX=0, ModY=0;
        for (i = 0; i < charac.length; i++) { // i < move.length()
            if (charac[i] == 'L' )            // char word = move.charAt(i);
                ModX = x -1;
            else if (charac[i] == 'R' ) 
                ModX = x +1;
            else if (charac[i] == 'U' ) 
                ModY = y +1;
            else if (charac[i] == 'D' ) 
                ModY = y -1;
            else 
                System.out.println("Invalid move: " + charac[i]);
        }
        
        System.out.println("Initial coordinate (" + x +","+ y + "y");
        System.out.println("Final coordinate (" + ModX +","+ ModY + ")");
        
        input.close();
        
//        for(char moves: move.toCharArray()){
//            switch (moves) {
//                case 'L':
//                    x-=1;
//                    break;
//                case 'R':
//                    x+=1;
//                    break;
//                case 'U':
//                    y+=1;
//                    break;
//                case 'D':
//                    y-=1;
//                    break;
//                default:
//                    System.out.println("Invalid move: " + moves);
//            }
//        }
    }
    
}


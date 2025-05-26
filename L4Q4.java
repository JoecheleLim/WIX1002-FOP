/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

//import java.util.*;
///**
// *
// * @author Lim Joechele
// */
//public class L4Q4 {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        
//        int year, day;
//        
//        System.out.print("Enter the year: ");
//        year = input.nextInt();
//        
//        System.out.println("0 for Sunday");
//        System.out.println("1 for Monday");
//        System.out.println("2 for Tuesday");
//        System.out.println("3 for Wedday");
//        System.out.println("4 for Thursday");
//        System.out.println("5 for Friday");
//        System.out.println("6 for Satday");
//        System.out.print("Enter the first day of the year: ");
//        day = input.nextInt();
//        
//        input.close();
//        
//        System.out.println("\nCalender of May " + year + ":");
//        displayMonthCalander(day, 4, year);
//        System.out.println("\nCalender of August " + year + ":");
//        displayMonthCalander(day, 7, year);
//        
//    }
//    public static void  displayMonthCalander(int day, int monthNo, int year) {
//        int dayBeforeMonth = getDaysBeforeMonth(day,monthNo,year);
//        int startingDay = dayBeforeMonth % 7 +1;
//        
//        System.out.println("|");
//        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
//        
//        for (int i = 0; i < startingDay; i++) {
//            System.out.print("    ");
//        }
//        int dayInMonth= getDaysInMonth(monthNo, year);
//        
//        for (int i = 1;i < dayInMonth; i++ ) {
//            System.out.printf("%3d ", i);
//            if ((startingDay + i)%7 == 0){
//            System.out.println();
//            }
//        }
//        System.out.println();
//    }
//    
//    public static int getDaysBeforeMonth(int day, int monthNo, int year) {
//        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
//        
//        if (isLeapYear(year)) {
//            daysInMonth[1] = 29;
//        }
//        
//        int totalDays = day;
//        for (int i=0; i<monthNo;i++){
//            totalDays += daysInMonth[i];
//        }
//        return totalDays;
//           
//    }
//    public static int getDaysInMonth(int monthNo, int year) {
//        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
//        
//        if (isLeapYear(year)) {
//            daysInMonth[1] = 29;
//        }
//        
//        int dayInMonth = daysInMonth[monthNo];
//        
//        return dayInMonth;
//           
//    }
//    
//    public static boolean isLeapYear(int year) {
//        if (year%4 == 0){
//            if(year%100 ==0) 
//                return true;
//            else
//                return false;
//        } else {
//            if (year%400 == 0) {
//                return true;
//            } else
//                return false; 
//        }       
//            
//    }
//}

import java.util.Scanner;

public class L4Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = 0, d1 = 0;

        System.out.print("Enter year and first day of the year (separated by 1 white space): ");
        year = sc.nextInt();
        d1 = sc.nextInt();

        int daystoMay = 31 + (isLeap(year) ? 29 : 28) + 31 + 30;
        int daystoAug = daystoMay + 31 + 30 + 31;

        displayCalendar((d1 + daystoMay) % 7, year, "May", 31);
        displayCalendar((d1 + daystoAug) % 7, year, "August", 31);

        sc.close();
    }

    static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0);
    }

    static void displayCalendar(int dayinWeek, int year, String month, int daysinMonth) {

        System.out.printf("\nCalendar for %s %d\n", month, year);
        System.out.println("┌─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
        System.out.println("│ Sun │ Mon │ Tue │ Wed │ Thu │ Fri │ Sat |");
        System.out.println("├─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
        System.out.print(("│     ").repeat(dayinWeek));

        for (int i = 1; i <= daysinMonth; i++) {

            System.out.printf("│ %s  ", (i < 10) ? "0" + i : i);
            dayinWeek++;

            if (dayinWeek % 7 == 0) {
                System.out.print("│\n├─────┼─────┼─────┼─────┼─────┼─────┼─────┤\n");
                dayinWeek = 0;
            }
        }

        System.out.print(("│     ").repeat(7 - dayinWeek) + "│\n└─────┴─────┴─────┴─────┴─────┴─────┴─────┘\n");
    }
}


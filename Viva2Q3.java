/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viva2;

/**
 *
 * @author Lim Joechele
 */
import java.util.Scanner;


public class Viva2Q3 {
    private static int totalCorrect = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int cycle = input.nextInt();
        input.nextLine();
        String[] answers = new String[cycle];
        for (int i = 0; i < cycle; i++) {
            String roman = input.nextLine();
            answers[i] = verifyOperation(roman);
        }
        System.out.println("Statement for the Roman numeral test are sent in by " + generateInitials(name) + "\n");
        for (String answer : answers) {
            System.out.println(answer);
        }
        System.out.println("\nNumber of Correct Statements = " + totalCorrect);
        // Percentage of correct statemetns
        double percentageCorrect = ((double) totalCorrect * 100 / cycle);
        System.out.printf("Percentage of Correct Statements = %.2f%%", percentageCorrect);
        input.close();
    }


    public static int convertArabics(String roman) {
        // Take in a Roman numeral, convert to Arabic numeral.
        roman = roman.toUpperCase();
        int prevValue = 0;
        int totalValue = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            int currValue = 0;
            switch (roman.charAt(i)) {
                case 'I' -> currValue = 1;
                case 'V' -> currValue = 5;
                case 'X' -> currValue = 10;
                case 'L' -> currValue = 50;
                case 'C' -> currValue = 100;
                case 'D' -> currValue = 500;
                case 'M' -> currValue = 1000;
                default -> {
                    return -1;
                }
            }
            if (prevValue > currValue) {
                totalValue -= currValue;
            } else {
                totalValue += currValue;
            }
            prevValue = currValue;
        }
        return totalValue;
    }


    public static String convertRomans(int arabic) {


        // Take in an Arabic numeral, convert to Roman numeral.
        String roman = "";
        while (arabic >= 1000) {
            roman += "M";
            arabic -= 1000;
        }
        while (arabic >= 900) {
            roman += "CM";
            arabic -= 900;
        }
        while (arabic >= 500) {
            roman += "D";
            arabic -= 500;
        }
        while (arabic >= 400) {
            roman += "CD";
            arabic -= 400;
        }
        while (arabic >= 100) {
            roman += "C";
            arabic -= 100;
        }
        while (arabic >= 90) {
            roman += "XC";
            arabic -= 90;
        }
        while (arabic >= 50) {
            roman += "L";
            arabic -= 50;
        }
        while (arabic >= 40) {
            roman += "XL";
            arabic -= 40;
        }
        while (arabic >= 10) {
            roman += "X";
            arabic -= 10;
        }
        while (arabic >= 9) {
            roman += "IX";
            arabic -= 9;
        }
        while (arabic >= 5) {
            roman += "V";
            arabic -= 5;
        }
        while (arabic >= 4) {
            roman += "IV";
            arabic -= 4;
        }
        while (arabic >= 1) {
            roman += "I";
            arabic -= 1;
        }
        return roman;
    }


    public static String generateInitials(String name) {
        // Take in one or more names, generate initials.
        String[] names = name.split(" ");


        String initials = "";
        for (String n : names) {
            switch (n) {
                case "bin":
                    break;
                case "binti":
                    break;
                case "a/l":
                    break;
                case "a/p":
                    break;
                case "al":
                    break;
                case "ap":
                    break;
                case "@":
                    break;
                case ",":
                    initials += ", ";
                    break;
                default:
                    initials += n.charAt(0);
            }
        }
        initials += " (" + name + ").";
        return initials;
    }


    public static String verifyOperation(String operationInput) {
        // Only allow, +-*/% operations.
        // numeral 3 should in between 1 and 3999
        String[] operation = operationInput.split(" ");
        // Format goes like this: 'roman_numeral_1 arithmetic_operand roman_numeral_2
        // equality_sign roman_numeral_3'


        // Check valid length or not
        if (operation.length != 5) {
            return ("Invalid Statement.");
        }


        if (!operation[3].equals("=")) {
            return ("Invalid Statement.");
        }


        int arabicNumeral1 = convertArabics(operation[0]);
        int arabicNumeral2 = convertArabics(operation[2]);
        int arabicNumeral3 = convertArabics(operation[4]);
        if (arabicNumeral1 < 1 || arabicNumeral1 > 3999 || arabicNumeral2 < 1 || arabicNumeral2 > 3999
                || arabicNumeral3 < 1 || arabicNumeral3 > 3999) {
            return ("Invalid Statement.");
        }


        String operationSymbol = operation[1];
        // If correct > return operation input is correct"
        // If incorrect > return operation input is wrong, as the answer should be
        // roman_numeral_answer
        int numeralAnswer;


        switch (operationSymbol) {
            case "+":
                numeralAnswer = arabicNumeral1 + arabicNumeral2;
                break;
            case "-":
                numeralAnswer = arabicNumeral1 - arabicNumeral2;
                break;
            case "*":
                numeralAnswer = arabicNumeral1 * arabicNumeral2;
                break;
            case "/":
                numeralAnswer = arabicNumeral1 / arabicNumeral2;
                break;
            case "%":
                numeralAnswer = arabicNumeral1 % arabicNumeral2;
                break;
            case "^":
                numeralAnswer = (int) Math.pow(arabicNumeral1, arabicNumeral2);
                break;
            default:
                return "Invalid Statement.";


        }
        String operationOutput = arabicNumeral1 + " " + operationSymbol + " " + arabicNumeral2 + " = " + numeralAnswer;


        return validateResult(operationOutput, numeralAnswer, arabicNumeral3);
    }


    public static String validateResult(String operationString, int numeralAnswer, int arabicNumeral3) {
        if (numeralAnswer == arabicNumeral3) {
            totalCorrect++;
            return operationString + " is correct.";
        } else if (!(numeralAnswer < 1 || numeralAnswer > 3999)) {
            return operationString + " is wrong, as the answer should be " + convertRomans(numeralAnswer)
                    + ", which is " + numeralAnswer + " in Arabic numeral form.";
        } else {
            return "Invalid Statement.";
        }
    }


}

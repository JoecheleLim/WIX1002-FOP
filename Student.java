/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;
import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author Lim Joechele
 */
public class Student extends PersonProfile {
    protected String fileName;
    protected String[] course_name = new String[5];
    protected String[] course_code = new String[5];
    protected String[] semester = new String[5];
    protected String[] session = new String[5];
    protected int[] mark = new int[5];
    protected String[] grade = new String[5];
    
    public Student(String name, String gender, String DOB, String fileName) {
        super(name, gender, DOB);
        this.fileName = fileName;
        try {
            Scanner in = new Scanner(new FileInputStream(new File("course.txt")));
            while(in.hasNextLine()) {
                for(int i = 0; i < mark.length; i++) {
                    course_code[i] = in.nextLine();
                    course_name[i] = in.nextLine();
                    session[i] = in.nextLine();
                    semester[i] = in.nextLine();
                    mark[i] = Integer.parseInt(in.nextLine());
                    grade[i] = Grade(mark[i]);
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
    
    public String Grade(int mark) {
        if (mark >= 85) 
            return "A";
        else if (mark >= 75)
            return "A-";
        else if (mark >= 70)
            return "B+";
        else if (mark >= 65)
            return "B";
        else if (mark >= 60)
            return "B-";
        else if (mark >= 55)
            return "C+";
        else if (mark >= 50)
            return "C";
        else if (mark >= 45)
            return "D";
        else if (mark >= 35)
            return "E";
        else
            return "F";
    }
    
    @Override
    public void display() {
        System.out.println("\n" + fileName);
        super.display();
        for(int i = 0; i < mark.length; i++) {
            System.out.println("Course code: " + course_code[i]);
            System.out.println("Course name: " + course_name[i]);
            System.out.println("Session: " + session[i]);
            System.out.println("Semester: " + semester[i]);
            System.out.println("Grade: " + grade[i]);
        }

    }
}

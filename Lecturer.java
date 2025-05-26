/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * @author Lim Joechele
 */
public class Lecturer extends PersonProfile{
    protected ArrayList<String> course_name = new ArrayList<>();
    protected ArrayList<String> course_code = new ArrayList<>();
    protected ArrayList<String> semester = new ArrayList<>();
    protected ArrayList<String> session = new ArrayList<>();
    protected ArrayList<Double> oriCredit = new ArrayList<>();
    protected ArrayList<Double> updateCr = new ArrayList<>();
    protected ArrayList<Integer> student = new ArrayList<>();
    
    public Lecturer (String name, String gender, String DOB) {
        super(name,gender,DOB);
        input();
    }
    
    public void input(){
        try {
            Scanner in = new Scanner(new FileInputStream("lecturer.txt"));
            while(in.hasNextLine()) {
                course_code.add(in.nextLine());
                course_name.add(in.nextLine());
                session.add(in.nextLine());
                semester.add(in.nextLine());
                double originalCredit = Double.parseDouble(in.nextLine());
                oriCredit.add(originalCredit);
                int noStudent = Integer.parseInt(in.nextLine());
                student.add(noStudent);
                updateCr.add(computeCredit(noStudent,originalCredit));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
    
    public double computeCredit(int noStudent, double originalCredit) {
        if (noStudent >= 150)
            return originalCredit*3;
        else if (noStudent >= 100)
            return originalCredit*2;
        else if (noStudent >= 50)
            return originalCredit*1.5;
        else
            return originalCredit;
    }
    
    @Override
    public void display() {
        System.out.println("\nLecturer: ");
        super.display();
        for(int i = 0; i < student.size(); i++) {
            System.out.println("Course code: " + course_code.get(i));
            System.out.println("Course name: " + course_name.get(i));
            System.out.println("Session: " + session.get(i));
            System.out.println("Semester: " + semester.get(i));
            System.out.println("Original credit hours: " + oriCredit.get(i));
            System.out.println("Upadated credit hours: " + updateCr.get(i));
            System.out.println("Number of students: " + student.get(i));
            System.out.println();
        }
    }
}

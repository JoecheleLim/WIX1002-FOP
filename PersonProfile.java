/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9;

/**
 *
 * @author Lim Joechele
 */
public class PersonProfile {
    protected String name, gender, DOB;
    public PersonProfile(){
        name = null;
        gender = null;
        DOB = null;
    }
    
    public PersonProfile(String name, String gender, String DOB) {
        this.name = name;
        this.gender = gender;
        this.DOB = DOB;
    }
    
    public void display() {
        System.out.println("Personal Profile: ");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + DOB);
        System.out.println();
    }
}


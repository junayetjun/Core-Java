/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package makingclassandobjects.lclass;

/**
 *
 * @author Admin
 */
public class Students extends StudentsMail{

    
 
    
    String name;
    String email;
    int marks;

    public Students() {

    }

    public Students(String name, String email, int marks) {
        this.name = name;
        this.email = email;
        this.marks = marks;
    }
    

    public Students(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public Students(String name) {
        this.name = name;
    }
    
    

    public String getResult() {
        if (marks >= 33) {
            return name + " Pass " + "and got " + marks + ". ";

        } else {
            return name + " Fail " + "and got " + marks + ". ";
        }

    }
    

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks; 
    }

    @Override
    public void setCourseName(String courseName) {
        super.setCourseName(courseName); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    

}

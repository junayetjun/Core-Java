package classtestfinalone;

import classtestfinalone.person.Student;

public class ClassTestFinalOne {

    public static void main(String[] args) {

        Student s = new Student();

        
        //using method
        s.setName("Masud");
        s.setAge(25);
        s.setStudentId(1284858);
        s.getStudentDetails();
        System.out.println("----------------------------");
        s.setName("Imran");
        s.setAge(24);
        s.setStudentId(1283558);
        s.getStudentDetails();
        System.out.println("----------------------------");
        s.setName("Sadiar");
        s.setAge(26);
        s.setStudentId(1284878);
        s.getStudentDetails();

//        System.out.println("----------------------------");        
//        System.out.println("Id- "+s.getStudentId());
//        System.out.print(""+s.getName());
//        System.out.println(" is "+s.getAge()+" years old.");
//        System.out.println("----------------------------");
//        System.out.println("Id- "+s.getStudentId());
//        System.out.print(""+s.getName());
//        System.out.println(" is "+s.getAge()+" years old.");
//        System.out.println("----------------------------");
//        System.out.println("Id- "+s.getStudentId());
//        System.out.print(""+s.getName());
//        System.out.println(" is "+s.getAge()+" years old.");
    }

}

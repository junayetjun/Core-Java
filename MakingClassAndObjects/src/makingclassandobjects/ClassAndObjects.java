
package makingclassandobjects;


import makingclassandobjects.lclass.Students;
import makingclassandobjects.lclass.StudentsMail;


public class ClassAndObjects {

    
    public static void main(String[] args) {
        
//        Students s = new Students("Junayet", 100);
//        
//        System.out.println(s.getResult());
//        System.out.println(s.getMarks());
        
//        Scanner input = new Scanner(System.in);
//        
//        int userMark= input.nextInt();
//        
//        Students istiaq = new Students("Junayet");
//        
//        istiaq.setMarks(userMark);
//        
//        System.out.println(istiaq.getResult());
     

                

        StudentsMail s = new StudentsMail(); //number1
        
        StudentsMail st = new StudentsMail(123, "samim junayet ", 
                "junayet@gmail.com", "JEE", 8);// number 2
        
        s.setName("Samim Junayet");
        s.setId(123456789);
        s.setEmail("junayet@gmail.com");
        s.setCourseName("JEE");
        s.setCourseTime(8);
        
        System.out.println(s.allDataOfStudents());//number 1
        
        System.out.println(st.allDataOfStudents()); //number 2
        
        
        Students f = new Students();
        f.setMarks(5);
        System.out.println(f.getMarks());
        
        
        
        


    }
    
    
}

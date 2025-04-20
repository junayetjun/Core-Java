
package makingclassandobjects;

import java.util.Scanner;
import makingclassandobjects.lclass.Students;


public class ClassAndObjects {

    
    public static void main(String[] args) {
        
//        Students s = new Students("Junayet", 100);
//        
//        System.out.println(s.getResult());
//        System.out.println(s.getMarks());
        
        Scanner input = new Scanner(System.in);
        
        int userMark= input.nextInt();
        
        Students istiaq = new Students("Junayet");
        
        istiaq.setMarks(userMark);
        
        System.out.println(istiaq.getResult());
    }
    
    
}

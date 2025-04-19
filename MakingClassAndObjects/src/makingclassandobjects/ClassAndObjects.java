
package makingclassandobjects;

import makingclassandobjects.lclass.Students;


public class ClassAndObjects {

    
    public static void main(String[] args) {
        
        Students s = new Students("Junayet", 100);
        
        System.out.println(s.getResult());
        System.out.println(s.getMarks());
    }
    
    
}

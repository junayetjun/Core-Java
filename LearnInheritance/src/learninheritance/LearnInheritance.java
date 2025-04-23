
package learninheritance;

import learninheritance.main.sci.Commers;
import learninheritance.main.sci.Science;


public class LearnInheritance {

   
    public static void main(String[] args) {
       
        Science s = new Science("Physics","Chemistry", "higherMath", "biology", "bangla", 
                "english", "math");
        
        System.out.println(s.getOutput());
        
         
        
        Commers c = new Commers("accounting", "finance",
                "marketing", "bangla", "english", "math");
        
        System.out.println(c.result());
        
    }
    
}

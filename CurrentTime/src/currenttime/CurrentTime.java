
package currenttime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;


public class CurrentTime {

    
    public static void main(String[] args) {     
    
        
        LocalTime myObj = LocalTime.now();
        
        System.out.println(myObj);     
        
        LocalDateTime newObj = LocalDateTime.now();
        System.out.println(newObj);
    }
    
}  

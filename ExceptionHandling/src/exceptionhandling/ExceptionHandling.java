
package exceptionhandling;

import java.util.Scanner;


public class ExceptionHandling {

    public static void main(String[] args) {
      
        
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the number");
            int input =s.nextInt();
  
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
    }
    
}

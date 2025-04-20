
package fibonaccinumberone;

import java.util.Scanner;


public class FibonacciNumberOne {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size ");
        int userInput = input.nextInt();
        
        
       int num1 = 0;
       int num2 = 1;
       
        System.out.println("My fibonacci number are ");
        for(int index=1; index <= userInput; index++){
            int num3 = num1+ num2;
            
            System.out.print(num1+ " ");
            num1= num2;
            num2= num3;
           
            
        
        
        }
        
        
        
        
        
    }
    
}

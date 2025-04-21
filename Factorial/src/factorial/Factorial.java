
package factorial;

import java.util.Scanner;


public class Factorial {

    
    public static void main(String[] args) {
       
        Scanner input = new  Scanner(System.in);
        
        System.out.println("Enter the value ");
        int userInput = input.nextInt();
        
        int num1 =1;
        
        for(int i =1; i <= userInput; i++){
            num1 *= i;        
        
        }
         System.out.println(num1 + " is a factorial number of " + userInput + ".");
        
        
    }
    
}

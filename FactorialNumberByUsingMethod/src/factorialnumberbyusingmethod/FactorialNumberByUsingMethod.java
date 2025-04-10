
package factorialnumberbyusingmethod;

import java.util.Scanner;


public class FactorialNumberByUsingMethod {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        
        int userInput =input.nextInt();
        
        String result = factorialNumber(userInput);
        
        System.out.println(result);
        
        
       
        
    }
    
    public static String factorialNumber (int userInput){
        
        int num1 =1;
        
        String result;
        
        for(int i =1; i <= userInput; i++){
            num1 *= i;            
        
        }
        result = num1 + " is factorial number of "+ userInput + ". ";
        
        return result;       
    
    
    }
    
    
    
    
}

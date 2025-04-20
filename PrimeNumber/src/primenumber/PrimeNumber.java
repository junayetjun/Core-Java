
package primenumber;

import java.util.Scanner;

public class PrimeNumber {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Number ");
        int userInput = input.nextInt();
        
        int count=0;
        
        for(int index = 1; index <= userInput; index++){
        
            if(userInput % index== 0){                
                count++;
            
            }
            
        }
        if(count==2){
        
            System.out.println(userInput+ " is a Prime number.");
        }
        else{
            System.out.println(userInput+ " is NOt a Prime number."); 
        }
       
        
        
        
    }
    
}


package sumpositiveonly;

import java.util.Scanner;


public class SumPositiveOnly {

   
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value ");
        int userValue = input.nextInt();
        
        
        int sum=0 ;
        
        while(userValue > 0){
            
            sum +=userValue;
            
        System.out.println("Enter the value ");
        userValue = input.nextInt();
        
        
        }
        System.out.println("Total Sum" + sum);
        
        
        
    }
    
}

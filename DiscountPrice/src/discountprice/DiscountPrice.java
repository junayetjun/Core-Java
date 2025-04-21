
package discountprice;

import java.util.Scanner;


public class DiscountPrice {

   
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the values ");
        double userInput = input.nextDouble();
        
        double percentage = 0.05;
        double sum;
        if(userInput > 200){
            sum = userInput * percentage;
            userInput -= sum;
            System.out.println("The actual Price "+userInput + " taka.");
            System.out.println("You get discount " + sum + " taka.");
            
        
        }
        else{
            System.out.println("Your Actual Price "+userInput + " taka.");
            System.out.println("You Don't get any Discount ");
        }
        
        
        
        
        
    }
    
}

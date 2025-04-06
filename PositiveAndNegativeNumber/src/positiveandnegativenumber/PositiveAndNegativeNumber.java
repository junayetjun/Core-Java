
package positiveandnegativenumber;

import java.util.Scanner;


public class PositiveAndNegativeNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number. ");
        
        long number = input.nextLong();
        
        if (number <0){
            System.out.println("The number is Negative");        
        
        }
        else if (number > 0){
            System.out.println("The number is Positive. ");
            
        }
        else{
            System.out.println("The number is Zero. ");
        }
        
        
        
        
        
        
        
        
    }
    
}

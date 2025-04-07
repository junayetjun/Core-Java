
package evenoroddone;

import java.util.Scanner;


public class EvenOrOddOne {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        
        long number = input.nextLong();
        
        if (number % 2 ==0){
            System.out.println("This number is Even " );                   
        
        }
        
        else {
            System.out.println("This number is odd. ");
        }
        
        
        
        
        
    }
    
}

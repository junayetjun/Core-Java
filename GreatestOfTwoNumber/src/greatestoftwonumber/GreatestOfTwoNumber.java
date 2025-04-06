
package greatestoftwonumber;

import java.util.Scanner;


public class GreatestOfTwoNumber {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First number. ");
        long numberOne = input.nextLong();
        
        System.out.println("Enter Second Number. ");
        long numberTwo = input.nextLong();
        
        if(numberOne>numberTwo){
            System.out.println(numberOne + " is bigger Number. ");
        
        }
        else{
         System.out.println(numberTwo + " is bigger Number. ");
        }
        
        
    }
    
}

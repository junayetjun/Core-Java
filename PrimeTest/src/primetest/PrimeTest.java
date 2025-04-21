
package primetest;

import java.util.Scanner;


public class PrimeTest {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Check the number Prime or Not ");
        int inputNumber = input.nextInt();
        
        System.out.println("--------------------------------");
        int count =0;
        
        for(int i = 1 ; i <= inputNumber; i++){
            if(inputNumber % i ==0){
                count++;
            
            }
           
        }
        if(count==2){
        
            System.out.println( inputNumber+" is a Prime number. ");
        
        }
        else{
            System.out.println( inputNumber+" is Not a Prime number. ");
        
        }
        
        
        
        
    }
    
}

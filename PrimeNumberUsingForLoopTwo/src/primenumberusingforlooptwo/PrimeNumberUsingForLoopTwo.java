
package primenumberusingforlooptwo;

import java.util.Scanner;


public class PrimeNumberUsingForLoopTwo {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        int num1 = input.nextInt();
        
        String result = primeNumber(num1);
        
        System.out.println(result);
        
        
       
    }
    
   public static String primeNumber(int input){
       
       String result;
       
       int count = 0;
       
       
       
       for(int i =1; i<= input; i++){
           if(input % i==0){
               count ++ ;          
           
           }          
       
       }
        if (count ==2){
               result = input+ " is Prime number ";
           }
           else {
               result =input+ " is not Prime number ";
           
           }
           
           return result;
       
       
       
   
   }
    
    
    
    
}

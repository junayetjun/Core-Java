
package primenumberusingforloop;

import java.util.Scanner;


public class PrimeNumberUsingForLoop {

   
    public static void main(String[] args) {
//        Scanner s= new Scanner(System.in);
//        
//        System.out.println("Enter number");        
//        int input = s.nextInt();
//        
//        int count =0;
//        for (int i =1; i<=input; i++ ){
//            if (input% i ==0){
//                count++;
//            }          
//        
//        }
//          if(count==2){
//                System.out.println(input + " is a prime number.");
//            }
//            else {
//                System.out.println(input + " is not a prime number. ");
//            }
        
       Scanner input = new Scanner(System.in);
       
        System.out.println("Enter the number ");
        
        long userInput = input.nextLong();
        
        long count = 0;
        
        for (int i =1; i <=userInput; i++){
            if(userInput % i == 0){
                count++;
            
            }            
        
        }
        if(count == 2){
                System.out.println("This is a Prime Number ");
            } else {
                System.out.println("This is Not a Prime number ");
            }
        
        
        
        
        
    }
    
}

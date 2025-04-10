package findprimenumber;

import java.util.Scanner;

public class FindPrimeNumberByUsingMethod {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter your number ");
        int userOne = s.nextInt();
        
        String result = OddOrEven(userOne);
        
        System.out.println(result);
//
//        String result = findPrimeNumber(userOne);
//        
//
//        System.out.println(result);
        
    }

    public static String findPrimeNumber(int userInput) {

        int count = 0;

        String result;

        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            
            result = userInput + " is a prime number.";
           
        }
        
        else {
            
             result = userInput + " is Not a prime number.";
        }

        return result;

    }
    
    public static String OddOrEven(int userInput){
        
        String result;
        
         if(userInput % 2 == 0)
             result = userInput + " is Even number.";
            
        else
            result = userInput + " is Odd number.";
    
        return result;
        
    
    }
    
    

}

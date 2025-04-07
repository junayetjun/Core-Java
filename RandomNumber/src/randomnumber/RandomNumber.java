
package randomnumber;

import java.util.Scanner;


public class RandomNumber {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number ");
        
        int num1 = input.nextInt();
        
        int randomNum = (int)( Math.random()*10);
        
        if (!(num1 == randomNum)){
//            System.out.println("You are Win");
            if(randomNum > num1){
                System.out.println("The random number is bigger than your number " + randomNum);
            
            }
            else{
                System.out.println("The random number is lower than your number " + randomNum);
            }
                    
        }
        else {
            System.out.println("You are Win ");
        }
//        else{
//            System.out.println("You are Lose " + randomNum);
//        }
//        
        
       
        
        
        
        
        
    }
    
}

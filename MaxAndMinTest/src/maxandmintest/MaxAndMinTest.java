
package maxandmintest;

import java.util.Arrays;
import java.util.Scanner;


public class MaxAndMinTest {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size ");
        int inputSize = input.nextInt();
        
        int[] numbers = new int[inputSize];
        
        for(int size = 0; size < numbers.length; size++){
            System.out.println("Enter the values "+ (size+1));
            
            int inputValues =input.nextInt();
            numbers[size]= inputValues;
        
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("--------------------------");
        
        int maxNumber  = numbers[0];
        int minNumber  = numbers[0];
        
        for(int number : numbers ){
            if(number > maxNumber){
                maxNumber=number;
                           
            }
            if(number < minNumber){
                minNumber=number;           
            
            }
          
        }
        
        System.out.println("Max number is: " + maxNumber);
        System.out.println("Min number is: " + minNumber);
        
    }
    
}

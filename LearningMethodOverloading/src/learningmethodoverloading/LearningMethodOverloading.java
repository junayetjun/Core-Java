
package learningmethodoverloading;

import java.util.Arrays;
import java.util.Scanner;


public class LearningMethodOverloading {

   
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter hoe many times you want to input ");
        
        int n =input.nextInt();
        
        int [] myArray = new int[n];
        
        for (int i =0; i< n; i++){
            
            System.out.println("Enter the number ");
            int userInput = input.nextInt();
            
            myArray [i]= userInput;
        
        }
        sum(myArray);        
        
        
        
    }
    
    public static void sum (int...a){
    
        int sum =0;
        
        for (int item : a){
        
            sum += item;
        
        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);
    
    
    }
    
    
}

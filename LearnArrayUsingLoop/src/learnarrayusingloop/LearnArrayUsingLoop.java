
package learnarrayusingloop;

import java.util.Arrays;
import java.util.Scanner;


public class LearnArrayUsingLoop {

    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter how many times you want to give value ");
        
        int userInput = input.nextInt();
        
        String[] names = new String[userInput];
        
        int[] marks = new int[userInput];
        
        for (int i = 0; i < names.length; i++){
            System.out.println("Enter the Name ");
            String userName = input.next();            
            names[i] = userName;          
            
         
            System.out.println("Enter the Marks ");
            int userMark = input.nextInt();            
            marks[i] = userMark;
            
//          System.out.println( i + 1 + "." + names[i] + " is got  " + marks[i] );
     
        }
        
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(marks));
            
        for (int i = 0; i < names.length; i++){
        System.out.println(names[i]+ " is got "+ marks[i]);
        }
         
        
        
        
        
        
    }
    
}

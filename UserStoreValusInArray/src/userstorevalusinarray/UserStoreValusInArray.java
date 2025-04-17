
package userstorevalusinarray;

import java.util.Arrays;
import java.util.Scanner;


public class UserStoreValusInArray {

        public static void main(String[] args) {
            
            Scanner input = new Scanner(System.in);
            
            System.out.println("Enter how many times you want to give values ");
            int userInput =input.nextInt();
            
            String[] names = new String[userInput];
            
            int[] marks = new int[userInput];
            
            for(int index = 0; index < names.length; index++){
                System.out.println("Enter the name ");
                String userName =input.next();
                names[index]=userName;
                
                System.out.println("Enter the mark ");
                int userMark = input.nextInt();
                marks[index]=userMark;           
                
               
            }
            
            System.out.println(Arrays.toString(names));
            System.out.println(Arrays.toString(marks));
            
            for(int i = 0; i <names.length; i++ ){
                
                System.out.println(i+ 1+". "+names[i]+ " is got " + marks[i]+ " marks.");
                            
            
            }
            
       
    }
    
}

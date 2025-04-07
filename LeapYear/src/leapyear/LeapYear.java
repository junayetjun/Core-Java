
package leapyear;

import java.util.Scanner;


public class LeapYear {

   
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Year ");
        
        int date = input.nextInt();
        
        if (date %4 == 0){
            if(date % 100 == 0){
                if (date % 400 == 0){
                    System.out.println("This is Leap Year. ");
                
                
                }
                else{
                    System.out.println("This is not Leap Year. ");
                }            
                
            }
            else {
             System.out.println("This is Leap Year.");
            }
        
        }
        else{
            System.out.println("This is not Leap Year.");
        }
        
        
        
    }
    
}

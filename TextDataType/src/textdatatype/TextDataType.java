
package textdatatype;

import java.util.Scanner;

public class TextDataType {

  
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number ");
        int number1 = input.nextInt();
        System.out.println("Emter 2nd Number ");
        int number2 = input.nextInt();
        
        int result = number1+number2;
        System.out.println(result+ " is the Number.");
        
        
    }
    
}

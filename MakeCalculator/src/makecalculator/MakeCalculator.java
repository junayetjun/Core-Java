
package makecalculator;

import java.util.Scanner;


public class MakeCalculator {

    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Radius ");
        
        int radius = input.nextInt();
        
//         final float PI = 3.1416f;
//         
//         float totalCircle = PI *(number*number);       
       
        
//        System.out.println(totalCircle);
        
        double result = Math.PI*Math.pow(radius, 2);  
        
        System.out.println(result);        
        
        
    }
    
}

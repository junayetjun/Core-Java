
package radiousinputbyuserone;

import java.util.Scanner;


public class RadiousInputByUserOne {

   
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        
        float radious = input.nextFloat();
        
        if(radious <= 0){
            System.err.println("Please Provide the POSITIVE number. ");
            double resultOne = input.nextDouble(); 
            double result = Math.PI * Math.pow(resultOne, 2);
            System.out.println(result);
            
        }
        else {
            double res = Math.PI * Math.pow(radious,2);
            System.out.println(res);
             
        }
        
        
    }
    
}

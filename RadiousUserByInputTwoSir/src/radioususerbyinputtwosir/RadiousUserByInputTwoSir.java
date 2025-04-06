
package radioususerbyinputtwosir;

import java.util.Scanner;


public class RadiousUserByInputTwoSir {

  
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        
        double radious = input.nextDouble();
        
        double result;
        
        if(radious<=0){
            System.out.println("Enter more than Zero(0) ");
            
            radious = input.nextDouble();
            result = Math.PI * Math.pow(radious,2);            
        
        }
        else {
            result = Math.PI * Math.pow(radious,2);
        }
        System.out.println(result);
        
    }
    
}

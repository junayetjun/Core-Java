
package calculatorusingswitch;

import java.util.Scanner;


public class CalculatorUsingSwitch {

   
    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        double num1 = s.nextDouble();
        
        
        System.out.println("Enter 2nd number ");
        double num2 = s.nextDouble();
        
        System.out.println("Enter your choice as like + - / * ");
//        String choice = s.next();
        double result = 0;
        
        char choice =s.next().charAt(0);
        switch (choice) {
            case '+':
                result = num1+num2;
                    break;
            case '-':
                result = num1-num2;
                    break;
            case '/':
                result = num1/num2;
                    break;
            case '*':
                result = num1*num2;
                    break;
            default:
                System.out.println("Errors.");
        }
        
        System.out.println("Result is " + result);




      
        
        
        
        
        
    }
    
}

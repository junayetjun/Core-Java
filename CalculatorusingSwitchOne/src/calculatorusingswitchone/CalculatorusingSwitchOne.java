
package calculatorusingswitchone;

import java.util.Scanner;


public class CalculatorusingSwitchOne {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter 1st number ");
        double num1 = s.nextDouble();
        
        System.out.println("Enter 2nd number ");
        double num2 = s.nextDouble();
        
        System.out.println("Enter your choice like as + - / * ");
        String choice = s.next();
        
        double result = 0;
        
        switch (choice){
            case "+":
                result = num1+num2;
                    break;
                    
            case "-":
                result = num1-num2;
                    break;
            case "/":
                result = num1/num2;
                    break;
            case "*":
                result = num1*num2;
                    break;
            default:
                System.out.println("Invalid choice");
        
        }
        
        System.out.println("Result is " + result);
        
        
    }
    
}

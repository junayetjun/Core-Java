package fibonaccinumber;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        long inputNumber = input.nextLong();
        
        System.out.println("--------------------");
        
        int num1 = 0;
        int num2 = 1;
        System.out.println("My fibonacci series is ");
        
        for (int index = 1; index <= inputNumber; index++) {
            int num3 = num1+ num2;
            System.out.print(num1 + ", ");
            num1=num2;
            num2=num3;
            
            
        }

        
       
    }

}

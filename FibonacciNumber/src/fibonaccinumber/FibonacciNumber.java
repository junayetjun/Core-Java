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
        int sum = 0;
        
        for (int index = 1; index <= inputNumber; index++) {
            
            System.out.print(sum + ", ");
            
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
        }

        
       
    }

}

package fibonaccitest;

import java.util.Scanner;

public class FibonacciTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number....");
        int userInput = input.nextInt();

        int n1 = 0;
        int n2 = 1;
        
        System.out.println("Your Fibonacci Numbers are ");
        System.out.println("----------------------------");
        for (int index = 1; index <= userInput; index++) {
            int n3 = n1 + n2;
            System.out.print(n1 + ", ");

            n1 = n2;
            n2 = n3;

        }

    }

}

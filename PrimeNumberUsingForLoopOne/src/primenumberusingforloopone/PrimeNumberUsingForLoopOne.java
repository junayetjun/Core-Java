package primenumberusingforloopone;

import java.util.Scanner;

public class PrimeNumberUsingForLoopOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number ");
        int userInput = input.nextInt();

        int count = 0;

        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                count++;

            }

        }
        if (count == 2) {
            System.out.println(userInput + " is a prime number ");
        } else {
            System.out.println(userInput + " is not a prime number ");
        }

    }

}

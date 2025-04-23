package bigintegerfactorial;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerFactorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value ");
        int userInput = input.nextInt();

        BigInteger factorial = BigInteger.ONE;

        for (int i = 1; i <= userInput; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("Factorial number is " + factorial);

    }

}

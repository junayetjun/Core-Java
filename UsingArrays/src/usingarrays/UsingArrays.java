package usingarrays;

import java.util.Arrays;
import java.util.Scanner;

public class UsingArrays {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many times do you want to give value ");

        int userInput = input.nextInt();

        int myArray[] = new int[userInput];

        for (int i = 0; i < userInput; i++) {

            System.out.println("Enter the number ");
            int userNumber = input.nextInt();

            myArray[i] = userInput;

        }
        sum(myArray);

    }

    public static void sum(int... a) {

        int sum = 0;

        for (int item : a) {

            sum += item;

        }
        System.out.println(Arrays.toString(a));
        System.out.println(sum);

    }

}

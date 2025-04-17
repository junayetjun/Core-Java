package minandmaxnumbermethod;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMaxNumberMethod {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Enter limit ");
        int userInput =input.nextInt();
        
        String result = maxMinNumber(userInput);
        
        System.out.println(result);
        
                

    }

    public static String maxMinNumber(int a) {
        
        int[] numbers = new int[a];

//         int maxNumber = 0;
//         int minNumber = 999999999;
//         
        for (int index = 0; index < a; index++) {

            System.out.println("Enter number " + (index + 1));
            int userNumber = input.nextInt();

            numbers[index] = userNumber;
        }
        System.out.println("My numbers are " + Arrays.toString(numbers));

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int number : numbers) {
            if (number > maxNumber) {
                maxNumber = number;

            }
            if (number < minNumber) {
                minNumber = number;
            }

        }
        String message= "Max number is "+ maxNumber+"\n"+ "Min number is "+ minNumber;
        
        return message;

//        System.out.println("Max number is " + maxNumber);
//        System.out.println("Min number is " + minNumber);

    }

}

}

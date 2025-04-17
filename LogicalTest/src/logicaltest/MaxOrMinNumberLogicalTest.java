package logicaltest;


import java.util.Arrays;
import java.util.Scanner;

public class MaxOrMinNumberLogicalTest {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Limit ");
        int size = input.nextInt();

        int[] numbers = new int[size];
        
//         int maxNumber = 0;
//         int minNumber = 999999999;
//         
        for (int index = 0; index < size; index++) {
             
            System.out.println("Enter number " + (index + 1));
            int userNumber = input.nextInt();

            numbers[index] = userNumber;
        }      
        System.out.println("My numbers are " +Arrays.toString(numbers));

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

        System.out.println("Max number is " + maxNumber);
        System.out.println("Min number is " + minNumber);

    }

    
    
}

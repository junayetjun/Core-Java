
package maxandminnumber;

import java.util.Arrays;
import java.util.Scanner;


public class MaxAndMinNumber {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Size ");
        int size = input.nextInt();
        
        int[] numbers = new int[size];

        
        for (int index = 0; index < numbers.length; index++) {

            System.out.println("Enter number " + (index + 1));
            int userNumber = input.nextInt();

            numbers[index] = userNumber;
        }
        
        System.out.println("My numbers are " + Arrays.toString(numbers));
        System.out.println("------------------------");

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

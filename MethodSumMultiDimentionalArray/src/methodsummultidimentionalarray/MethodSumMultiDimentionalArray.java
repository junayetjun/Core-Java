package methodsummultidimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class MethodSumMultiDimentionalArray {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter the rows number  ");
        int rowSize = input.nextInt();

        System.out.println("Enter the cols number  ");
        int colSize = input.nextInt();

        int[][] numbers = new int[rowSize][colSize];

        for (int row = 0; row < numbers.length; row++) {
            for (int column = 0; column < numbers[row].length; column++) {
                System.out.println("Enter value for row " + (row + 1) + " x column " + (column + 1));
                int userInput = input.nextInt();
                numbers[row][column] = userInput;
            }

        }
        System.out.println(Arrays.deepToString(numbers));
        
        SumByMultiDimentionalArray(numbers);

    }

    public static void SumByMultiDimentionalArray(int myArray[][]) {

        int sum = 0;

        for (int row = 0; row < myArray.length; row++) {

            for (int column = 0; column < myArray[row].length; column++) {

                sum += myArray[row][column];

            }

            System.out.println(" My sum is " + sum);

        }
 
    }

}

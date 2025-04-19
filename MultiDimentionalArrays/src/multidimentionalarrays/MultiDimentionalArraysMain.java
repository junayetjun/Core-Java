package multidimentionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArraysMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

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
        System.out.println("My Arrays are ");
                System.out.println("--------------------------");

   
        for (int row = 0; row < numbers.length; row++) {

            for (int column = 0; column < numbers[row].length; column++) {
                
                
                System.out.print(numbers[row][column] + " ");
            }
            System.out.println("");
        }
    }

}

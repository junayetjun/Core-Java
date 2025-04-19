package multidimentionalarraysum;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArraySum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Rows number ");
        int rowsSize = input.nextInt();

        System.out.println("Enter the Columns number ");
        int columnsSize = input.nextInt();

        int[][] numbers = new int[rowsSize][columnsSize];

        for (int rows = 0; rows < numbers.length; rows++) {
            for (int cols = 0; cols < numbers[rows].length; cols++) {
                System.out.println("Enter value for row " + (rows + 1) + " x column " + (cols + 1));
                int userInput = input.nextInt();
                numbers[rows][cols] = userInput;

            }

        }
        System.out.println(Arrays.deepToString(numbers));
        System.out.println("My Arrays are ");
        System.out.println("--------------------------");

        for (int rows = 0; rows < numbers.length; rows++) {
            
            for (int cols = 0; cols < numbers[rows].length; cols++) {
                
                System.out.println(numbers[rows][cols]+" ");
 
            }
            System.out.println("");
        }

    }

}

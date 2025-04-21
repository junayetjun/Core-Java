package bubblesorttest;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size ");
        int inputSize = input.nextInt();

        int[] myArrrays = new int[inputSize];

        for (int index = 0; index < myArrrays.length; index++) {
            System.out.println("Enter the values " + (index+1));

            int userValues = input.nextInt();
            myArrrays[index] = userValues;

        }

        System.out.println("Before sorting " + Arrays.toString(myArrrays));
        System.out.println("---------------------------------");

        for (int round = 0; round < myArrrays.length - 1; round++) {
            for (int step = 0; step < myArrrays.length - 1 - round; step++) {

                if (myArrrays[step] > myArrrays[step + 1]) {
                    
                    int temp = myArrrays[step];
                    myArrrays[step] = myArrrays[step + 1];
                    myArrrays[step + 1] = temp;

                }

            }

        }

        System.out.println("After sorting " + Arrays.toString(myArrrays));

    }

}

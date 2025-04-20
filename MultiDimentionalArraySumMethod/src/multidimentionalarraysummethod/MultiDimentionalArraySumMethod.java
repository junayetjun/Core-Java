package multidimentionalarraysummethod;

import java.util.Arrays;

public class MultiDimentionalArraySumMethod {

    public static void main(String[] args) {
        int[][] myArray= new int[4][4];
        myArray[2][1]=1;
        
        
        multiDimentionalArraySum(myArray);
        
        System.out.println(Arrays.deepToString(myArray));

    }

    public static void multiDimentionalArraySum(int myArray[][]) {

        int sum = 0;

        for (int rows = 0; rows < myArray.length; rows++) {
            
            for (int cols = 0; cols < myArray[rows].length; cols++) {
                sum += myArray[rows][cols];

            }

        }

    }

}

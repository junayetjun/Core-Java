package exceptionhandling;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {

//        try {
//            int i = 10/0;
//        } catch (ArithmeticException e) {
//            System.out.println(e);
//        }
//        
//        try {
//            int[] myArray = {1,2,3};
//            
//            int res = myArray[4];
//           // System.out.println(Arrays.toString(myArray));
//            System.out.println(res);
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println(e);
//        }
//        
        try {
            Object[] array = new String[5];
           // array[0] = "Hello"; // OK
            array[1] = 123;

        } catch (ArrayStoreException e) {
            System.out.println(e);
        }

        // Throws ArrayStoreException
    }

}

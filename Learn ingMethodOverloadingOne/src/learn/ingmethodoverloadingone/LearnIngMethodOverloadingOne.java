package learn.ingmethodoverloadingone;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LearnIngMethodOverloadingOne {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the number ");
//
//        int result = input.nextInt();
        
        sum(10,20,30,40);
       
        
        

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

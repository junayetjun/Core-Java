package radiousinputbyuser;

import java.util.Scanner;

public class RadiousInputByUser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radious number ");

        double firstInput = input.nextDouble();

        if (firstInput > 0) {

            double result = Math.PI * Math.pow(firstInput, 2);

            System.out.println("" + result);


        } else {
            System.err.println(" Please provide POSITIVE number. ");

            double resultTwo = input.nextDouble();
            double resultElse = Math.PI * Math.pow(firstInput, 2);
            System.out.println("" + resultElse);

        }

//        double result = Math.PI * Math.pow(firstInput,2);
//        
//        System.out.println(result);
////         Scanner input = new Scanner(System.in);
//        System.out.println("Enter number");
//        
//        int radius = input.nextInt();
////        final float PI = 3.1416f;
////        float result= PI * (radius*radius);
//
//// System.out.println("The Result is "+ result);
//
//double result= Math.PI*Math.pow(radius, 2);
//        System.out.println(result);
    }

}

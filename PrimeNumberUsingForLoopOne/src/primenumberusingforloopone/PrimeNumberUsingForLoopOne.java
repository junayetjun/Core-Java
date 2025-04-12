package primenumberusingforloopone;

import java.util.Scanner;

public class PrimeNumberUsingForLoopOne {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter number ");
//        int userInput = input.nextInt();
//
//        int count = 0;
//
//        for (int i = 1; i <= userInput; i++) {
//            if (userInput % i == 0) {
//                count++;
//
//            }
//
//        }
//        if (count == 2) {
//            System.out.println(userInput + " is a prime number ");
//        } else {
//            System.out.println(userInput + " is not a prime number ");
//        }

//          Scanner input = new Scanner(System.in);
//          
//          System.out.println("Enter the number ");
//          long userInput = input.nextLong();
//          
//          int count = 0;
//          
//          for (int i =1 ; i <= userInput; i++){
//              if(userInput % i == 0){
//                  count++;
//              } 
//          
//          }
//          if(count == 2){
//              System.out.println(userInput+ " is a Prime number. ");
//          
//          }else{
//              System.out.println(userInput+ " is Not a Prime number. ");
//          }
        //Making mini calculator below
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter 1st number ");
//        long num1 = input.nextLong();
//
//        System.out.println("Enter 2nd number ");
//        long num2 = input.nextLong();
//
//        System.out.println("Enter which function do you want to use ");
//        char function = input.next().charAt(0);
//
//        long result = 0;
//
//        switch (function) {
//            case '/':
//                result = num1 / num2;
//                break;
//            case '*':
//                result = num1 * num2;
//                break;
//            case '-':
//                result = num1 - num2;
//                break;
//            case '+':
//                result = num1 + num2;
//                break;
//            default:
//                System.out.println("Errors");
//        }
//        System.out.println("result is "+result);
        //FindPrimeNumber 
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");

        long userInput = input.nextLong();

        long count = 0;

        for (int i = 1; i <= userInput; i++) {
            if (userInput % i == 0) {
                count++;
            }
           
        }
         if (count == 2) {
                System.out.println(userInput + " is a Prime number. ");

            } else {
                System.out.println(userInput + " is Not a Prime number. ");
            }


    }

}

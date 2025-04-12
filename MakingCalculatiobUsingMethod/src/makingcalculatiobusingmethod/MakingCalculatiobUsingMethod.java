package makingcalculatiobusingmethod;

import java.util.Scanner;

public class MakingCalculatiobUsingMethod {

    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter 1st number ");
//        int num1 = input.nextInt();
//
//        System.out.println("Enter the 2nd number ");
//        int num2 = input.nextInt();
//
//        System.out.println("which function do you want to use + - / * ");
//        
//        String choice = input.next();
//        
//        double result = 0;
//
//        
//
//        switch (choice) {
//            case "+":
//                result = num1 + num2;
//                break;
//            case "-":
//                result = num1 - num2;
//                break;
//            case "*":
//                result = num1 * num2;
//                break;
//            case "/":
//                result = num1 / num2;
//                break;
//            default:
//                System.out.println("Error ");
//
//        }
//        System.out.println(result);
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1st number ");
        int num1 =input.nextInt();
        
        System.out.println("Enter 2nd number ");
        int num2 =input.nextInt();
        
        System.out.println("Enter which option do you want to use such as + - * / ");
        
        String choice =input.next();
        
        double result =0;
        
        switch(choice){
            case "+" -> result =num1+num2;
            case "-" -> result =num1-num2;
            case "*" -> result =num1*num2;
            case "/" -> result =num1/num2;
            default -> System.out.println("Errors");
        
        }
        System.out.println("Result is: " + result);
        
        
        
        

    }

}

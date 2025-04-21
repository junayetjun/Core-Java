
package allfile;

import java.util.Arrays;
import java.util.Scanner;


public class AllFile {

    
    public static void main(String[] args) {
       
        // Its Fibonacci
//         Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the Number....");
//        int userInput = input.nextInt();
//
//        int n1 = 0;
//        int n2 = 1;
//        
//        System.out.println("Your Fibonacci Numbers are ");
//        System.out.println("----------------------------");
//        for (int index = 1; index <= userInput; index++) {
//            int n3 = n1 + n2;
//            System.out.print(n1 + ", ");
//
//            n1 = n2;
//            n2 = n3;
//
//        }
        
        
        // Its Prime Number

//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Check the number Prime or Not ");
//        int inputNumber = input.nextInt();
//        
//        System.out.println("--------------------------------");
//        int count =0;
//        
//        for(int i = 1 ; i <= inputNumber; i++){
//            if(inputNumber % i ==0){
//                count++;
//            
//            }
//           
//        }
//        if(count==2){
//        
//            System.out.println( inputNumber+" is a Prime number. ");
//        
//        }
//        else{
//            System.out.println( inputNumber+" is Not a Prime number. ");
//        
//        }
        
        
        // Its Max And Min

//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("Enter the size ");
//        int inputSize = input.nextInt();
//        
//        int[] numbers = new int[inputSize];
//        
//        for(int size = 0; size < numbers.length; size++){
//            System.out.println("Enter the values "+ (size+1));
//            
//            int inputValues =input.nextInt();
//            numbers[size]= inputValues;
//        
//        }
//        System.out.println(Arrays.toString(numbers));
//        System.out.println("--------------------------");
//        
//        int maxNumber  = numbers[0];
//        int minNumber  = numbers[0];
//        
//        for(int number : numbers ){
//            if(number > maxNumber){
//                maxNumber=number;
//                           
//            }
//            if(number < minNumber){
//                minNumber=number;           
//            
//            }
//          
//        }
//        
//        System.out.println("Max number is: " + maxNumber);
//        System.out.println("Min number is: " + minNumber);





        // Its a factorial 

//        Scanner input = new  Scanner(System.in);
//        
//        System.out.println("Enter the value ");
//        int userInput = input.nextInt();
//        
//        int num1 =1;
//        
//        for(int i =1; i <= userInput; i++){
//            num1 *= i;        
//        
//        }
//         System.out.println(num1 + " is a factorial number of " + userInput + ".");
        
        

        // Its Bubble Sort

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter the size ");
//        int inputSize = input.nextInt();
//
//        int[] myArrrays = new int[inputSize];
//
//        for (int index = 0; index < myArrrays.length; index++) {
//            System.out.println("Enter the values " + (index+1));
//
//            int userValues = input.nextInt();
//            myArrrays[index] = userValues;
//
//        }
//
//        System.out.println("Before sorting " + Arrays.toString(myArrrays));
//        System.out.println("---------------------------------");
//
//        for (int round = 0; round < myArrrays.length - 1; round++) {
//            for (int step = 0; step < myArrrays.length - 1 - round; step++) {
//
//                if (myArrrays[step] > myArrrays[step + 1]) {
//                    
//                    int temp = myArrrays[step];
//                    myArrrays[step] = myArrrays[step + 1];
//                    myArrrays[step + 1] = temp;
//
//                }
//
//            }
//
//        }
//
//        System.out.println("After sorting " + Arrays.toString(myArrrays));


        // Its Discount and Price

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the values ");
        double userInput = input.nextDouble();
        
        double percentage = 0.05;
        double sum;
        if(userInput > 200){
            sum = userInput * percentage;
            userInput -= sum;
            System.out.println("The actual Price "+userInput + " taka.");
            System.out.println("You get discount " + sum + " taka.");
            
        
        }
        else{
            System.out.println("Your Actual Price "+userInput + " taka.");
            System.out.println("You Don't get any Discount ");
        }
        
        
        
    }
    
}

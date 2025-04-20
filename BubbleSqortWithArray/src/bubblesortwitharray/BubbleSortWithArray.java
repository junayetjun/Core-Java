
package bubblesortwitharray;

import java.util.Arrays;
import java.util.Scanner;


public class BubbleSortWithArray {

    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size ");
        int size =input.nextInt();
        
        int[] myArray = new int[size];
        
        for(int index = 0; index < myArray.length; index++){
            System.out.println("Enter the value ");
            int userInput =input.nextInt();
            myArray[index]=userInput;        
        
        
        }
        System.out.println("Before sorting  " + Arrays.toString(myArray));
        System.out.println("-----------------------------------");
        
        
        for(int round = 0; round < myArray.length-1; round++){
            for(int step=0; step <myArray.length-1-round; step++){
                if(myArray[step] > myArray[step+1]){
                    int temp = myArray[step];
                    myArray[step]=myArray[step+1];
                    myArray[step+1]= temp;
                
                }
            
            }
        
        }
       System.out.println("After sorting  " + Arrays.toString(myArray));
        
        
    }
    
}


package bubblesort;

import java.util.Arrays;
import java.util.Scanner;


public class BubbleSort {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the size ");
        int userInput = input.nextInt();
        
        int[] arrays = new int[userInput];
        
        for (int index = 0; index < arrays.length; index++){
            
            System.out.println("Enter the value " + (index+1));
            int userValue = input.nextInt();
            arrays[index]=userValue;        
        
        }
        
        System.out.println("Before sorting " + Arrays.toString(arrays));
        System.out.println("-------------------------------");
        
        for (int round = 0; round < arrays.length-1; round++){
            for(int step = 0; step < arrays.length-1-round; step++){
                if(arrays[step] > arrays[step+1]){//5 10
                   int temp = arrays[step];//5
                   arrays[step]=arrays[step+1];//10
                   arrays[step+1]=temp;//5 
                      
                    
                }
            }
            
        }
        
         System.out.println("After sorting " + Arrays.toString(arrays));
        
    }
    
}

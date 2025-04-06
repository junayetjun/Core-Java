

package oddoreven;

import java.util.Scanner;

public class OddOrEven {

   
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        
        long num = reader.nextLong();

        if(num % 2 == 0)
            System.out.println(num + " is even number.");
        else
            System.out.println(num + " is odd number. ");           
                     
     
    }
    
}

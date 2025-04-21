
package fibonacci;

import java.util.Scanner;


public class Fibonacci {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number ");
        int userInpt = input.nextInt();
        
        int n1= 0; 
        int n2 =1; 
        System.out.println("The Fibonacci number are: ");
        System.out.println("----------------------------");
        for (int index = 1; index <=userInpt; index++){
            int n3 =n1+ n2;
            System.out.print(n1+ ", ");
            n1=n2;
            n2=n3;    
        
        
        }
        
    }
    
}

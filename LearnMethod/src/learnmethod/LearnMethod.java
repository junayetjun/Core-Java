
package learnmethod;

import java.util.Scanner;


public class LearnMethod {

   
    public static void main(String[] args) {       
//        System.out.println((int)doSum(10, 20, 0));
//        System.out.println(doSum(10, 20, 0));



        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter 1st number ");
        int a = input.nextInt();
        
        System.out.println("Enter 2nd number ");
        float s = input.nextFloat();
        
        System.out.println("Enter 3rd number ");
        double d = input.nextDouble();
        
        float result = doSum(a, s, d);
        
        System.out.println(result);
        
        
        
    }
    
    public static float doSum(int num1, float num2, double num3){
        
        float result = (float) (num1+ num2+ num3);
        
        return result;
    
     }
    
    
}

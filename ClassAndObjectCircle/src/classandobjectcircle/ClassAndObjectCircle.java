
package classandobjectcircle;

import classandobjectcircle.lclass.Circle;
import java.util.Scanner;


public class ClassAndObjectCircle {

    
    public static void main(String[] args) {
        
        
//        Circle c = new Circle(5);
//        
//        System.out.println(c.getArea());
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the value");
        int userValue = input.nextInt();
        
        Circle result = new Circle (userValue);
        
        result.setRadious(userValue);
        
        System.out.println(result.getPreimeter());
        System.out.println(result.getArea());
      
    }
    
}

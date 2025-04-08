
package concateuse;

import java.util.Scanner;


public class ConcateUse {

    
    public static void main(String[] args) {
        
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the name");
//        
//        String name = input.next();
//        
//        
//        System.out.println("Output: "+name.concat(" Programmer") );
//        
        

Scanner s = new Scanner(System.in);
        System.out.println("Enter the Year ");
        
        String year = s.next();
        System.out.println("Enter the Month ");
        String month = s.next();
        
        System.out.println("Enter the Date ");
        String date = s.next();
        
        
//         System.out.println("Output: " + month.concat(" "+date + ", "+ year ));
         System.out.println("Output: " + month.concat(" ").concat(date).concat(", ").concat(year));


        
        
    }
    
}

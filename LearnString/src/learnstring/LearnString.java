package learnstring;

import java.util.Scanner;

public class LearnString {

    public static void main(String[] args) {
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        
       

        String message = s.nextLine();

        System.out.println("Length = " + message.length());
        System.out.println("Char AT = " + message.charAt(3));
        System.out.println("Concate = " + message.concat("123"));
        System.out.println("Trim =" + message.trim());

    }

}

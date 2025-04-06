
package vowelandconstant;

import java.util.Scanner;


public class VowelAndConstant {

   
    public static void main(String[] args) {
        
       
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Letter ");
        
        char letter = input.next().toUpperCase().charAt(0);
        
        if(letter == 'A' || letter == 'E' || letter== 'I' || letter== 'O'|| letter=='U'){
            System.out.println(letter+ " is a Vowel. ");
        }
        else if(letter>= 'A' && letter<= 'Z') {
            System.out.println(letter+ " is a Consonant. ");
        }
        else {
        
            System.out.println("This is not Valid Letter. ");
        }
       
        
        
        
    }
    
}

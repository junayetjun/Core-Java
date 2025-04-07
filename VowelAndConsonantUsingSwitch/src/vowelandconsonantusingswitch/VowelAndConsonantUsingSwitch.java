
package vowelandconsonantusingswitch;

import java.util.Scanner;


public class VowelAndConsonantUsingSwitch {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the letter ");
        
        String letter = input.next().toUpperCase();
        
        
        
        switch (letter){
            case "A":
                System.out.println("This is a Vowel Letter. ");
                        break;
            case "E":
                System.out.println("This is a Vowel Letter. ");
                        break;
            case "I":
                System.out.println("This is a Vowel Letter. ");
                        break;
            case "O":
                System.out.println("This is a Vowel Letter. ");
                        break;
            case "U":
                System.out.println("This is a Vowel Letter. ");
                        break;
            default:
                System.out.println("This is a Consonant Letter. ");                    
         
        }
        
        
        
        
       
       
        
      
        
        
        
        
        
        
    }
    
}

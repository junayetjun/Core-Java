
package vowelandconsonantwo;

import java.util.Scanner;


public class VowelAndConsonanTwo {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Alphabet");
        
        String letter = input.next();
        
        if(letter.equalsIgnoreCase("A")|| letter.equalsIgnoreCase("E")||
                letter.equalsIgnoreCase("I")|| letter.equalsIgnoreCase("O")||
                letter.equalsIgnoreCase("U")){
                    
            System.out.println("This is a vowel Letter. ");
//        This is not right way to do vowel consonant work.


        }
        else if (letter >= "A" && letter <= "Z"){
            System.out.println("This is a Consonant Letter.");
        
        }
        
        else {
            System.err.println("This is not a valid Letter");
        }
        
        
        
        
        
        
        
        
    }
    
}

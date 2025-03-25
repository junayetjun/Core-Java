
package secondsconvert1;

import java.util.Scanner;


public class SecondsConvert1 {

    public static void main(String[] args) {
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter Seconds ");
        
        int totalSeconds = scanner.nextInt();
        
        int hours = totalSeconds/3600;
        int remainingSeconds = totalSeconds % 3600;
        
        int minutes = remainingSeconds/60;
        int seconds = remainingSeconds % 60;       
      
                
        System.out.println(seconds+ " seconds "+ hours + " hours "+ minutes + " minutes ");
        
    }
    
}

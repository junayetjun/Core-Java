
package fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileClass {

    
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size ");
        int size =s.nextInt();
        
        
        
        try {
            //        File f = new File("C:\\Users\\User\\Desktop\\file\\samim.txt");
            
            for(int i =1; i <=size; i++){
                System.out.println("Enter the File Name ");
                String fileName = s.nextLine();
                PrintWriter pw = new PrintWriter("C:\\Users\\User\\Desktop\\file"+ fileName + ".text");
                System.out.println("Enter the Input ");
                String userInput = s.nextLine();
                pw.print(i+ " "+userInput );
                
            
            }
            
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileClass.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
    
}

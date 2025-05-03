
package classtestforfinal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ClassTestForFinal {

   
    public static void main(String[] args) {
       
        File f = new File("C:\\Users\\Admin\\Desktop\\junayet.txt");
        
        PrintWriter pw;
        
        
        try {
            pw = new PrintWriter(f);
            
             pw.println("Hello Java ");
             pw.println("Hello World ");
             pw.println("Hello Sir ");
             pw.print("Hello Imran \n" );
             
             pw.write("Istiaq \n");
             pw.write("JUnayet \n");
             pw.append("Masud");
             
            pw.close();
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClassTestForFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Scanner s = new Scanner(f);
            
          while(s.hasNextLine()){
              System.out .println(s.nextLine());
          
          }
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ClassTestForFinal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
        
    }
    
}

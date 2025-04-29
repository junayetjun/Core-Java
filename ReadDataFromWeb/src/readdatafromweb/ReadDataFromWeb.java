
package readdatafromweb;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReadDataFromWeb {

   
    public static void main(String[] args) throws IOException {
       
        try {
           
            
            URL url = new URL("https://www.ehemranhossain.com/");
             Scanner scanner = new Scanner(url.openStream());
             System.out.println(scanner.nextLine());
            
            
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(ReadDataFromWeb.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
}

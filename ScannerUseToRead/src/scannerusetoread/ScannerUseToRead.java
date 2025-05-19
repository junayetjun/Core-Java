package scannerusetoread;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScannerUseToRead {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\User\\Desktop\\junayet.txt");
        try {
            Scanner s = new Scanner(f);

//            while (s.hasNext()) {
//                
//                String st = s.nextLine();
//                
//                String[] myArray = st.split(" ");
//                
//                System.out.println(Arrays.toString(myArray));
//
//            }
//            s.close();
            System.out.println(s.nextLine());
             while(s.hasNext()){
                 System.out.println(s.nextLine());
             
             }
             s.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ScannerUseToRead.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

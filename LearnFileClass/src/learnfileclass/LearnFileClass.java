package learnfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFileClass {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Users\\Admin\\Desktop\\sam.txt");

        try { //This is for read file 
            FileReader fr = new FileReader(f);

            System.out.println(fr.read());

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }

        try { // Print same file repeated 
            PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\junayet.txt");
            for (int i = 1; i <= 10; i++) {
//                PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\junayet.txt" + (i + 1));

                pw.println("I Love Java " + (i + 1));

            }
            pw.close();
//            PrintWriter pw =new Pri ntWriter("C:\\Users\\Admin\\Desktop\\junayet.txt");
//            
//            
//            pw.println("I Love Java.");
//            pw.println("I Love Coding.");
//            pw.println("I Love Technology.");

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

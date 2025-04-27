package evenfilllclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EvenFilllClass {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number ");
        int userInput = s.nextInt();

        File f = new File("C:\\Users\\Admin\\Desktop\\istiaq.txt");

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\sam.txt");
            pw.println("The Even numbers are ");
            pw.println("-----------------------");
            
            PrintWriter pq = new PrintWriter("C:\\Users\\Admin\\Desktop\\jun.txt");            
            pq.println("The Odd numbers are ");
            pq.println("-----------------------");
            
            for (int i = 1; i <= userInput; i++) {
                if (i % 2 == 0) {

                    pw.print(i + ", ");

                }               
                else {
                    pq.print(i + ", ");
                }

            }
            pw.close();
            pq.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(EvenFilllClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

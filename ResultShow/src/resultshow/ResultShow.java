package resultshow;

import java.util.Scanner;

public class ResultShow {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Marks ");
        int number = input.nextInt();

        if (number > 100) {
            System.err.println("The number is errors. ");
            
        } 
        else if (number >= 90) {
            System.out.println("He got 'A' ");
        } 
        else if (number >= 80) {
            System.out.println("He got 'B' ");
        } 
        else if (number >= 70) {
            System.out.println("He got 'C' ");
        } 
        else if (number >= 60) {
            System.out.println("He got 'D' ");
        } 
        else if (number >= 0) {
            System.out.println("He got 'F' ");
        } 
        else {
            System.err.println("The number is errors. ");

        }

    }

}

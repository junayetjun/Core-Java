package secondsconvert;

import java.util.Scanner;

public class SecondsConvert {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the seconds ");

        int seconds = input.nextInt();

        int hours = (seconds / 60) / 60;
        System.out.println(hours + " hours");

        int min = (seconds / 60) % 60;
        System.out.println(min + " minutes");

        int sec = seconds % 60;
        System.out.println(sec + " seconds");
        
//        own style

    }

}

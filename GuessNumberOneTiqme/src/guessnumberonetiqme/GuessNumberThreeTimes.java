package guessnumberonetiqme;

import java.util.Scanner;

public class GuessNumberThreeTimes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Guess number ");

        int userInput = s.nextInt();

        int randomNum = (int) (Math.random() * 10);
        int count = 1;

        while (count < 3) {
            if (randomNum == userInput) {
                System.out.println("You Win");
                break;
                
            } else if (randomNum > userInput) {
                System.out.println("Your input is Lower number than my number ");
                System.out.println("-----------------------------");
                System.out.println("Enter your Guess number ");
                userInput = s.nextInt();

            } else if (randomNum < userInput) {
                System.out.println("Your input is Higher number than my number  ");
                System.out.println("-----------------------------");
                System.out.println("Enter your Guess number ");
                userInput = s.nextInt();
            }
            if (count == 2){
                System.out.println("Better luck next time ");
            }
            count ++;

        }

    }

}

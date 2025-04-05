package calculateinterest;

import java.util.Scanner;

public class CalculateInterest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter  annual interest rate as 12.5% ");
        double interestRate = input.nextDouble();

        double monthlyInterestRate = interestRate / 1200;

        System.out.println("Enter Number of Year ");
        int numberOfYear = input.nextInt();

        System.out.println("Enter Loan Amount ");
        double loanAmount = input.nextDouble();

        double monthkyPayment = loanAmount * monthlyInterestRate / (1
                - 1 / Math.pow(1 + monthlyInterestRate, numberOfYear * 12));

        System.out.println("Per month payment is " + monthkyPayment + " Taka. ");         
        
        
        double totalPayment = monthkyPayment * numberOfYear * 12;
        System.out.println(totalPayment);
        
        
        System.out.println(" The monthly payment is $ " + monthkyPayment + " Taka. ");
        System.out.println("The total amount is $ " + (int) totalPayment + " Taka. ");

    }

}

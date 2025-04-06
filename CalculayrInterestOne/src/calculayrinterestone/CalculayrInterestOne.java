
package calculayrinterestone;

import java.util.Scanner;


public class CalculayrInterestOne {

  
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the interest rate as 12 %");
        
        double interestRate = s.nextDouble();
        
        double monthlyInterestRate = interestRate/1200;
        
        System.out.println("Enter the year ");
        int numberOfYear = s.nextInt();
        
        System.out.println("Enter loan amount ");
        double loanAmount = s.nextDouble();
        
        double monthlyPayment = loanAmount *monthlyInterestRate / (1
                -1/Math.pow(1+monthlyInterestRate, numberOfYear*12));
        
//        System.out.println(monthlyPayment);
        
        double totalPayment = monthlyPayment * numberOfYear *12;
//        System.out.println(totalPayment);
        
        
        System.out.println(" The monthly payment is $ "+(int)monthlyPayment + " taka.");
        System.out.println(" The total amonut is $ "+ (int)totalPayment+ " taka.");
        
        
        
        
        
        
        
        
        
    }
    
}

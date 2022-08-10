package JavaBasics_Exercises.Exercises_11_InterestCalculator;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter interest rate: ");
        double interestRate = Double.parseDouble(userInput.nextLine());
        System.out.println("Enter principal amount: ");
        double principal = Double.parseDouble(userInput.nextLine());
        System.out.println("Enter number of years: ");
        int numberOfYears = Integer.parseInt(userInput.nextLine());
        double totalEarned = 0;

        calculateEarnings(interestRate, principal, numberOfYears, totalEarned);

    }

    public static void calculateEarnings(double interestRate, double principal, int numberOfYears, double totalEarned){
        for(int year=1; year<numberOfYears+1; year++){

            double amountEarnedPerQuarter = 0;
            double quarterlyInterestRate = interestRate / 4;

            for(int quarter=1; quarter < 5; quarter++){
                amountEarnedPerQuarter = (principal * quarterlyInterestRate)/100;
                System.out.print("quarterly earnings in quarter " + quarter + " of year " + year + ": $");
                System.out.format("%.2f", amountEarnedPerQuarter);
                System.out.println("");
                principal += amountEarnedPerQuarter;
                System.out.print("Current principal amount in quarter " + quarter + " of year " + year + ": $");
                System.out.format("%.2f", principal);
                System.out.println("\n\n");
                totalEarned += amountEarnedPerQuarter;
            }
            System.out.print("Total earned so far : $");
            System.out.format("%.2f", totalEarned);
            System.out.println("");
            System.out.print("Current principal amount in year " + year + ": $");
            System.out.format("%.2f", principal);
            System.out.println("\n\n");
            System.out.println("----------------------------------------------------------------------------\n\n");
        }
    }
}

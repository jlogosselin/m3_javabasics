package JavaBasicsAssessment;

import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your age?");
        int userAge = Integer.parseInt(userInput.nextLine());
        int maximumHeartRate = 220 - userAge;
        double lowEndHeartRate = maximumHeartRate*0.5;
        double highEndHeartRate = maximumHeartRate*0.85;

        System.out.println("Your maximum heart rate should be " +  maximumHeartRate + " beats per minute");
        System.out.print("Your target HR Zone is ");
        System.out.print((int) Math.round(lowEndHeartRate) + " - ");
        System.out.print((int) Math.round(highEndHeartRate));
        System.out.print(" beats per minute");

    }
}

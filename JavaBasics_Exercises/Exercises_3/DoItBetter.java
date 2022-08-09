package JavaBasics_Exercises.Exercises_3;

import java.util.Scanner;

public class DoItBetter {
    public static void main(String[] args) {

        /*
        Ask the user how many miles they can run, the number of hot dogs they can eat,
        and the number of languages they know.
        Immediately after each question, brag that you can do more by multiplying
        their number by 2 and adding 1.
         */

        Scanner inputReader = new Scanner(System.in);

        System.out.println("How many miles do you run?");
        int numberMiles = Integer.parseInt(inputReader.nextLine());

        System.out.println("How many hotdogs can you eat?");
        int numberHotDogs = Integer.parseInt(inputReader.nextLine());

        System.out.println("How many languages can you speak?");
        int numberLanguages = Integer.parseInt(inputReader.nextLine());

        System.out.println("OK, this is all impressive, but...");
        System.out.println("I run " + (numberMiles*2 + 1) + " miles.");
        System.out.println("I can eat " + (numberHotDogs*2 + 1) + " hotdogs.");
        System.out.println("And I speak " + (numberLanguages*2 + 1) + " languages.");

        System.out.println("\nNice try though!");


    }
}

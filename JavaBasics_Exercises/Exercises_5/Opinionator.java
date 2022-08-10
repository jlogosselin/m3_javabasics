package JavaBasics_Exercises.Exercises_5;

import java.util.Scanner;
import java.util.Random;

public class Opinionator {
    public static void main(String[] args) {
        Scanner userInp = new Scanner(System.in);
        Random randomizer = new Random();
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");

        int x = randomizer.nextInt(6);

        System.out.println("The number the system chose chose was: " + x + ". Therefore: ");

        switch (x) {
            case 0:
                System.out.println("Llamas are the best!");
                break;
            case 1:
                System.out.println("Dodos are the best!");
                break;
            case 2:
                System.out.println("Woolly mammoths are DEFINITELY the best!");
                break;
            case 3:
                System.out.println("Sharks are the greatest, they have their own week!");
                break;
            case 4:
                System.out.println("Cockatoos are just so awesome!");
                break;
            case 5:
                System.out.println("Have you ever met a naked mole-rat? They're GREAT!");
                break;
        }
        System.out.println("Thanks Random, maybe YOU'RE the best!");
    }
}

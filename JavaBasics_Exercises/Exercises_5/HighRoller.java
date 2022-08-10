package JavaBasics_Exercises.Exercises_5;

import java.util.Scanner;
import java.util.Random;

public class HighRoller {
    public static void main(String[] args) {

        Random diceRoller = new Random();

        int rollResult = diceRoller.nextInt(6) + 1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println("I rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        }
        else if(rollResult == 2) {
            System.out.println("Not bad...");
        }
        else if(rollResult == 3) {
            System.out.println("Ok-ish...");
        }
        else if(rollResult == 4) {
            System.out.println("A decent score!");
        }
        else if(rollResult == 5) {
            System.out.println("Near perfect!");
        }
        else{
            System.out.println("Perfection!");
        }
    }
}

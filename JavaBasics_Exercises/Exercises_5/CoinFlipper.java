package JavaBasics_Exercises.Exercises_5;

import java.util.Scanner;
import java.util.Random;

public class CoinFlipper {
    public static void main(String[] args) {

        // defining the range
        int min = 1;
        int max = 2;
        int range = max - min + 1;

        // generating random numbers within 1 to 2
        int randValue = (int) (Math.random() * range) + min;
        System.out.println("System generated a " + randValue);

        String result = (randValue == 1) ? "You flipped HEADS!" : "You flipped TAILS!";

        System.out.println(result);
    }
}

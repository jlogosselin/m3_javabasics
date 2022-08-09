package JavaBasics_Exercises.Exercises_3;

import java.util.Scanner;

public class BiggerBetterAdder {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter 3 values: ");

        double v1 = userInput.nextDouble();
        double v2 = userInput.nextDouble();
        double v3 = userInput.nextDouble();

        double result = v1 + v2 + v3;

        System.out.println("Result is: " + result);

    }
}

package JavaBasics_Exercises.Exercises_3;

import java.util.Scanner;

public class PassingTheTuringTest {
    public static void main(String[] args) {
        /*
        Ask the user for their name.
        Display that name and tell them yours (or your AI's name!).
        Ask them for their favorite color.
        Display the color they enter in a conversational way.
        Do the same thing with favorite food and number, and then say goodbye!
        Make sure you use the right variable with the right user input!
         */

        Scanner inpRead = new Scanner(System.in);
        String userName, userColour, userFood, userNumber;

        System.out.println("What is your name?");
        userName = inpRead.nextLine();
        System.out.println("Oh pleased to meet you, " + userName + "! I'm Brian!");

        System.out.println("What is your favourite colour?");
        userColour = inpRead.nextLine();
        System.out.println(userColour + " is also my favourite colour! What a coincidence!");

        System.out.println("What is your favourite food?");
        userFood = inpRead.nextLine();
        System.out.println("I could definitely eat " + userFood + " all day! It is so yummy!");

        System.out.println("What is your lucky number?");
        userNumber = inpRead.nextLine();
        System.out.println("We must be born from the same mother! " + userNumber + " is also my lucky number!");

        System.out.println("\nWell that's all the time we have sadly! See you soon!");
    }
}

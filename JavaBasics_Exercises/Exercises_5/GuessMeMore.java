package JavaBasics_Exercises.Exercises_5;

import java.util.Scanner;

public class GuessMeMore {
    public static void main(String[] args) {

        int tries = 10;

        // defining the range
        int min = -100;
        int max = 100;
        int range = max - min + 1;

        // generating random numbers within -100 to 100
        int randValue = (int) (Math.random() * range) + min;
        System.out.println("System generated a " + randValue);

        Scanner userInput = new Scanner(System.in);
        System.out.println("You have 10 tries to guess the randomly generated value!");
        System.out.println("Enter a value: ");
        int v = Integer.parseInt(userInput.nextLine());

        while(tries > 0 && v != randValue){
            if(v > randValue){
                tries--;
                System.out.println("Too high. You have " + tries + " tries left, choose again.");
                v = Integer.parseInt(userInput.nextLine());
            }
            else if(v < randValue){
                tries--;
                System.out.println("Too low. You have " + tries + " tries left, choose again.");
                v = Integer.parseInt(userInput.nextLine());
            }
        }

        if(tries == 0){
            System.out.println("You lost");
        }
        else{
            System.out.println("You won!");
        }


    }
}

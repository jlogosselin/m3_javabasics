package JavaBasics_Exercises.Exercises_4;

import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);

        int myNum = 21;
        int tries = 2;
        System.out.println("You have 3 tries to guess the value I have chosen. Good luck!");
        System.out.println("Enter a value: ");
        int userNum = Integer.parseInt(myScan.nextLine());

        while(tries > 0 && userNum != myNum){
            if(userNum > myNum){
                tries--;
                System.out.println("Too high. You have " + tries + " tries left, choose again.");
                userNum = Integer.parseInt(myScan.nextLine());
            }
            else if(userNum < myNum){
                tries--;
                System.out.println("Too low. You have " + tries + " tries left, choose again.");
                userNum = Integer.parseInt(myScan.nextLine());
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

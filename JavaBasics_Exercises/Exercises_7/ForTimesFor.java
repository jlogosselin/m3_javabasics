package JavaBasics_Exercises.Exercises_7;

import java.util.Scanner;

public class ForTimesFor {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Decide on times table: ");
        int times = Integer.parseInt(userInput.nextLine());

        int correctAnswers = 0;

        for(int i=1; i<times; i++){
            System.out.println("What is " + i + " * " + times + "?");
            int userAnswer = Integer.parseInt(userInput.nextLine());
            int correctAnswer = i*times;
            if(userAnswer == correctAnswer){
                System.out.println("Correct! The answer is indeed " + correctAnswer);
                correctAnswers += 1;
            }
            else{
                System.out.println("Wrong. The correct answer is " + correctAnswer);
            }
        }

        System.out.println("You got " + correctAnswers + " correct answers out of " + times);
        System.out.println("That is " + ((correctAnswers*100)/times) + "%");

    }
}

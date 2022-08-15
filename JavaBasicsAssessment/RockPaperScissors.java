package JavaBasicsAssessment;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String playAgain = "";
        do{
            int playerWins = 0;
            int computerWins = 0;
            int draws = 0;
            int numberOfRounds = chooseNumberRounds();
            introMessage();

            for(int i=0; i<numberOfRounds; i++) {

                System.out.println("Play (1) for Rock, (2) for Paper, (3) for Scissors");
                int playerMove = playerMove();
                int computerMove = computerMove();
                System.out.println("You played " + showPlay(playerMove) + ", computer played " + showPlay(computerMove));
                int[] scoreContainer = {playerMove, computerMove, draws, computerWins, playerWins};
                settingScores(scoreContainer, i);
                draws = scoreContainer[2];
                computerWins = scoreContainer[3];
                playerWins = scoreContainer[4];
            }

            displayFinalResults(draws, computerWins, playerWins);
            displayWinner(computerWins, playerWins);
            playAgainMessage();
            playAgain = playAgain();

        }while(playAgain.equals("Yes"));
        finalMessage();
    }

    public static int chooseNumberRounds(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a number of rounds, between 1 and 10: ");
        int numberOfRounds = Integer.parseInt(userInput.nextLine());
        while(numberOfRounds < 1 || numberOfRounds > 10){
            System.out.println("Sorry, incorrect input. Choose a number of rounds, between 1 and 10: ");
            numberOfRounds = Integer.parseInt(userInput.nextLine());
        }
        return numberOfRounds;
    }

    public static void introMessage(){
        System.out.println("Let's play Rock Paper Scissors!");
    }

    public static int playerMove(){
        Scanner userInput = new Scanner(System.in);
        int playerMove = Integer.parseInt(userInput.nextLine());
        while(playerMove < 1 || playerMove > 3){
            System.out.println("Sorry, incorrect input! Please play (1) for Rock, (2) for Paper, (3) for Scissors");
            playerMove = Integer.parseInt(userInput.nextLine());
        }
        return playerMove;
    }

    public static int computerMove(){
        Scanner userInput = new Scanner(System.in);
        int min = 1, max = 3;
        int computerMove = (int)(Math.random()*(max-min+1)+min);
        return computerMove;
    }

    public static void settingScores(int[] scoreContainer, int i) {

        if (scoreContainer[0] == 1) {
            if (scoreContainer[1] == 1) scoreContainer[2] += roundIsDraw(i);
            else if (scoreContainer[1] == 2) scoreContainer[3] += computerWinsRound(i);
            else if (scoreContainer[1] == 3) scoreContainer[4] += playerWinsRound(i);
        }
        else if (scoreContainer[0] == 2) {
            if (scoreContainer[1] == 1) scoreContainer[4] += playerWinsRound(i);
            else if (scoreContainer[1] == 2) scoreContainer[2] += roundIsDraw(i);
            else if (scoreContainer[1] == 3) scoreContainer[3] += computerWinsRound(i);
        }
        else if (scoreContainer[0] == 3)
            if (scoreContainer[1] == 1) scoreContainer[3] += computerWinsRound(i);
            else if (scoreContainer[1] == 2) scoreContainer[4] += playerWinsRound(i);
            else if (scoreContainer[1] == 3) scoreContainer[2] += roundIsDraw(i);
    }

    public static void displayFinalResults(int draws, int computerWins, int playerWins){
        System.out.println("Number of draws: " + draws);
        System.out.println("Number of computer wins: " + computerWins);
        System.out.println("Number of player wins: " + playerWins);
    }

    public static void displayWinner(int computerWins, int playerWins){
        if (computerWins == playerWins) System.out.println("It's a draw!");
        else if (computerWins < playerWins) System.out.println("YOU WIN!");
        else System.out.println("Computer wins game...");
    }

    public static int computerWinsRound(int round){
        System.out.println("Computer wins round " + (round+1) + "\n");
        return 1;
    }

    public static int playerWinsRound(int round){
        System.out.println("You win round " + (round+1) + "\n");
        return 1;
    }

    public static int roundIsDraw(int round){
        System.out.println("Round " + (round+1) + " is a draw!\n");
        return 1;
    }

    public static String showPlay(int n){
        if(n == 1) return "Rock";
        else if(n == 2) return "Paper";
        else return "Scissors";
    }

    public static void playAgainMessage(){
        System.out.println("Do you wish to play again? (No / Yes)");
    }

    public static String playAgain(){
        Scanner userInput = new Scanner(System.in);
        String answer = userInput.nextLine();
        while(!(answer.equals("No")) && !(answer.equals("Yes"))){
            System.out.println("Sorry, incorrect input.");
            playAgainMessage();
            answer = userInput.nextLine();
        }
        return answer;
    }

    public static void finalMessage(){
        System.out.println("Thanks for playing! See you soon!");
    }
}



package JavaBasics_Exercises.Exercises_12_LuckySevens;

import java.util.Scanner;
import java.util.Random;

public class LuckySevens {
    public static void main(String[] args) {

        Scanner userInp = new Scanner(System.in);
        Random rng = new Random();
        System.out.println("Enter amount of money: ");
        int amount = Integer.parseInt(userInp.nextLine());
        int numberOfDiceRolls = 0;
        int maxMoney = amount;
        int maxRoll = 0;
        int firstLoopPassed = 0;

        while(amount > 0){
            int r1 = rng.nextInt(7)+1;
            int r2 = rng.nextInt(7)+1;
            numberOfDiceRolls += 1;
            int total = r1 + r2;
            System.out.println("dice roll total = " + total);
            if(total == 7){
                amount += 4;
                System.out.println(" /////////// YES! YOU EARNED $4!!! ///////////");
                System.out.println("Current amount = " + amount);
            }
            else{
                amount -= 1;
                System.out.println("Current amount = " + amount);
            }

            if(firstLoopPassed > 0){
                if(maxMoney < amount){
                    maxMoney = amount;
                    maxRoll = numberOfDiceRolls;
                    System.out.println("----- max money = " + maxMoney + " with roll " + maxRoll + " -------");
                }
            }
            System.out.println("\n\n");
            firstLoopPassed++;
        }

        System.out.println("You are broke after " + numberOfDiceRolls + " rolls.\n");
        System.out.println("You should have quit after " + maxRoll + " rolls when you had $" + maxMoney + ".");

    }
}

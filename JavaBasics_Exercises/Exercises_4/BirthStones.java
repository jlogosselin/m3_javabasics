package JavaBasics_Exercises.Exercises_4;

import java.util.Scanner;

public class BirthStones {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a value between 1 and 12 (included): ");
        int userNum = Integer.parseInt(userInput.nextLine());

        while(userNum < 1 || userNum > 12){
            System.out.println("Sorry, incorrect value. Try again: ");
            userNum = Integer.parseInt(userInput.nextLine());
        }

        switch(userNum){
            case 1:
                System.out.println("You were born in January? Your birthstone is Garnet.");
                break;
            case 2:
                System.out.println("You were born in February? Your birthstone is Amethyst.");
                break;
            case 3:
                System.out.println("You were born in March? Your birthstone is Aquamarine.");
                break;
            case 4:
                System.out.println("You were born in April? Your birthstone is Diamond.");
                break;
            case 5:
                System.out.println("You were born in May? Your birthstone is Emerald.");
                break;
            case 6:
                System.out.println("You were born in June? Your birthstone is Pearl.");
                break;
            case 7:
                System.out.println("You were born in July? Your birthstone is Ruby.");
                break;
            case 8:
                System.out.println("You were born in August? Your birthstone is Peridot.");
                break;
            case 9:
                System.out.println("You were born in September? Your birthstone is Sapphire.");
                break;
            case 10:
                System.out.println("You were born in October? Your birthstone is Opal.");
                break;
            case 11:
                System.out.println("You were born in November? Your birthstone is Topaz.");
                break;
            case 12:
                System.out.println("You were born in December? Your birthstone is Turquoise.");
                break;
        }

    }
}

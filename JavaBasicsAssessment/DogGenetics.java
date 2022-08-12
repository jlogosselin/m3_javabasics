package JavaBasicsAssessment;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class DogGenetics {

    public static void main(String[] args) {

        //scanner declaration
        Scanner userInput = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Enter your dog's name:");
        String dogName = userInput.nextLine();

        ArrayList<String> dogBreeds = new ArrayList<String>();
        dogBreeds.add("St. Bernard");
        dogBreeds.add("Chihuahua");
        dogBreeds.add("Dramatic RedNosed Asian Pug");
        dogBreeds.add("Common Cur");
        dogBreeds.add("King Doberman");

        Collections.shuffle(dogBreeds);

        String[] finalDogList = new String[5];

        dogBreeds.toArray(finalDogList);

        int[] percentages = {0,0,0,0,0};

        int min = 0;
        int max = 100;
        int sum;

        do{
            sum = 0;

            percentages[0] = (int)(Math.random()*(max-min+1)+min);
            percentages[1] = (int)(Math.random()*(max-min+1)+min);
            percentages[2] = (int)(Math.random()*(max-min+1)+min);
            percentages[3] = (int)(Math.random()*(max-min+1)+min);
            percentages[4] = (int)(Math.random()*(max-min+1)+min);

            for(int i=0; i<percentages.length; i++){
                sum += percentages[i];
            }

        }while(sum < 100 || sum > 100);

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious right here.\n");

        System.out.println(dogName + " is:\n");

        for(int i=0; i<5; i++){
            System.out.println(percentages[i] + "% " + finalDogList[i]);
        }

        System.out.println("\nWow, that's QUITE the dog!");

    }
}




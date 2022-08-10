package JavaBasics_Exercises.Exercises_9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class FruitSalad {
    public static void main(String[] args) {

        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato",
                "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry",
                "Strawberry", "Navel Orange", "Pink Pearl Apple", "Raspberry",
                "Blood Orange", "Sungold Tomato", "Fuji Apple",
                "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple",
                "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] allApples = getApples(fruit);
        String[] shuffledAppleArray = shuffleArray(allApples);
        printArray(shuffledAppleArray);

        String[] allOranges = getOranges(fruit);
        String[] shuffledOrangeArray = shuffleArray(allOranges);
        printArray(shuffledOrangeArray);

        String[] allBerries = getBerries(fruit);
        String[] shuffledBerryArray = shuffleArray(allBerries);
        printArray(shuffledBerryArray);

        String[] allOtherFruit = getAllOtherFruit(fruit);
        String[] shuffledRandomFruitArray = shuffleArray(allOtherFruit);
        printArray(shuffledRandomFruitArray);

        String[] myCompletedFruitSaladIngredients = makeFruitSalad(shuffledAppleArray,
                                                                    shuffledOrangeArray,
                                                                    shuffledBerryArray,
                                                                    shuffledRandomFruitArray);

        printArray(myCompletedFruitSaladIngredients);

    }

    public static String[] getApples(String[] fruit){
        ArrayList<String> tempList = new ArrayList<String>();
        for(int i=0; i<fruit.length; i++){
            if(fruit[i].contains("Apple")){
                tempList.add(fruit[i]);
            }
        }
        String[] returnedArray = tempList.toArray(new String[0]);
        return returnedArray;
    }

    public static String[] getOranges(String[] fruit){
        ArrayList<String> tempList = new ArrayList<String>();
        for(int i=0; i<fruit.length; i++){
            if(fruit[i].contains("orange") || fruit[i].contains("Orange")){
                tempList.add(fruit[i]);
            }
        }
        String[] returnedArray = tempList.toArray(new String[0]);
        return returnedArray;
    }

    public static String[] getBerries(String[] fruit){
        ArrayList<String> tempList = new ArrayList<String>();
        for(int i=0; i<fruit.length; i++){
            if(fruit[i].contains("berry") || fruit[i].contains("Berry")){
                tempList.add(fruit[i]);
            }
        }
        String[] returnedArray = tempList.toArray(new String[0]);
        return returnedArray;
    }

    public static String[] getAllOtherFruit(String[] fruit){
        ArrayList<String> tempList = new ArrayList<String>();
        for(int i=0; i<fruit.length; i++){
            if(!(fruit[i].contains("berry") || fruit[i].contains("Berry")) &&
                    !(fruit[i].contains("apple") || fruit[i].contains("Apple")) &&
                    !(fruit[i].contains("orange") || fruit[i].contains("Orange")) &&
                    !(fruit[i].contains("tomato") || fruit[i].contains("Tomato"))){
                tempList.add(fruit[i]);
            }
        }
        String[] returnedArray = tempList.toArray(new String[0]);
        return returnedArray;
    }

    public static String[] shuffleArray(String[] myArray){

        List<String> tempList = Arrays.asList(myArray);
        Collections.shuffle(tempList);
        tempList.toArray(myArray);
        return myArray;
    }

    public static String[] makeFruitSalad(String[] apples, String[] oranges, String[] berries, String[] otherFruit){

        ArrayList<String> tempList = new ArrayList<String>();

        for(int i=0; i<3; i++){
            tempList.add(apples[i]);
        }
        for(int j=0; j<2; j++){
            tempList.add(oranges[j]);
        }
        for(int k=0; k<berries.length; k++){
            tempList.add(berries[k]);
        }
        int totalFruitAllowed = 12 - (berries.length + 5);
        if(totalFruitAllowed > 0){
            for(int l=0; l<otherFruit.length; l++){
                tempList.add(otherFruit[l]);
            }
        }

        String[] returnedArray = tempList.toArray(new String[0]);
        return returnedArray;
    }

    public static void printArray(String[] arr){
        System.out.println("\n\nFinal fruit array: \n\n");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

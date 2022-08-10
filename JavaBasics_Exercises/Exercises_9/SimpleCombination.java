package JavaBasics_Exercises.Exercises_9;

public class SimpleCombination {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49};
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100};
        int[] resultArray = myFunction(firstHalf, secondHalf);
        printArray(resultArray);
    }

    public static int[] myFunction(int[] myArray1, int[] myArray2){
        int l1 = myArray1.length;
        int l2 = myArray2.length;
        int[] tempArray = new int[l1 + l2];

        for(int i=0; i<l1; i++){
            tempArray[i] = myArray1[i];
        }
        for(int i=l1, j=0; i<l1+l2; i++, j++){
            tempArray[i] = myArray2[j];
        }
        return tempArray;
    }

    public static void printArray(int[] myArr){
        System.out.println("Values of array:");
        for(int i=0; i<myArr.length; i++){
            System.out.print(myArr[i] + " ");
        }
    }
}

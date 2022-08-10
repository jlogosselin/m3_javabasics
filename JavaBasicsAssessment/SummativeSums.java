package JavaBasicsAssessment;

public class SummativeSums {

    public static void main(String[] args) {

        int[] array1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
        int[] array2 = { 999, -60, -77, 14, 160, 301 };
        int[] array3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99 };

        int r1 = sumOfArrayElements(array1);
        int r2 = sumOfArrayElements(array2);
        int r3 = sumOfArrayElements(array3);

        System.out.println("Result1 = " + r1);
        System.out.println("Result2 = " + r2);
        System.out.println("Result3 = " + r3);

    }

    public static int sumOfArrayElements(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
}

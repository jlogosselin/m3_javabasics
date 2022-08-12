package JavaBasics_Exercises.Exercises_14_Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the position of the Fibo number you are searching for (starting from 3): ");
        int pos = scanner.nextInt();
        while(pos < 3){
            System.out.println("Error: enter position starting from 3");
            pos = scanner.nextInt();
        }
        long result = getItemInSeries(pos);
        System.out.println("Fibo value at position " + pos + " = " + result);
    }

    public static long getItemInSeries(int pos) {

        long n1 = 1;
        long n2 = 1;
        long result = 0;
        int p = 2;

        while(p < pos){
            result = n1 + n2;
            long temp = n1;
            n1 = result;
            n2 = temp;
            p += 1;
            System.out.println("result = " + result + ", current position = " + p);
        }
        return result;
    }
}

package JavaBasicsMidPointAssessment;

import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {

        Scanner userInp = new Scanner(System.in);

        //exercise 1: sum of factorials
        System.out.println("Enter an integer to find its sum of factorials:");
        int v1 = userInp.nextInt();
        int totalFactorialSum = 0;
        for(int i=1; i<=v1; i++){
            int tempsum = 1;
            for(int j=1; j<=i; j++){
                tempsum *= j;
            }
            totalFactorialSum += tempsum;
        }
        System.out.println("sum of factorials of " + v1 + " is " + totalFactorialSum);

        //--------------------------------------------------------------------------------

        //exercise 2: determine if given value is a perfect square
        System.out.println("Enter an integer to determine if it's a perfect square:");
        double v2 = userInp.nextDouble();
        if(Math.sqrt(v2) - (int)Math.sqrt(v2) == 0){
            System.out.println((int)v2 + " is a perfect square.");
        }
        else{
            System.out.println((int)v2 + " is not a perfect square.");
        }

    }
}

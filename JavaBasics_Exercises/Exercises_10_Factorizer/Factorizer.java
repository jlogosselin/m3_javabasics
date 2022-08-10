package JavaBasics_Exercises.Exercises_10_Factorizer;

import java.util.Scanner;

public class Factorizer {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int v = Integer.parseInt(userInput.nextLine());

        countFactors(v);
        isPerfect(v);
        isPrime(v);
    }

    public static void countFactors(int n){
        int factor_count = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                System.out.println(i + " is a factor of " + n);
                factor_count++;
            }
        }
        factor_count++;
        System.out.println(n + " has a total of " + factor_count + " factors (including itself). \n\n");
    }

    public static void isPrime(int n){
        boolean flag = true;
        for(int i=2; i<Math.sqrt(n); i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }

        String result = (flag == true)? " is prime.\n\n" : " is not prime.\n\n";
        System.out.println(n + result);

    }

    public static void isPerfect(int n){

        int perfectTotal = 0;

        for(int i=1; i<n; i++){
            if(n % i == 0){
                perfectTotal += i;
            }
        }

        String result = (perfectTotal == n) ? " is perfect!\n\n" : " is not perfect.\n\n";
        System.out.println("The value " + n + result);
    }


}

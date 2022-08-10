package JavaBasics_Exercises.Exercises_7;

import java.util.Scanner;

public class TraditionalFizzBuzz {
    public static void main(String[] args) {

        Scanner userInp = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int userNum = Integer.parseInt(userInp.nextLine());

        for(int i=0; i<userNum; i++){
            if(i == 0){
                System.out.println(i);
            }
            else if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FIZZ BUZZ!");
            }
            else if(i % 3 == 0){
                System.out.println("fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("buzz");
            }
            else{
                System.out.println(i);
            }
        }
        System.out.println("TRADITION!!!!!");

        /*
        Create a new class named FizzBuzz that performs the following tasks:

Ask the user for a number.
Use a for loop to count from zero, replacing every multiple of 3 with "fizz" and every multiple of 5 with "buzz". Multiples of BOTH should print out "fizz buzz".
Every time you print out fizz, buzz, or fizz buzz - keep track. When you've reached the number received from the user - stop!
Finish it all up with a large, all caps printout of "TRADITION!!!!!"

Here's an example of what the program might look like when it runs.

How many units of fizzing and buzzing do you need in your life? 7
0
1
2
fizz
4
buzz
fizz
7
8
fizz
buzz
11
fizz
13
14
fizz buzz

         */
    }
}

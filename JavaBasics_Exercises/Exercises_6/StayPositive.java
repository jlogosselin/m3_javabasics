package JavaBasics_Exercises.Exercises_6;

import java.util.Scanner;

public class StayPositive {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a value:");
        int v = Integer.parseInt(inp.nextLine());
        int temp1 = v;
        int temp2 = v;

        //solution 1:
        while(temp1 > 0){
            System.out.print(temp1 + " ");
            if(temp1 % 10 == 0){
                System.out.println("");
            }
            temp1--;
        }
        System.out.println("");
        System.out.println("");

        //solution 2:
        int count = 10;
        while(temp2 > 0){
            count--;
            System.out.print(temp2 + " ");
            if(count == 0){
                System.out.println("");
                count = 10;
            }
            temp2--;
        }
    }
}

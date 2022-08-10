package JavaBasics_Exercises.Exercises_7;

import java.util.Scanner;

public class TheCount {
    public static void main(String[] args) {

        Scanner userIn = new Scanner(System.in);
        System.out.println("Enter a START value: ");
        int start = Integer.parseInt(userIn.nextLine());
        System.out.println("Enter an END value: ");
        int end = Integer.parseInt(userIn.nextLine());
        System.out.println("Enter an INCREMENT value: ");
        int increment = Integer.parseInt(userIn.nextLine());
        int countNums = 0;

        for(int i=start; i<end; i+=increment){
            if(countNums < 3){
                System.out.print(i + " ");
                countNums++;
            }
            else{
                i-=increment;
                System.out.print("Ha ha ha!");
                System.out.println("");
                countNums = 0;
            }
        }


    }
}

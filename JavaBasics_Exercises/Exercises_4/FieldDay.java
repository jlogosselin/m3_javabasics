package JavaBasics_Exercises.Exercises_4;

import java.util.Scanner;

public class FieldDay {
    public static void main(String[] args) {

        Scanner theirInput = new Scanner(System.in);

        System.out.println("Enter your last name: ");
        String lastName = theirInput.nextLine();

        int res1 = lastName.compareTo("Baggins");
        if(res1 < 0){
            System.out.println("in team Red Dragons");
        }
        else{
            int res2 = lastName.compareTo("Dresden");
            if(res2 < 0){
                System.out.println("in team Dark Wizards");
            }
            else{
                int res3 = lastName.compareTo("Howl");
                if(res3 < 0){
                    System.out.println("in team Moving Castles");
                }
                else{
                    int res4 = lastName.compareTo("Potter");
                    if(res4 < 0){
                        System.out.println("in team Golden Snitches");
                    }
                    else{
                        int res5 = lastName.compareTo("Vimes");
                        if(res5 < 0){
                            System.out.println("in team Night Guards");
                        }
                        else{
                            System.out.println("in team Black Holes");
                        }
                    }
                }
            }
        }

    }
}

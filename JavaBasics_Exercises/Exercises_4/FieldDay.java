package JavaBasics_Exercises.Exercises_4;

import java.util.Scanner;

public class FieldDay {
    public static void main(String[] args) {
        /*
        Your company has organized a morale event! They're hosting a picnic and field day in the park,
        and of course, they want to play games! Team games! Team building games!

To do that they want to assign all the people who show up to certain teams based on their last name
- they've figured out the distribution break down
- all they need YOU to do is to write the program that can sort them.
For example, it should take a last name as input and use that to output the team name.

Here are the specs:

If a person's name falls before Baggins, then they are on the team "Red Dragons"
If it falls after Baggins, but before Dresden, they are on the team "Dark Wizards"
If it falls after Dresden, but before Howl, they are on the team "Moving Castles"
If it falls after Howl, but before Potter, they are on the team "Golden Snitches"
If it falls after Potter, but before Vimes, they are on the team "Night Guards"
If it falls after Vimes, they are on the team "Black Holes"

What's your last name? Weasley
Aha! You're on the team "Black Holes"!
Good luck in the games!
         */

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

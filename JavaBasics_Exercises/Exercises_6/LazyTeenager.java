package JavaBasics_Exercises.Exercises_6;

import java.util.Scanner;
import java.util.Random;

public class LazyTeenager {
    public static void main(String[] args) {
        /*
        Write a program named LazyTeenager that simulates a lazy teenager who won't clean
        their room until their parent tells them repeatedly to do it.

Write this using a do-while loop that continues to execute until the room is clean.
Every time the loop executes, the parent should tell the teenager to clean their room.

Each time the teenager is told to clean their room, it increases the chance the teenager
will clean the room by 10%.

So the first time they're told, there is only a 10% chance they'll clean it.

The second time, there's a 20% chance.

Use Random to calculate this "chance" check.

However, by the 7th time, they're going to get grounded and have their Xbox confiscated.

(Note: Use a break, not a compound condition, to stop the loop in that case.)
The code is up to you.

Here are a couple of examples of what the output might look like:

What You Should See (Example 1)
Clean your room!! (x1)
Clean your room!! (x2)
Clean your room!! (x3)
Clean your room!! (x4)
Clean your room!! (x5)
FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.
What You Should See (Example 2)
Clean your room!! (x1)
Clean your room!! (x2)
Clean your room!! (x3)
Clean your room!! (x4)
Clean your room!! (x5)
Clean your room!! (x6)
Clean your room!! (x7)
Clean your room!! That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!
         */

        //Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        //double v = rand.nextInt(15) + 1;
        double v = 15.0;
        System.out.println("Random start value = " + v);

        int tries = 1;
        int percentage = 10;

        while(v > 1 && tries < 8 ){
            System.out.print("Clean your room!! (x" + tries + ")");
            //System.out.print("  -> value of v = " + v + "   -> percentage = " + percentage);
            double t = (v*percentage) / 100;
            //System.out.println("    t = " + t);
            v -= t;
            System.out.println("");
            percentage += 10.0;
            tries++;
        }



        if(tries < 6) {
            System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
        }
        else{
            System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS");
        }

    }
}

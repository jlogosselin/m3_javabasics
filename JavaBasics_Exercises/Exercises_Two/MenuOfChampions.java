package JavaBasics_Exercises.Exercises_Two;

public class MenuOfChampions {
    public static void main(String[] args) {
        String welcomeMessage = "WELCOME TO RESTAURANT NIGHT VALE!";
        String todaysMenu = "Today's Menu Is...";
        double sliceOfBigRicoPizza_price = 500.0;
        double invisibleStrawberryPie_price = 2.50;
        double denverOmelet_price = 1.50;

        System.out.print(".");
        for(int i=0; i<15; i++){
            System.out.print("oOo.");
        }

        System.out.println("");
        System.out.println("");
        System.out.println("\t\t" + welcomeMessage);
        System.out.println("\t\t" + todaysMenu);
        System.out.println("");

        System.out.print(".");
        for(int i=0; i<15; i++){
            System.out.print("oOo.");
        }

        System.out.println("");
        System.out.println("");
        System.out.print("\t\t$ ");
        System.out.print(String.format("%.2f", sliceOfBigRicoPizza_price));
        System.out.println(" *** Slice of Big Rico Pizza");
        System.out.print("\t\t$ ");
        System.out.print(String.format("%.2f", invisibleStrawberryPie_price));
        System.out.println(" ***** Invisible Strawberry Pie");
        System.out.print("\t\t$ ");
        System.out.print(String.format("%.2f", denverOmelet_price));
        System.out.println(" ***** Denver Omelet");



    }
}

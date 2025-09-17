//imports random class

import java.util.Random;
//imports scanner class
import java.util.Scanner;

public class Dice {
    public static void main(String[] args) {

        //creates random obj
        Random rand = new Random();
        //creates scanner obj
        Scanner myObj = new Scanner(System.in);

        //dice loop
        while (true) {

            //initializes amount and sides
            int dieAmount;
            int dieSides;

            //prompt for a valid number (1-20)
            while (true) {
                System.out.println("How many dice do you want to roll? (1-20)");
                //makes input dieAmount
                if (myObj.hasNextInt()) {
                    dieAmount = myObj.nextInt();
                    //creates number restrictions
                    if (dieAmount >= 1 && dieAmount <= 20) {
                        break;
                    }
                } else {
                    //throws away invalid input
                    myObj.next();
                }
                System.out.println("Please enter a valid number between 1 and 20");
            }

            while (true) {
                System.out.println("How many sides do you want each die to have? (2-6)");
                //makes input dieSides
                if (myObj.hasNextInt()) {
                    dieSides = myObj.nextInt();
                    //creates number restrictions
                    if (dieSides >= 2 && dieSides <= 6) {
                        break;
                    }
                } else {
                    //throws away invalid input
                    myObj.next();
                }
                System.out.println("Please input a valid number between 2 and 6.");
            }


            //array for results(storage)
            int[] results = new int[dieAmount];
            //creates "total" integer
            int total = 0;

            //for loop to roll each die and then store the results in an array
            for (int i = 0; i < dieAmount; i++) {
                //rolls the die
                results[i] = rand.nextInt(dieSides) + 1;
                //adds the total
                total += results[i];
            }

            //for loop to print out the die rolls from the array
            for (int i = 0; i < dieAmount; i++) {
                System.out.println("Die " + (i + 1) + " rolled a " + results[i]);
            }
            //prints out results
            System.out.println("In total you rolled a " + total + "!");

            //calls the methods from the results
            System.out.println("Highest roll: " + arrayMethods.highestNum(results));
            System.out.println("Lowest roll: " + arrayMethods.lowestNum(results));
            System.out.println("Average roll: " + arrayMethods.averageNum(results));
            System.out.println("Median roll: " + arrayMethods.medianNum(results) + "\n");

            //asks user to reroll
            System.out.println("Would you like to reroll? y for yes. Any key for no");
            //sets user input as yes string
            String yes = myObj.next();
            //looks for "y" input
            if (!yes.equalsIgnoreCase("y")) {
                //stops while true dice loop
                break;
            }
        }
    }
}

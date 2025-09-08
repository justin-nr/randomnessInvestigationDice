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

        //asks user how many die to roll
        System.out.println("How many die do you want to roll?");
        //takes the input from user
        int dieAmount = myObj.nextInt();
        //asks user how many sides for the die
        System.out.println("How many sides do you want each to have?");
        //takes the input from user
        int dieSides = myObj.nextInt();

        //output in console for input by user
        System.out.println("You will roll " + dieAmount + " die" + " with each having " + dieSides + " sides!");

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

    }
}

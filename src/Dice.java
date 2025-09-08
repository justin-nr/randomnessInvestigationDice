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
        //takes the input
        int dieAmount = myObj.nextInt();
        //asks user how many sides for the die
        System.out.println("How many sides do you want each to have?");
        //takes the input
        int dieSides = myObj.nextInt();

        //output for input by user
        System.out.println("You will roll " + dieAmount + " die" + " with " + dieSides + " sides!");
        System.out.println("In total you rolled a ")

        //for loop for each die roll
        for (int i = 1; i <= dieAmount; i++) {
            int roll = rand.nextInt(dieSides) + 1;
            //writes results in console
            System.out.println("Die " + i + " rolled:" + roll);
        }


    }
}

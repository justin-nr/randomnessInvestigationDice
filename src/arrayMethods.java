//imports arrays object
import java.util.Arrays;

public class arrayMethods {

    //finds highest value from the results
    public static int highestNum(int[] arr) {
        //initialize max value as 0 in the results array
        int max = arr[0];
        //intellij auto improved this: for (int i = 0; i < arr.length; i++){
        //            int val = arr[i];
        //to this...wow
        //for loop to find the highest number in the results
        for (int val : arr) {
            //stops loop once highest num is found
            if (val > max) {
                //makes new max value
                max = val;
            }
        }
        return max;
    }

    //finds lowest value from the results
    public static int lowestNum(int[] arr) {
        //initialize min as - in the results array
        int min = arr[0];
        //for loop to find the lowest number in the results
        for (int val : arr) {
            //stops loop once lowest num is found
            if (val < min) {
                //makes new min value
                min = val;
            }
        }
        return min;
    }

    //finds the average from the results
    public static float averageNum(int[] arr) {
        //initialize average as 0
        int average = 0;
        //loop to find average of the results
        //original was this: for (int i = 0; i < arr.length; i++) {
        //            average += arr[i];
        for (int val : arr) {
            //adds the entire array and makes it the new value
            average += val;
        }
        //takes the sum and divides by the total of the array
        return (float) average / arr.length;
    }

    //finds the median from the results
    public static float medianNum(int[] arr) {
        //makes a copy of array
        int[] numArray = Arrays.copyOf(arr, arr.length);

        //GOT THIS FROM stackoverflow "CALCULATING MEDIAN OF AN ARRAY"
        //sorts array
        Arrays.sort(numArray);

        //initializes median
        float median;

        //checks to see if the array is even or odd (%2) to choose which equation (used chatgpt to explain this)
        if (numArray.length % 2 == 0) {
            //equation for even number array
            median = ((float) numArray[numArray.length / 2] + (float) numArray[numArray.length / 2 - 1]) / 2;
        } else {
            //equation for odd number array
            median = (float) numArray[numArray.length / 2];
        }
        return median;
    }

}

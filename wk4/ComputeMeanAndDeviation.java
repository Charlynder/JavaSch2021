// Assignment 3.45 - Compute Mean & Standard Deviation
// this program will find the mean & deviation using ten values
import java.util.Scanner;
import java.lang.Math;

public class ComputeMeanAndDeviation {

    public static void main(String[] args) {
        // create scanner object
        Scanner scan = new Scanner(System.in);

        // create an array for the input
        double[] points = new double[10];
        
        // get data from the user 
        System.out.println("Calculate Mean & Standard Deviation");
        System.out.print("Enter 10 numbers: ");
        for (int i =0; i < points.length; i++){
            // get 10 points
            points[i] = scan.nextDouble(); // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
            
        }

        // output the mean & the standard deviation
        System.out.println("The mean is: " + mean(points));
        System.out.println("The standard deviation is: " + deviation(points));

        // close Scanner object
        scan.close();

    }

    public static double mean(double[] points) {
        double sum = 0;
        // calculate the sum of points 
        for (int j = 0; j < points.length; j++){
            sum += points[j];
        }

        // return the sum of the points / amount of points
        return sum / points.length;
    }

    public static double deviation(double[] points) {
        // decare the initial deviation
        double deviation = 0;

        // use a for loop to find the actual deviation
        for (int j = 0; j < points.length; j++){
            deviation += Math.pow(points[j] - mean(points), 2);
        }

        // return √deviation / amount of points - 1
        return Math.sqrt(deviation / (points.length - 1));
    }
}
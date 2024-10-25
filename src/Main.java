import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int [] dataPoints = new int[100];
        int sum = 0;

        for (int i =0; i<dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(1, 101);
        }
        System.out.print("| ");
        for (int i=0; i<dataPoints.length; i++) {
            System.out.print(dataPoints[i] + " | ");
        }
        for (int i=0; i<dataPoints.length; i++) {
            sum = sum + dataPoints[i];
        }
        System.out.println();
        System.out.println("The sum of array 'dataPoints' is: " + sum);
        System.out.println("The average of dataPoints is: " + getAverage(dataPoints, sum));
        int number = SafeInput.getRangedInt(in, "Enter a number from 1-100",1,100);
        int count = 0;
        for (int i=0; i<dataPoints.length; i++) {
            if (number == dataPoints[i]) {
                count++;
            }
        }
        if (count==0) {
            System.out.println("We didn't find your number " + number);
        } else {
            System.out.println("We found your number " + number + ", " + count + " time(s)");
        }
        int value = SafeInput.getRangedInt(in, "Enter a number from 1-100",1,100);
        System.out.println();
        System.out.println("SEARCHING THROUGH INDEX");
        for (int i=0; i<dataPoints.length; i++) {
            if (value == dataPoints[i]) {
                System.out.println("We found your number " + value + " in index " + i);
                break;
            } else if (i>=99){
                System.out.println("We didn't find your number " + value);
            }
        }
        System.out.println();
        System.out.println();
        int min=100;
        int max = 0;
        for (int i=0; i<dataPoints.length; i++) {
            if (dataPoints[i]<min) {
                min=dataPoints[i];
            }
            if (dataPoints[i]>max) {
                max=dataPoints[i];
            }
        }
        System.out.println("The minimum value is " + min);
        System.out.println("The maximum value is " + max);
    }
    public static double getAverage(int values[], int add) {

        double average = 0;

        average = (double)add/(double)values.length;
        return average;
    }
}
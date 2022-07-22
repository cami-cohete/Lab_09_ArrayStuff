import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int [] dataPoints = new int [100];
        int sum = 0;
        int average = 0;

        for (int x = 0; x < dataPoints.length; x++)
        {
         dataPoints [x] = rnd.nextInt(100)+1;
        }


        for (int x = 0; x < dataPoints.length; x++)
        {
            System.out.print(dataPoints[x] + " | ");
        }


        for(int x = 0; x < dataPoints.length; x++)
        {
            sum = sum + dataPoints[x];  // sum += e
        }
        average = sum / dataPoints.length;
        System.out.println("\n\nThe Sum of the Random array DataPoints is: " + sum);
        System.out.println("The average of the Random array DataPoints is: " + average);


        System.out.println("\n\nPlease enter a int from 1 - 100: ");
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean searchUserInt = false;
        boolean searchUserIntTwo = false;
        int [] dataPoints = new int [100];
        int sum = 0;
        int average = 0;
        int numOfUserInt = 0;

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



        int userInt = SafeInputCopy.getRangedInt(in,"Please enter a int ",1,100);
        for (int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == userInt)
            {
                numOfUserInt = numOfUserInt + 1;
                searchUserInt = true;
            }
        }
        if (!searchUserInt)
        {
            System.out.println("The submitted value (" + userInt + ") not found!");
        }
        else
        {
            System.out.println("The value " + userInt + " was found " + numOfUserInt + " times in the array.");
        }



        int userIntTwo = SafeInputCopy.getRangedInt(in,"Please enter a int ",1,100);
        for (int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == userIntTwo)
            {
                System.out.println("Found " + userIntTwo + " at index " + x);
                searchUserIntTwo = true;
                break;
            }
        }
        if (!searchUserIntTwo)
        {
            System.out.println("The value (" + userIntTwo + ") was not found!");
        }



        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int x = 0; x < dataPoints.length; x++)
        {
            if (min > dataPoints[x])
            {
                min = dataPoints[x];
            }
            if (max < dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println("\nThe minimum value is " + min + ".");
        System.out.println("The maximum value is " + max + ".");


        for (int b = 0; b < dataPoints.length; b++)
        {
            System.out.print("-");
        }


        System.out.println("\nAverage of dataPoints is: "+ getAverage(dataPoints));
        System.out.println("The minimum value of dataPoints is: "+ min(dataPoints));
        System.out.println("The maximum value of dataPoints is: "+ max(dataPoints));

        int userIntThree = SafeInputCopy.getRangedInt(in,"Please enter a int ",1,100);
        System.out.println("The value " + userIntThree + " was found " + occuranceScan(dataPoints,userIntThree) + " times in the array.");

        int userIntFour = SafeInputCopy.getRangedInt(in,"Please enter a int ",1,100);
        System.out.println("The value " + userIntFour + " was found: " +  contains(dataPoints,userIntFour));
    }


    public static double getAverage(int values[])
    {
        int sum = 0;
        int average = 0;

        for(int a = 0; a < values.length; a++)
        {
            sum = sum + values[a];
        }
        average = sum / values.length;
        return average;
    }

    public static int min(int values[])
    {
        int min = 0;

        for (int a = 0; a < values.length; a++)
        {
            if (min > values[a])
            {
                min = values[a];
            }
        }
        return min;
    }

    public static int max(int values[])
    {
        int max = 0;
        for (int a = 0; a < values.length; a++)
        {
            if (max < values[a])
            {
                max = values[a];
            }
        }
        return max;
    }

    public static int occuranceScan(int values[], int target)
    {
        int occuranceCount = 0;
        for (int a = 0; a < values.length; a++)
        {
            if (values[a] == target)
            {
                occuranceCount = occuranceCount + 1;
            }
        }
        return occuranceCount;
    }

    public static int sum(int values[])
    {
        int sum = 0;

       for(int a = 0; a < values.length; a++)
        {
            sum = sum + values[a];
        }
        return sum;
    }

    public static boolean contains(int values[], int target)
    {
        boolean targetFound = false;

        for (int a = 0; a < values.length; a++)
        {
            if (values[a] == target)
            {
                targetFound = true;
                break;
            }
        }
        return targetFound;
    }
}

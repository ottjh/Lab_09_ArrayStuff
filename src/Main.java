import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //Declaring and initializing the variables
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int DATA_POINTS_LENGTH = 100;
        int[] dataPoints = new int[DATA_POINTS_LENGTH];
        int dataPointsSum = 0;
        int dataPointsAvg = 0;
        int userNum = 0;
        int userNumMatch = 0;
        boolean UserNumFound = false;

        //Randomizing the Data values
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        //Outputting the values of the numbers of the array/set
        System.out.println("The data set is: ");
        for (int i = 0; i < dataPoints.length; i++)
        {
            System.out.print(dataPoints[i] + " | ");
        }
        System.out.println("");

        //Calculating the sum and avg of the data points then displaying them.
        for (int i = 0; i < dataPoints.length; i++)
        {
            dataPointsSum += dataPoints[i];
        }
        dataPointsAvg = dataPointsSum / dataPoints.length;
        System.out.println("The sum of data points is: " + dataPointsSum + ".");
        System.out.println("The average data point is: " + dataPointsAvg + ".");

        //Requesting user to input number then checking data points
        userNum = SafeInput.getRangedInt(in, "Please input a number between 1 and 100", 0, 101);
        //System.out.println("The user number is: " + userNum + ".");
         for (int i = 0; i < dataPoints.length; i++)
         {
             if (dataPoints[i] == userNum)
             {
                 userNumMatch++;
             }
         }
         if (userNumMatch > 0)
         {
             System.out.println("You inputted the number: " + userNum + ".\nIt matched a number in the set: " + userNumMatch + " times.");
         }
         else
         {
             System.out.println("You inputted the number: " + userNum + ". It did not match a number in the set.");
         }

         //Finding where a number is. User input then increment match
        userNumMatch = 0;
         userNum = 0;
        userNum = SafeInput.getRangedInt(in, "Please input a number between 1 and 100", 0, 101);
        for (int i = 0; i < dataPoints.length; i++)
        {
            if (userNum == dataPoints[i])
            {
                userNumMatch = i + 1;
                UserNumFound = true;
                break;
            }
        }
        if (UserNumFound)
        {
            System.out.println("The number: " + userNum + " was found in the set " + userNumMatch + " spots in.");
        }
        else
        {
            System.out.println("The number: " + userNum + " was not found in the set.");
        }
    }
}
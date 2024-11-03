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

    }
}
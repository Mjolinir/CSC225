/*
 * Mjolinir
 * CSC 225D
 * Chapter 3 Exercise 2
 * 
 */
import java.util.*;

public class Chap3Excercise2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cloudCover;
        System.out.print("Enter % of cloud cover: ");
        cloudCover = input.nextInt();
        
        if (cloudCover <= 30)
        {
            System.out.println(cloudCover + "% is: Clear");
        }
        else if (cloudCover > 30 && cloudCover <= 70)
        {
            System.out.println(cloudCover + "% is: Partly Cloudy");
        }
        else if (cloudCover > 70 && cloudCover <= 99)
        {
            System.out.println(cloudCover + "% is: Cloudy");
        }
        else
        {
            System.out.println(cloudCover + "% is: Overcast");
        }
    }
}
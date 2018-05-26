/*
 * Mjolinir
 * CSC 225D
 * Chapter 3 Example 1
 * 
 */
import java.util.*;

public class Chap3Excercise1
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int numDonuts;
       System.out.print("Enter number of donuts: ");
       numDonuts = input.nextInt();
       
       if (numDonuts >= 12)
       {
           System.out.println("Your cost is $" + (numDonuts * .4 ));
        }
        else
        {
            System.out.println("Your cost is $" + (numDonuts * .5 ));
        }
   }
}
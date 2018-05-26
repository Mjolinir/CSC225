/*
 * Mjolinir
 * CSC 225D
 * Chapter 7 Exercise 1
 * 
 */
import java.util.*;

public class Chap7LectureCode
{
    public static void main(String[] args)
    {
        //Create array
        int num[] = new int[5];
        
        //Load array
        for (int subscript = 0;subscript <=4;subscript++)
        {
            num[subscript] = subscript +1;
        }
        
        //Print array
        for (int i = 0;i < 5;i++)
        {
            System.out.print(num[i] + " ");
        }
        
        //Sum the array elements
        int sum = 0;
        for (int j = 0;j < 5; j++)
        {
            sum += num[j];
        }
        System.out.println(sum);
        
        //Count the occurrences
        int targetValue = 3;
        int count = 0;
        for (int k = 0;k < 5;k++)
        {
            if (num[k] == targetValue)
            {
                count++;
            }
        }
        System.out.println(count);
        
        //Determine presence or absence (linear/sequential search) 
        int y = 4;
        boolean found = false;
        for (int index = 0;index < 5; index++)
        {
            if (num[index] == y)
            {
                found = true;
                break;
            }
        }
        if (found == true)
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");
        }
        
        //Print out data in each cell in string array
        String[] myArray = {"Cat","Dog","Panda","Moose","Elk"};
        for (String s: myArray)
        {
            System.out.print(s + " ");
        }
    }
}
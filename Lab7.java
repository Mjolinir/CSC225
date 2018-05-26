 /*
 * Mjolinir
 * CSC 225D
 * Lab 7 Array stuff
 * 
 */
import java.util.*;
import java.security.*;

public class Lab7
{
    public static void main(String[] args)
    {
        int[] num = new int[23];
        getData(num);
        System.out.println("Original Order: ");
        printArray(num);
        System.out.println("BubbleSort Order: ");
        bubbleSort(num);
        printArray(num);
    }
    
    public static void getData(int[] n)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 23 numbers, one each time you are prompted.");
        for (int i = 0; i < n.length; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            n[i] = input.nextInt();
        }
    }
    //Print the array
    public static void printArray(int[] nu)
    {
        for (int x = 0; x < nu.length; x++)
        {
            System.out.println(nu[x]);
        }
        System.out.println();
    }
    //Bubble Sort
    public static void bubbleSort(int[] nu)
    {
        int temp;
        for (int passNum = 1; passNum <= 22; passNum++)
        {
            for (int i = 0; i <= (22 - passNum); i++)
            {
                if (nu[i] > nu[i + 1])
                {
                    temp = nu[i];
                    nu[i] = nu[i + 1];
                    nu[i + 1] = temp;
                }
            }
        }
    }
}

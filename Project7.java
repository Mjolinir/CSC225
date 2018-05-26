 /*
 * Mjolinir
 * CSC 225D
 * Project 7 Array stuff
 * 
 */
import java.util.*;
import java.security.*;

public class Project7
{
    public static void main(String[] args)
    {
        String[] superArray = new String[5];
        getData(superArray);
        System.out.println();
        System.out.println("Original Order: ");
        printArray(superArray);
        System.out.println("SelectSort Order: ");
        selectSort(superArray);
        printArray(superArray);
        System.out.println("BubbleSort Order: ");
        bubbleSort(superArray);
        printArray(superArray);
    }
    
    public static void getData(String[] n)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 super heroes, one each time you are prompted.");
        for (int i = 0; i < n.length; i++)
        {
            System.out.print("Enter name " + (i + 1) + ": ");
            n[i] = input.nextLine();
        }
    }
    //Print the array
    public static void printArray(String[] nu)
    {
        for (int x = 0; x < nu.length; x++)
        {
            System.out.println(nu[x]);
        }
        System.out.println();
    }
    //Bubble Sort Descending;
    public static void bubbleSort(String[] nu)
    {
        String temp;
        int result;
        for (int passNum = 1; passNum <= 4; passNum++)
        {
            for (int i = 0; i <= (4 - passNum); i++)
            {
                result = nu[i].compareToIgnoreCase(nu[i + 1]);
                if (result < 0)
                {
                    temp = nu[i];
                    nu[i] = nu[i + 1];
                    nu[i + 1] = temp;
                }
            }
        }
    }
    //Select Sort Ascending
    public static void selectSort(String[] nu)
    {
        String minValue;
        for (int x = 1; x < nu.length - 1; x++)
        {
            int minIndex = x - 1;
            for (int y = x; y < nu.length; y++)
            {
                if (nu[y].compareTo(nu[minIndex]) < 0)
                {
                    minIndex = y;
                }
            }
            String temp = nu[x - 1];
            nu[x - 1] = nu[minIndex];
            nu[minIndex] = temp;
        }
    }
}

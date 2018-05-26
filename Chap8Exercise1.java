/*
 * Mjolinir
 * CSC 225D
 * Chapter 8 Exercise 1
 * 
 */
import java.util.*;

public class Chap8Exercise1
{
    public static void main(String[] args)
    {
        char[][] table = new char[3][3];
        loadData(table);
        printData(table);
    }
    
    public static void loadData(char[][] t)
    {
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < t.length; row++)
        {
            for (int col = 0; col < t[row].length; col++)
            {
                System.out.print("Enter char for row " + row + ", col " + col + ": ");
                t[row][col] = input.next().trim().charAt(0);
            }
        }
    }
    
    public static void printData(char[][] tbl)
    {
        for (int r = 0; r < tbl.length; r++)
        {
            for (int c = 0; c < tbl[r].length; c++)
            {
                System.out.print("|" + tbl[r][c]);
            }
            System.out.println("|");
        }
    }
}
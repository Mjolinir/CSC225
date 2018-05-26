 /*
 * Mjolinir
 * CSC 225D
 * Project 8 Connect Four
 * 
 */
import java.util.*;
import java.security.*;

public class Project8
{
    public static char player;
    public static int move_counter;
    public static void main(String[] args)
    {
        player = 'R';
        move_counter = 0; //if = 42 then tie
        char[][] board = new char[6][7];
        initArray(board);
        printArray(board);
        while (true)
        {
            if (player == 'R')
            {
                moveRed(board);
            }
            else
            {
                moveYellow(board);
            }
            move_counter++;
            System.out.print('\u000C');
            printArray(board);
            if (checkWin(board) == true)
            {
                if (player == 'R')
                {
                    System.out.println("Yellow player wins!");
                    break;
                }
                else
                {
                    System.out.println("Red player wins!");
                    break;
                }
            }
            else if (move_counter == 42)
            {
                System.out.println("Tie Game!");
                break;
            }
        }
        System.out.print("Game Over - Thanks for playing!");
    }
    
    public static void initArray(char[][] t)
    {
        for (int row = 0; row < t.length; row++)
        {
            for (int col = 0; col < t[row].length; col++)
            {
                t[row][col] = ' ';
            }
        }
    }
    
    public static void moveRed(char[][] brd)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Drop a red disk at column (0-6): ");
        int c = input.nextInt();
        for (int row = 5; row > 0; row--)
        {
            if (brd[row][c] == ' ')
            {
                brd[row][c] = 'R';
                player = 'Y';
                break;
            }
        }
    }
    
    public static void moveYellow(char[][] brd)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Drop a yellow disk at column (0-6): ");
        int c = input.nextInt();
        for (int row = 5; row > 0; row--)
        {
            if (brd[row][c] == ' ')
            {
                brd[row][c] = 'Y';
                player = 'R';
                break;
            }
        }
    }
    
    public static void printArray(char[][] tbl)
    {
        for (int row = 0; row < tbl.length; row++)
        {
            for (int col = 0; col < tbl[row].length; col++)
            {
                System.out.print("|" + tbl[row][col]);
            }
            System.out.println("|");
        }
        System.out.println("---------------");
    }
    
    // Method to check for a winner. Receives 2-D array as parameter. Returns boolean value.
    public static boolean checkWin(char[][] b)
    {
        // Create four boolean variables, one for each set of rows. Initialize all of them to false.
        boolean foundRow = false;
        boolean foundCol = false;
        boolean foundMjrD = false;
        boolean foundMinD = false;
        
        // Check to see if four consecutive cells in a row match.
        // check rows
        for (int r = 0; r <= 5; r++)
        {
            for (int c = 0; c <= 3; c++)
            {
                if (b[r][c] == b[r][c + 1] && b[r][c] == b[r][c + 2] && b[r][c] == b[r][c + 3] && b[r][c] != ' ')
                {
                    foundRow = true;
                    break;
                }
            }
        }
        
        // Check to see if four columns in the same row match
        // check columns
        for (int r = 0 ; r <= 2; r++)
        {
            for (int c = 0; c <= 6; c++)
            {
                if (b[r][c] == b[r + 1][c] && b[r][c] == b[r + 2][c] && b[r][c] == b[r + 3][c] && b[r][c] != ' ')
                {
                    foundCol = true;
                    break;
                }
            }
        }
        
        // Check to see if four diagonals match (top left to bottom right)
        // check major diagonal
        for (int r = 0; r <= 2; r++)
        {
            for (int c = 0; c <= 3; c++)
            {
                if (b[r][c] == b[r + 1][c + 1] && b[r][c] == b[r + 2][c + 2] && b[r][c] == b[r + 3][c + 3] && b[r][c] != ' ')
                {
                    foundMjrD = true;
                    break;
                }
            }
        }
        
        // Check to see if four diagonals in the other direction match (top right to bottom left)
        // check minor diagonal
        for (int r = 0; r <= 2; r++)
        {
            for (int c = 3; c <= 6; c++)
            {
                if (b[r][c] == b[r + 1][c - 1] && b[r][c] == b[r + 2][c - 2] && b[r][c] == b[r + 3][c - 3] && b[r][c] != ' ')
                {
                    foundMinD = true;
                    break;
                }
            }
        }
        
        // If ONE of the booleans is true, we have a winner.
        // checks boolean for a true
        if (foundRow || foundCol || foundMjrD || foundMinD)
            return true;
        else
            return false;
    } // end checkWin method
}
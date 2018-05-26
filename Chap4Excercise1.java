/*
 * Mjolinir
 * CSC 225D
 * Chapter 4 Excercise 1
 * 
 */
import java.util.*;

public class Chap4Excercise1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Do you like broccoli? (y/n): ");
        String answer = input.next().trim().toLowerCase();
        char ans = answer.charAt(0);
                
        if ( Character.isDigit(ans))
        {
            System.out.println("Nope, need y or n - numbers don't count.");
        }
        if (!(Character.isLetterOrDigit(ans)))
        {
            System.out.println("Invalid Input");
        }
        if ( Character.isLetter(ans))
        {
            switch(ans)
            {
                case 'y': System.out.println("Good for you!"); break;
                case 'n': System.out.println("You and George Bush"); break;
                default: System.out.println("This letter makes no sense");
            }
        }       
    }
}
/*
 * Mjolinir
 * CSC 225D
 * Chapter 4 Excercise 2
 * 
 */
import java.util.*;

public class Chap4Excercise2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First and Last name: ");
        String name = input.nextLine().trim();
        System.out.print("Enter your gender (M/F): ");
        String gender = input.nextLine().trim().toLowerCase();
        char gen = gender.charAt(0);
        
        int k = name.indexOf(' ');
        String firstName = name.substring(0, k);
        String lastName = name.substring(k + 1);
        
        if (gen == 'm')
        {
            System.out.println("Dear Mr. " + lastName);
        }
        if (gen == 'f')
        {
            System.out.println("Dear Ms. " + lastName);
        }        
    }
}
/*
 * Mjolinir
 * CSC 225
 * Chapter 2 Excercise 3 sum of zip code digits
 * 
 */
import java.util.*;
public class Chap2Excercise3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first digit of your zip code: ");
        int zip1 = input.nextInt();
        System.out.print("Enter second digit of your zip code: ");
        int zip2 = input.nextInt();
        System.out.print("Enter third digit of your zip code: ");
        int zip3 = input.nextInt();
        System.out.print("Enter fourth digit of your zip code: ");
        int zip4 = input.nextInt();
        System.out.print("Enter fifth digit of your zip code: ");
        int zip5 = input.nextInt();
        
        int zipSum = zip1 + zip2 + zip3 + zip4 + zip5;
        
        System.out.println("The sum of your zip code digits is: " + zipSum );
    }
}
 /*
 * Mjolinir
 * CSC 225D
 * Lab 4 - rock paper scissors lizard spock
 * 
 */
import java.util.*;
import java.security.*;

public class Lab4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose your weapon");
        System.out.print("0: Rock 1: Paper 2: Scissors 3: Lizard 4: Spock: ");
        int userWeapon = input.nextInt();
        
        try
        {
            SecureRandom num = SecureRandom.getInstance("SHA1PRNG");
            int compWeapon;
            compWeapon = num.nextInt(5); //random between 0 and 4
            
            System.out.print("Computer chooses: " + compWeapon);    
            
        if (userWeapon == compWeapon)
        {
            System.out.print(" Tie Game");
        }
        else if (userWeapon == 0 && (compWeapon == 1 || compWeapon == 4))
        {
            System.out.print(" Computer Wins");
        }
        else if (userWeapon == 1 && (compWeapon == 2 || compWeapon == 3))
        {
            System.out.print(" Computer Wins");
        }
        else if (userWeapon == 2 && (compWeapon == 0 || compWeapon == 4))
        {
            System.out.print(" Computer Wins");
        }
        else if (userWeapon == 3 && (compWeapon == 0 || compWeapon == 2))
        {
            System.out.print(" Computer Wins");
        }
        else if (userWeapon == 4 && (compWeapon == 3 || compWeapon == 1))
        {
            System.out.print(" Computer Wins");
        }
        else
        {
            System.out.print(" You Win!");
        }
        }
            catch (NoSuchAlgorithmException nsae)
        {
            
        }
                           }
}
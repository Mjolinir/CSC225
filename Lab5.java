/*
 * Mjolinir
 * CSC 225D
 * Lab5
 * 
 */
import java.util.*;
import java.security.*;

public class Lab5
{
	public static void main(String[] args) 
	{
	  while (true) 
	  {
		Scanner input = new Scanner(System.in);
	    System.out.print("Press R to roll, or Q to quit: ");	    
	    String Dice_Roll = input.nextLine();
        char c = Dice_Roll.charAt(0); 
        if (c == 'R' || c == 'r')
        {
          try
          {
	        SecureRandom num1 = SecureRandom.getInstance("SHA1PRNG");
	        int dice1 = num1.nextInt(6) +1; //random between 1 and 6
	        SecureRandom num2 = SecureRandom.getInstance("SHA1PRNG");
		    int dice2 = num2.nextInt(6) +1; //random between 1 and 6
		    int roll = dice1 + dice2;
		    System.out.println();
		    System.out.print("You rolled "+roll+". ");
		    if(roll == 2 || roll == 3 || roll == 12)
		    {
		  	  System.out.println("You Lose !");
		    }else if(roll == 7 || roll == 11)
		    {
			  System.out.println("You Win !");
		    }
		    else
		    {
			  System.out.println("Point is "+roll+"\n");
			  SecureRandom num21 = SecureRandom.getInstance("SHA1PRNG");
	          int dice21 = num21.nextInt(6) +1; //random between 1 and 6
    	      SecureRandom num22 = SecureRandom.getInstance("SHA1PRNG");
    	      int dice22 = num22.nextInt(6) +1; //random between 1 and 6
			  int roll2 = dice21 + dice22;
			  System.out.print("You rolled "+roll2+". ");
			  while(roll2 != 7)
			  {
				  if(roll == roll2)
				  {
					  System.out.println("You Win !"); break;
				  }
				  else
				  {
					  System.out.println("Point is "+roll+"\n");
				  }
				  SecureRandom num31 = SecureRandom.getInstance("SHA1PRNG");
				  int dice31 = num31.nextInt(6) +1; //random between 1 and 6
				  SecureRandom num32 = SecureRandom.getInstance("SHA1PRNG");
				  int dice32 = num32.nextInt(6) +1; //random between 1 and 6
				  roll2 = dice31 + dice32;
				  System.out.print("You rolled "+roll2+". ");
			  }
			  if(roll2 == 7)
			  {
				  System.out.println("You Lose !");
			  }			
		    }
          }
          catch (NoSuchAlgorithmException nsae)
          {
                
          }
        }
        else
        {
            break;
        }
	  } 
  } 
}
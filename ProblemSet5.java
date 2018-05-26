/*
 * Mjolinir
 * CSC 225D
 * Problem Set 5
 * 
 */
import java.util.*;
import java.security.*;

public class ProblemSet5
{
  public static void main(String[] args)
  {
      // math
      Scanner input = new Scanner(System.in);
      int noPos = 0;
      int noNeg = 0;
      int sumTot = 0;
      int theCount = 0;
      double theAvg = 0.0;
            
      while (true)
      {
          System.out.print("Enter an integer or 0 (zero) to quit: ");
          int int1 = input.nextInt();
          
          if (int1 == 0)
          {
              break;
          }
          if (int1 % 2 == 0)
          {
              noPos++;
              theCount++;
          }
          else
          {
              noNeg++;
              theCount++;
          }
          
          sumTot = sumTot + int1;
          theAvg = sumTot / theCount;
          
          System.out.println("Number of positive: " + noPos);
          System.out.println("Number of negative: " + noNeg);
          System.out.println("Total: " + sumTot);
          System.out.println("Average: " + theAvg);          
      }
      System.out.println("");
      
      // miles to kilometers
      double x = 1;
      System.out.println("Miles\tKilometers");
      while (x <= 10)
      {
          System.out.println(x + "\t" + (x * 1.609));
          x++;
      }
      System.out.println("");
     
      //the n loop
      int n = 0;
      
      // ASCII table
      final int NUMBER_OF_CHAR = 96;
      final int NUMBER_OF_CHAR_PER_LINE = 10;
      int count = 1;
      int ch = 33;
     
      while (count < NUMBER_OF_CHAR)
      {
          if (count % NUMBER_OF_CHAR_PER_LINE == 0)
          {
               System.out.println((char)ch + " ");
               ch++;
               count++;
          }
          else
          {
              System.out.print((char)ch + " ");
              ch++;
              count++;
          }
      }
      System.out.println("");
      
      //nested loops Pattern A
      for(int a = 6; a >= 0;a--)
      {          
          for(int b = 1; b + a <= 6 ; b++)
          {
              System.out.print(b + " ");
          }
          System.out.println();
      }
      System.out.println("");
            
      //nested loops Pattern B            
      for(int a = 0; a <= 6;a++)
      {          
          for(int b = 1; b + a <= 6 ; b++)
          {
              System.out.print(b + " ");
          }
          System.out.println();
      }
      System.out.println("");
      
      //nested loops Pattern C
      for(int a = 6; a >= 0;a--)
      {          
          for(int b = 1; b + a <= 6 ; b++)
          {
              System.out.print(" " + b);
          }
          System.out.println();
      }
      System.out.println("");
            
      //nested loops Pattern D           
      for(int a = 0; a <= 6;a++)
      {          
          for(int b = 1; b + a <= 6 ; b++)
          {
              System.out.print(" " + b);
          }
          System.out.println();
      }
      System.out.println("");
      
      //sum the series
      double sum = 0.0;
      for(double r = 1; r <= 49; r++) {
          sum += ((2*r-1)/(2*r+1));
      }
        System.out.println("The sum is " + sum);
      
      //coin flip
      int noFlips = 0;
      int heads = 0;
      int tails = 0;
      while (noFlips < 1000000)
      {
          try
          {
              SecureRandom num = SecureRandom.getInstance("SHA1PRNG");
              int coinFlip = num.nextInt(2) +1; //random between 1 and 2                          
              
              if (coinFlip == 1)
              {
                  heads++;
                  noFlips++;
              }
              else
              {
                  tails++;
                  noFlips++;
              }
              System.out.println("Heads: " + heads);
              System.out.println("Tails: " + tails);
              System.out.println("");
          }
          catch (NoSuchAlgorithmException nsae)
          {
              
          }
      }
      
      //reverse string
      Scanner input2 = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = input2.nextLine();
      String result = new StringBuilder(str).reverse().toString();
      System.out.println("The reversed string: " + result);
      System.out.println("");
      
      //number of upper case
      Scanner input3 = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str2 = input3.nextLine();
      int capCount = 0;
      int z = str2.length();
      for(int y = 0; y < z; y++)
      {
          if(Character.isUpperCase(str2.charAt(y)))
          {
              char w = str2.charAt(y);
              capCount++;
          }
      }
      System.out.println("Uppercase count: " + capCount);
  }
} 
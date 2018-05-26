/*
 * Mjolinir
 * CSC 225D
 * Problem Set 3
 * 
 */
import java.util.*;

public class ProblemSet3
{
    public static void main(String[] args)
    {
      // random integer & month
      Random rn = new Random();
      int max = 12;
      int min = 1;
      int range = max - min +1;
      int month = rn.nextInt(range) + min;
      
      switch(month)
            {
                case 1: System.out.println("January is " + month); break;
                case 2: System.out.println("February is " + month); break;
                case 3: System.out.println("March is " + month); break;
                case 4: System.out.println("April is " + month); break;
                case 5: System.out.println("May is " + month); break;
                case 6: System.out.println("June is " + month); break;
                case 7: System.out.println("July is " + month); break;
                case 8: System.out.println("August is " + month); break;
                case 9: System.out.println("September is " + month); break;
                case 10: System.out.println("October is " + month); break;
                case 11: System.out.println("November is " + month); break;
                case 12: System.out.println("December is " + month); break;
                default: System.out.println("There is no month" + month);
            }
             System.out.println("");
      
      // increasing integers - ughhh, so clunky, I know
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter three integers separated by spaces: ");
      int int1 = input.nextInt();
      int int2 = input.nextInt();
      int int3 = input.nextInt();
      int f1 = Math.min(int1, int2);
      int first = Math.min(f1, int3);
      int l1 = Math.max(int1, int2);
      int last = Math.max(l1, int3);
            
      if (int1 == first && int2 == last)
        {
          int mid = int3;
          System.out.println(first + " " + mid + " " + last);
          System.out.println("");
        }
      if (int2 == first && int3 == last)
        {
          int mid = int1;
          System.out.println(first + " " + mid + " " + last);
          System.out.println("");
        }
      if (int3 == first && int1 == last)
        {
          int mid = int2;
          System.out.println(first + " " + mid + " " + last);
          System.out.println("");
        }
      if (int1 == last && int2 == first)
        {
          int mid = int3;
          System.out.println(first + " " + mid + " " + last);
          System.out.println("");
        }
      if (int2 == last && int3 == first)
        {
          int mid = int1;
          System.out.println(first + " " + mid + " " + last);
          System.out.println("");
        }
      if (int3 == last && int1 == first)
        {
          int mid = int2;
          System.out.println(first + " " + mid + " " + last);
          System.out.println("");
        }
            
      // ISBN-10
      System.out.print("Enter first nine digits of ISBN: ");
      int isbn10 = input.nextInt();
      isbn10 = isbn10 + 1000000000;
      String isbn = isbn10 + "";
      
     if (isbn.length() == 10)
      {
         char isbn1 = isbn.charAt(1);
         char isbn2 = isbn.charAt(2);
         char isbn3 = isbn.charAt(3);
         char isbn4 = isbn.charAt(4);
         char isbn5 = isbn.charAt(5);
         char isbn6 = isbn.charAt(6);
         char isbn7 = isbn.charAt(7);
         char isbn8 = isbn.charAt(8);
         char isbn9 = isbn.charAt(9);
         int checksum = (Character.getNumericValue(isbn1)*1 + Character.getNumericValue(isbn2)*2 + Character.getNumericValue(isbn3)*3 + Character.getNumericValue(isbn4)*4 + Character.getNumericValue(isbn5)*5 + Character.getNumericValue(isbn6)*6 + Character.getNumericValue(isbn7)*7 + Character.getNumericValue(isbn8)*8 + Character.getNumericValue(isbn9)*9) % 11;
         if (checksum > 9)
         {
             String cs = String.valueOf(checksum);
             cs = "X";
             System.out.println("ISBN-10 is: " + isbn1 + "" + isbn2 + "" + isbn3 + "" + isbn4 + "" + isbn5 + "" + isbn6 + "" + isbn7 + "" + isbn8 + "" + isbn9 + "" + cs);
         }
         else
         {
             System.out.println("ISBN-10 is: " + isbn1 + "" + isbn2 + "" + isbn3 + "" + isbn4 + "" + isbn5 + "" + isbn6 + "" + isbn7 + "" + isbn8 + "" + isbn9 + "" + checksum);
         }          
                  System.out.println("");
       }
       else
       {
           System.out.println("Invalid Input");
           System.out.println("");
       }
    
      //Palindrome
      System.out.print("Enter a three digit integer: ");
      int isThisAPalindrome = input.nextInt();
      String isPalindrome = isThisAPalindrome + "";
      String forward = "";
      String backward = "";
      
      if (isPalindrome.length() == 3)
      {           
         for (int n = 3 - 1; n >= 0; n--)
         {
             backward = backward + isPalindrome.charAt(n);
         }
         if (isPalindrome.equals(backward))
         {
             System.out.println("Is a palindrome");
             System.out.println("");
         }
         else
         {
             System.out.println("Not a palindrome");
             System.out.println("");
         }
      }
      else
      {
          System.out.println("Invalid Input");
          System.out.println("");
      }
         
      // shipping cost
      System.out.print("Enter package weight: ");
      int pkgWeight = input.nextInt();
      double cost = 0;
      
      if ( 0 < pkgWeight && pkgWeight <= 1)
      {
          cost = 3.5;
          System.out.println("Shipping cost: $" + cost * pkgWeight);
          System.out.println("");
      }
      if ( 1 < pkgWeight && pkgWeight <= 3)
      {
          cost = 5.5;
          System.out.println("Shipping cost: $" + cost * pkgWeight);
          System.out.println("");
      }
      if ( 3 < pkgWeight && pkgWeight <= 10)
      {
          cost = 8.5;
          System.out.println("Shipping cost: $" + cost * pkgWeight);
          System.out.println("");
      }
      if ( 10 < pkgWeight && pkgWeight <= 20)
      {
          cost = 10.5;
          System.out.println("Shipping cost: $" + cost * pkgWeight);
          System.out.println("");
      }
      if ( pkgWeight > 20)
      {
           System.out.println("Package cannot be shipped");
           System.out.println("");
      }
            
      // compute triangle perimeter
      System.out.print("Enter the length for each side of triangle in this format (A) (B) (C): ");
      int sideA = input.nextInt();
      int sideB = input.nextInt();
      int sideC = input.nextInt();
      
      if ((sideA + sideB) > sideC && (sideA + sideC) > sideB && (sideB + sideC) > sideA)
      {
          System.out.println("Triangle perimiter is: " + (sideA + sideB + sideC));
          System.out.println("");
      }
      else
      {
          System.out.println("Invalid Input");
          System.out.println("");
      }
      
      // Zeller’s congruence
      System.out.print("Enter a year (yyyy): ");
      int intYear = input.nextInt(); //year
      System.out.print("Enter a month (1-12): ");
      int m = input.nextInt(); //month
      if (m == 1 || m ==2) // I had to look up this correction, could not figure out myself :(
      {
          m += 12;
          intYear--;
      }
      
      System.out.print("Enter a day (1-31): ");
      int q = input.nextInt(); //day
      int k = (intYear % 100); //year of century
      int j = (intYear / 100); //century
      int h = (q + (int)((26 * (m + 1)) / 10.0) + k + (int)(k / 4.0) + (int)(j / 4.0) + (5 * j)) % 7;
      
      switch(h)
            {
                case 0: System.out.println("Saturday"); break;
                case 1: System.out.println("Sunday"); break;
                case 2: System.out.println("Monday"); break;
                case 3: System.out.println("Tuesday"); break;
                case 4: System.out.println("Wednesday"); break;
                case 5: System.out.println("Thursday"); break;
                case 6: System.out.println("Friday"); break;
                default: System.out.println("Shouldn't see this");
            }
            System.out.println("");
      
      // pick a card
      Random ranCard = new Random();
      int maxC = 13;
      int minC = 1;
      int rangeC = maxC - minC +1;
      int card = ranCard.nextInt(rangeC) + minC;
      String cardID = "";
                 
      switch (card) 
      {
         case 1: cardID = "Ace"; break;
         case 2: cardID = "2"; break;
         case 3: cardID = "3"; break;
         case 4: cardID = "4"; break;
         case 5: cardID = "5"; break;
         case 6: cardID = "6"; break;
         case 7: cardID = "7"; break;
         case 8: cardID = "8"; break;
         case 9: cardID = "9"; break;
         case 10: cardID = "10"; break;
         case 11: cardID = "Jack"; break;
         case 12: cardID = "Queen"; break;
         case 13: cardID = "King"; break;
         default: System.out.println("Shouldn't see this");
      }
         
      Random ranSuit = new Random();
      int maxS = 4;
      int minS = 1;
      int rangeS = maxS - minS +1;
      int suit = ranSuit.nextInt(rangeS) + minS;
      String suitID = "";
            
      switch (suit)
      {
          case 1: suitID = "Diamonds"; break;
          case 2: suitID = "Hearts"; break;
          case 3: suitID = "Clubs"; break;
          case 4: suitID = "Spades"; break;
          default: System.out.println("Shouldn't see this");
      }
      
      System.out.println("Your card is " + cardID + " of " + suitID);
      System.out.println("");
      
      // integer divisible by 5 and 6
      System.out.print("Enter an integer: ");
      int intDiv = input.nextInt();
      
      if (intDiv % 5 == 0 && intDiv % 6 == 0)
      {
          System.out.println("Is " + intDiv + " divisible by 5 and 6? true");          
      }
      else
      {
          System.out.println("Is " + intDiv + " divisible by 5 and 6? false");
      }
      if (intDiv % 5 == 0 || intDiv % 6 == 0)
      {
          System.out.println("Is " + intDiv + " divisible by 5 or 6? true");
      }
      else
      {
          System.out.println("Is " + intDiv + " divisible by 5 or 6? false");
      }
      if ((intDiv % 5 == 0 && intDiv % 6 != 0) || (intDiv % 5 != 0 && intDiv % 6 == 0))
      {
          System.out.println("Is " + intDiv + " divisible by 5 or 6, but not both? true");
      }
      else
      {
          System.out.println("Is " + intDiv + " divisible by 5 or 6, but not both? false");
      }
      System.out.println("");
          
      // compare rice cost
      System.out.print("Enter weight of rice 1: ");
      int intRice1Weight = input.nextInt();
      System.out.print("Enter price of rice 1: ");
      double intRice1Price = input.nextDouble();
      
      System.out.print("Enter weight of rice 2: ");
      int intRice2Weight = input.nextInt();
      System.out.print("Enter price of rice 2: ");
      double intRice2Price = input.nextDouble();
      
      double intRice1Total = intRice1Weight * intRice1Price;
      double intRice2Total = intRice2Weight * intRice2Price;
      
      if (intRice1Total < intRice2Total)
      {
          System.out.print("Rice 1 has the best price");
      }
      else if(intRice1Total > intRice2Total)
      {
          System.out.print("Rice 2 has the best price");
      }
      else
      {
          System.out.print("Both rice are the same price");
      }
      System.out.println("");
    }
}
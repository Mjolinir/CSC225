/*
 * Mjolinir
 * CSC 225D
 * Problem Set 4
 * 
 */
import java.util.*;

public class ProblemSet4
{
    public static void main(String[] args)
    {
     //area of a hexagon
     Scanner input = new Scanner(System.in);
     System.out.print("Enter hexagon side: ");
     double hSide = input.nextDouble();
     
     double area = (6 * Math.pow(hSide, 2)) / (4 * Math.tan(Math.PI / 6.0));
     //double area = ((3 * Math.sqrt(3)) / 2) * Math.pow(hSide, 2);
     
     System.out.println("The area of the hexagon is: " + area);
     System.out.println("");
     
     //character of ASCII value
     System.out.print("Enter an ASCII code: ");
     int aCode = input.nextInt();
     char ch = (char)aCode;
               
     System.out.println("The character for ASCII code " + aCode + " is: " + Character.toString(ch));
     System.out.println("");
     
     //vowel or consonant
     System.out.print("Enter a letter: ");
     String letter = input.next().toLowerCase();
     char ltr = letter.charAt(0);
     
       if (ltr !='a' && ltr !='e' && ltr !='i' && ltr !='o' && ltr !='u')
       {
         System.out.println("Letter is a consonant");
       }
       else
       {
         System.out.println("Letter is a vowel");
       }
       System.out.println("");
     
    
     //days in a month
     System.out.print("Enter a year (YYYY): ");
     int year = input.nextInt();
     System.out.print("Enter a month (Jan, Feb, Mar, etc): ");
     String month = input.next();
     int monthNo,days = 0;
     boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
          
     if (isLeapYear)
     {
            switch(month.toLowerCase())
            {
                case "feb": days = 28; break;
                case "apr": days = 30; break;
                case "jun": days = 30; break;
                case "sep": days = 30; break;
                case "nov": days = 30; break;
                default: days = 31;
            }
     } 
     else 
     {                 
            switch(month.toLowerCase())
            {
                case "feb": days = 29; break;
                case "apr": days = 30; break;
                case "jun": days = 30; break;
                case "sep": days = 30; break;
                case "nov": days = 30; break;
                default: days = 31;
            }            
     }
     System.out.println("There are " + days + " days in "+ month + " of " + year);
     System.out.println("");
          
     //String length
     Scanner inputString = new Scanner(System.in);
     System.out.print("Enter a string: ");
     String string1 = inputString.nextLine(); 
          
     System.out.println("The string is " + string1.length() + " characters long");
     System.out.println("The first character is: " + string1.charAt(0));
     System.out.println("");
     
     //substring or not
     Scanner newString = new Scanner(System.in);
     System.out.print("Enter string One: ");
     String strOne = newString.nextLine();
     System.out.print("Enter string Two: ");
     String strTwo = newString.nextLine();
     
     if (strOne.toLowerCase().contains(strTwo.toLowerCase()))
     {
         System.out.println(strTwo + " is a substring of " + strOne);         
     }
     else
     {
         System.out.println(strTwo + " is not a substring of " + strOne);
     }
     System.out.println("");
     
     // order three cities
     Scanner cityString = new Scanner(System.in);
     System.out.print("Enter city One: ");
     String cityOne = cityString.nextLine();
     System.out.print("Enter city Two: ");
     String cityTwo = cityString.nextLine();
     System.out.print("Enter city Three: ");
     String cityThree = cityString.nextLine();
     System.out.print("Enter city Four: ");
     String cityFour = cityString.nextLine();
               
     boolean swapped = false;
     do 
     {
       swapped = false;
       if (cityTwo.compareTo(cityOne) < 0) {
         String tmp = cityTwo;
         cityTwo = cityOne;
         cityOne = tmp;
         swapped = true;
       }
       if (cityThree.compareTo(cityTwo) < 0) {
         String tmp = cityThree;
         cityThree = cityTwo;
         cityTwo = tmp;
         swapped = true;
       }
       if (cityFour.compareTo(cityThree) < 0) {
         String tmp = cityFour;
         cityFour = cityThree;
         cityThree = tmp;
         swapped = true;
       }
     } while (swapped);

    System.out.println("The cities in alpha order are: " + cityOne + ", " + cityTwo + ", " + cityThree + ", " + cityFour);
    System.out.println("");
  }   
}    
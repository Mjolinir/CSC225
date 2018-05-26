/*
 * Mjolinir
 * CSC 225D
 * ifElse Example
 * 
 */
import java.util.*;

public class ConvertTemp
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       int tempType;
       double temp;
       double newTemp;
       String which;
       System.out.print("Enter temp: ");
       temp = input.nextDouble();
    
       System.out.println("Enter scale for resulting degrees");
       System.out.println("1. Farenheight");
       System.out.println("2. Celcius");
       System.out.print("Scale 1 or 2: ");
       tempType = input.nextInt();
    
       if(tempType == 1)
       {
           newTemp = (9.0 / 5.0) * temp + 32.0;
           which = "F";
       }
       else
       {
           newTemp = (5.0 / 9.0) * (temp - 32.0);
           which = "C";
       }
    
       System.out.println("Temp: " + newTemp + which);
   }
}
/*
 * Mjolinir
 * CSC 225
 * Problem Set 2
 * 
 */
import java.util.*;

public class ProblemSet2
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      // Cylinder 
      System.out.print("Enter circle radius: ");
        double radius = input.nextDouble();
      System.out.print("Enter circle length: ");
        double length = input.nextDouble();
        double area = (radius * radius * 3.14);
      System.out.println("The circle area is " + area);
      System.out.println("The circle volume is " + (area * length));
      System.out.println(" ");
       
      // Gratuity 
      System.out.print("Enter bill subtotal: ");
       double subtotal = input.nextDouble();
      System.out.print("Enter gratuity rate: ");
       double rate = input.nextDouble();
       double gratuity = (subtotal * (rate / 100)) + subtotal;
      System.out.println("The gratuity is " + gratuity);
      System.out.println(" ");
       
      // Add integer digits
      System.out.print("Enter number between 0 and 1000: ");
        int random = input.nextInt();
        int sum = 0;
        while (random != 0)
        {
           sum += random % 10;
           random /= 10;
        }
      System.out.println("The sum of the digits is " + sum);  
      System.out.println(" ");
      
      // BMI 
      System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();

      System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;// Constant
        final double METERS_PER_INCH = 0.0254;// Constant
    
        double weightInKilograms = weight * KILOGRAMS_PER_POUND; 
        double heightInMeters = height * METERS_PER_INCH; 
        double bmi = weightInKilograms / 
      (heightInMeters * heightInMeters);

      System.out.println("BMI is "+ bmi);
      System.out.println(" ");
       
      // Fuel Efficiency
      System.out.print("Enter driving distance: ");
        double distance = input.nextDouble();
      System.out.print("Enter MPG: ");
        double mpg = input.nextDouble();
      System.out.print("Enter gas price: ");
        double price = input.nextDouble();
        
        double cost = (distance / mpg) * price;
        
      System.out.println("Total gas cost is $: " + cost);
    }
}
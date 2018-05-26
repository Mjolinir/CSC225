/*
 * Mjolinir
 * CSC 225D
 * Chapter 3 Exercise 3
 * 
 */
import java.util.*;

public class Chap3Excercise3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int factor = 0;
        double pressure = 0.0;
        System.out.print("Enter factor: ");
        factor = input.nextInt();
        
        switch(factor)
        {
            case 1: pressure = 25.0; break;
            case 2: pressure = 36.0; break;
            case 3: pressure = 45.0; break;
            case 4: case 5: case 6: pressure = 49.0; break;
            }
            
            System.out.println("For factor" + factor + ", the pressure is " + pressure);
        }
}
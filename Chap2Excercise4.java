/*
 * Mjolinir
 * CSC 225
 * Chapter 2 Excercise 4 area of room
 * 
 */
import java.util.*;
public class Chap2Excercise4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter room width: ");
        int width = input.nextInt();
        System.out.print("Enter room length: ");
        int length = input.nextInt();
        
        System.out.println("Area of this room is " + width * length);
    }
}
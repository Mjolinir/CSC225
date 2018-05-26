 /*
 * Mjolinir
 * CSC 225D
 * Lab 3 Cash Reciept w/ audio
 * 
 */
import java.util.*;
import java.text.*;
import sun.audio.*;
import java.io.*;

public class Lab3
{
    public static void main(String[] args)
    throws java.io.IOException
    {
        InputStream in = new FileInputStream("C:\\Temp\\SMB.wav");
        AudioStream as = new AudioStream(in);
        Scanner input = new Scanner(System.in);
        
        //input
        System.out.print("How many pizza slices? ");
        int numPizza = input.nextInt();
        System.out.print("How many bags of fries? ");
        int numFries = input.nextInt();
        System.out.print("How many bottles of soda? ");
        int numSoda = input.nextInt();
        
        //processing
        double pizzaTotal = numPizza * 2.00;
        double friesTotal = numFries * 1.50;
        double sodaTotal = numSoda * 1.25;
        
        //output
        System.out.println(" ");
        System.out.println("        Thank You!");
        System.out.println("        ----------");
        System.out.println( numPizza + " Pizza Slice(s) for $" + pizzaTotal);
        System.out.println( numFries + " Bag(s) of Fries for $" + friesTotal);
        System.out.println( numSoda + " Bottle(s) of Soda for $" + sodaTotal);
        System.out.println(" ");
        System.out.println("Total: $" + (pizzaTotal + friesTotal + sodaTotal));
        System.out.println(" ");
        
        AudioPlayer.player.start(as);
        System.out.print("Press 9 to stop the music ");
        int stop = input.nextInt();
        
        if (stop == 9)
           AudioPlayer.player.stop(as);
           
    }
}
import java.util.*;
import java.text.*;
public class Question7
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Calls a class for formatting currency
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        int pizza = 0;
        int fries = 0;
        int soda = 0;
        double pTot = 0;
        double fTot = 0;
        double sTot = 0;
        double total = 0;
        String Xit = " ";

        while (true)
        {
            // Banner
            System.out.println();
            System.out.println("\t\t\tWelcome to the Java Shoppe!");
            System.out.println();        
            System.out.println();        

            
            // INPUT SECTION
            System.out.print("Slices of pizza: ");              
            pizza = input.nextInt();
            
            System.out.print("Bags of fries:   ");              
            fries = input.nextInt();
            
            System.out.print("Cans of soda:    ");              
            soda = input.nextInt();
            
            // PROCESSING SECTION
            pTot = pizza * 2.;
            fTot = fries * 1.5;
            sTot = soda * 1.25;
            total = pTot + fTot + sTot;
            
                // OUTPUT SECTION     
            System.out.println();
            System.out.println("---------------------------------------------------------");
            System.out.println("|\t\t\t\t\t\t\t|");
            System.out.println("|\t\t\t    Order:\t\t\t|");
            System.out.println("|\t\t\t=============\t\t\t|");              
            System.out.println("|\t\t\t\t\t\t\t|");
            System.out.println("| Pizza Slices: \t" + pizza + "\t" + fmt.format(pTot) + "\t\t\t|");
            System.out.println("| Fries: \t\t" + fries + "\t" + fmt.format(fTot) + "\t\t\t|");
            System.out.println("| Soda: \t\t" + soda + "\t" + fmt.format(sTot) + "\t\t\t|");
            System.out.println("| \t\t\t\t ----\t\t\t|");        
            System.out.println("| Total: \t\t\t" + fmt.format(total) + "\t\t\t|");
            System.out.println("|\t\t\t\t\t\t\t|");
            System.out.println("---------------------------------------------------------");
            System.out.println();
           
            System.out.print("Press X to exit: ");
            Xit = input.next().trim().toUpperCase();
            if (Xit.equals("X"))
                break;

            // Clear the terminal window before next loop    
            System.out.print('\u000C');    
        } // end while     
        
        System.out.println("Java Shoppe Cash Register is closed.");
    } // end of main method
} // end of class Lab 3


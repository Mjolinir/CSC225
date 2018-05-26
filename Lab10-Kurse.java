/*
 * Mjolinir
 * CSC 225D
 * Lab10
 * 
 */
import java.util.*;
import java.io.*;
public class Lab10
{
    public static void main(String[] args) throws java.io.IOException
    {
        String[] array = new String[12];
        loadData(array);
        bubbleSort(array);
        createFile(array);
    }
    
    public static void loadData(String[] ary) throws java.io.IOException
    {
        try
        {
            File file = new File("Composer.txt");
            
            Scanner input = new Scanner(file);
            int i = 0;
            while (input.hasNextLine())
            {
                ary[i] = input.nextLine();
                i++;
            }
            System.out.println("Data loaded from: " + file.getAbsolutePath());
            System.out.println();
                     }
        catch (NoSuchElementException e)
        {
             e.printStackTrace();
        }
    }
    
    public static void bubbleSort(String[] nu)
    {
        String temp;
        int result;
        for (int passNum = 1; passNum <= 11; passNum++)
        {
            for (int i = 0; i <= (11 - passNum); i++)
            {
                result = nu[i].compareToIgnoreCase(nu[i + 1]);
                if (result > 0)
                {
                    temp = nu[i];
                    nu[i] = nu[i + 1];
                    nu[i + 1] = temp;
                }
            }
        }
    }
   
    public static void createFile(String[] tu) throws IOException
    {
        int z;
        File outFile = new File("ComposersSorted.txt");
        PrintWriter pw = new PrintWriter(outFile);
        String prev = " ";
        String curr = " ";
        
        // removes duplicates from the output
        for (z = 0;z < tu.length; z++)
        {
            curr = tu[z];
            if (prev.equals(curr))
            {
                continue;
            }
            else
            {
                pw.println(curr);
                System.out.println(tu[z]);
            }
            prev = curr;
        }
        pw.close();
        System.out.println();
        System.out.println("File saved at: " + outFile.getAbsolutePath());
    }
}

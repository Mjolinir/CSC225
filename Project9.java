/*
* Mjolinir
* CSC 225D
* Project 9 Klingon
*
 */
import java.util.*;
import java.io.*;
public class Project9
{
    public static void main(String[] args) throws java.io.IOException
    {
        String[][] array = new String[45][2];
        System.out.println("UNIVERSAL TRANSLATOR ONLINE");
        System.out.println("");
        printLogo();
        loadArray(array);
        while (true)
        {
            String res = promptUser();
            if (res.equals("Q"))
            {
                break;
            }
            //hidden for troubleshooting purposes you can print the array
            else if (res.equals("P"))
            {
               printArray(array);
            }
            else if (res.equals("L"))
            {
                printLogo();
            }
            translate(res,array);
        }
    }
   
    public static String promptUser()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase to translate into Klingon");
        System.out.print("or enter Q to quit: ");
        String answer = input.nextLine().trim().toUpperCase();
        return answer;
    }  
  
    public static void loadArray(String[][] ary) throws java.io.IOException
    {
        try
        {
            //File file = new File("C:\\Temp\\transKling.txt");
            File file = new File("transKling.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextLine())
            {
                for (int row = 0; row < ary.length; row++)
                {
                    for (int col = 0; col < ary[row].length; col++)
                    {
                        ary[row][col] = input.nextLine();
                    }
                }
            }
            System.out.println(ary.length + " translations loaded\n");
                     }
        catch (NoSuchElementException e)
        {
             e.printStackTrace();
        }
    }
   
    public static void printArray(String[][] tbl)
    {
        for (int row = 0; row < tbl.length; row++)
        {
            for (int col = 0; col < tbl[row].length; col++)
            {
                System.out.print("|" + tbl[row][col]);
            }
            System.out.println("|");
        }
    }
   
    public static void printLogo()
    {
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("              |");
        System.out.println("             ' `");
        System.out.println("             | |");
        System.out.println("             | |");
        System.out.println("            '   `");
        System.out.println("         .-'|   |`-.");
        System.out.println("        /  /     \\  \\");
        System.out.println("       |__,\\     /   |");
        System.out.println("      -'   \\   //\\_ |");               
        System.out.println("   ,-'   ___\\.//   `-__");
        System.out.println("  /__,--'       `--.____--");
        System.out.println("         `-._____.-'");
        System.out.println("");
    }
    
    public static void translate(String in, String[][] ary)
    {
        StringTokenizer st = new StringTokenizer(in,". , \n\t\r");
        //int numOfWords = st.countTokens();
        //System.out.println(numOfWords + " tokens");
        
        String t1 = " ";
        //famous Star Trek phrases
        if (in.equals("TODAY IS A GOOD DAY TO DIE"))
        {
            t1 = "Heghlu'meH QaQ jajvam";
        }
        else if (in.equals("REVENGE IS A DISH BEST SERVED COLD"))
        {
            t1 = "bortaS bIr jablu'DI' reH QaQqu' nay'";
        }
        else if (in.equals("BEAM ME UP"))
        {
            t1 = "jol yIchu'";
        }
        else if (in.equals("MAKE IT SO"))
        {
            t1 = "ghoS";
        }
        else if (in.equals("LIVE LONG AND PROSPER"))
        {
            t1 = "chep 'ej qaStaHvIS yIn";
        }
        else if (in.equals("RESISTANCE IS FUTILE"))
        {
            t1 = "cheqaDlaHbe'";
        }
        else
        {
            while (st.hasMoreTokens())
            {
                String s2 = st.nextToken();
                boolean found = false;
                for (int row = 0; row < ary.length; row++)
                {
                    if (s2.equals(ary[row][0]))
                    {
                        found = true;
                        t1 += ary[row][1] + " ";
                    }
                }
                if (!found)
                {
                    t1 += s2 + " "; 
                }
            }
            System.out.println(t1);
            System.out.println();
        }
    }
}
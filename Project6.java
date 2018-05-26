/*
 * Mjolinir
 * CSC 225D
 * Project6 Magic 8 Ball
 * 
 */
import java.util.*;
import java.security.*;

public class Project6
{
    public static void main(String[] args) 
    {
        while (true)
        {
            askQuestion();
            int rndAns = getRandom();
            switch(rndAns) //geeky answers
            {
                case 0: System.out.println("Have you tried turning it off and back on again?\r\n"); break;
                case 1: System.out.println("I reject your reality and substitute my own!\r\n"); break;
                case 2: System.out.println("$DO || ! $DO ; try\r\ntry: command not found\r\n"); break;
                case 3: System.out.println("GIGO error - Garbage in = Garbage Out\r\n"); break;
                case 4: System.out.println("The odds are the same as successfully navigating an asteroid field...\r\n"); break;
                case 5: System.out.println("It's dead, Jim.\r\n"); break;
                case 6: System.out.println("I have a very bad feeling about this...\r\n"); break;
                case 7: System.out.println("The answer is 42.\r\n"); break;
                case 8: System.out.println("Impressive... Most impressive. Obi-Wan has taught you well.\r\n"); break;
                case 9: System.out.println("That is highly illogical.\r\n"); break;
                default: System.out.println("You Broke the 8-Ball!\r\n"); break;
            }
        }
    }
    public static void askQuestion()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ask the Magic 8-Ball a question (enter X to quit): ");
        String question = input.nextLine();
        if (question.equalsIgnoreCase("X"))
        {
            System.exit(0);
        }
    }
    public static int getRandom()
    {
        try
            {
                SecureRandom num = SecureRandom.getInstance("SHA1PRNG");
                int randomResponse;
                randomResponse = num.nextInt(10); //random between 0 and 9
                return randomResponse;
            }
            catch (NoSuchAlgorithmException nsae)
            {
                return 999;
            }
    }
}
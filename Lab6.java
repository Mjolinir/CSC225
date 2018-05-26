/*
 * Mjolinir
 * CSC 225D
 * Lab6 Calculator
 * 
 */
import java.util.*;

public class Lab6
{
    public static void main(String[] args) 
    {
      while(true)
      {
        int num1,num2;
        char op;
        
        num1 = getNumber();
        num2 = getNumber();
        op = getOperator();
        
        switch(op)
        {
            case '+': add(num1, num2); break;
            case '-': subtract(num1, num2); break;
            case '*': multiply(num1, num2); break;
            case '/': divide(num1, num2); break;
            default: System.out.println("Invalid Operator"); break;
        }
      }
    }

    public static int getNumber()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = input.nextInt();
        if (x == (int)x)
        {
            return x;
        }
        else
        {
            System.out.println("Not an integer"); 
            x = 1;
            return x;
        }
    }
    public static char getOperator()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter operation to perform (+,-,x,/): ");
        String operation = input.nextLine();  
        
        if (operation != "+" || operation != "-" || operation != "*" || operation != "/")
        {
            char op = operation.charAt(0);
            return op;
        }
        else
        {
            System.out.println("Not a valid operator");
            char op = '&';
            return op;
        }
    }
           
    public static void add(int num1, int num2)
    {
         System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
         System.out.print("");
         getCont();
    }
    public static void subtract(int num1, int num2)
    {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.print("");
        getCont();
    }
    public static void multiply(int num1, int num2)
    {
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        System.out.print("");
        getCont();
    }
    public static void divide(int num1, int num2)
    {
        if (num2 != 0)
        {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2) + " with a remainder of " + (num1 % num2));
            System.out.print("");
            getCont();
        }
        else
        {
            System.out.println("Cannot divide by 0, you will destroy the universe!");
            getCont();
        }
    }
    public static boolean getCont()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Continue? (y/n): ");
        String cont = input.nextLine().toLowerCase();
        char go = cont.charAt(0);
        
        if (go == 'y')
        {
            return true;      
        }
        else
        {
            System.exit(0);
            return false; 
        }

    }
}
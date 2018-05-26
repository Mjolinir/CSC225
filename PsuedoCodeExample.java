/*
 * Mjolinir
 * CSC 225D
 * Lab 2 Fibonacci Sequence
 * 
 */
public class PsuedoCodeExample
{
    public static void main(String[] args)
    {
        int n1 = 0;
        int n2 = 1;
        int sum = (n1 + n2);
        
        System.out.println( "Fibonacci Sequence: ");
                
        while ( sum < 143)
        {
            n1 = n2;
            n2 = sum;
            sum = (n1 + n2);
            System.out.println( sum );
        } 
    }
}
import java.util.Scanner;
public class Chap5Excercise3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number from 1 to 20: ");
    int count = input.nextInt();
    
    for (int x=1; x <=count; x++)
    {
        System.out.print("* ");
    }       
  }
}
    
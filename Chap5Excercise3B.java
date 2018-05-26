import java.util.Scanner;
public class Chap5Excercise3B {
  public static void main(String[] args) 
  {
      Scanner in = new Scanner(System.in);
      int i, j, rows, cols;
      System.out.print("How many rows: ");
      rows = in.nextInt();
      System.out.print("How many columns: ");
      cols = in.nextInt();
      for (i = 1; i <= rows; i++)
      {
          for (j = 1; j <= cols; j++)
          System.out.print("\t*");
          System.out.println();
      }
  }
}
    
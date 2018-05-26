import java.util.*;
public class Chap5Excercise2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = 1, pos = 0, neg = 0;
		while (num != 0)
		{
			System.out.print("Enter another number: ");
			num = input.nextInt();
			if (num > 0)
				pos++;
			if (num < 0)
				neg++;
		} 
		System.out.println("Positives: " + pos + " Negatives: " + neg);
	}
}

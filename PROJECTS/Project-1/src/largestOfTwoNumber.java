import java.util.Scanner;

public class largestOfTwoNumber
{
	public static void main(String[] args)
	{
		int x, y, largest;
		Scanner scan = new Scanner(System.in);
      
		System.out.print("Enter the First Number: ");
		x = scan.nextInt();
		System.out.print("Enter the Second Number: ");
		y = scan.nextInt();
      
		if(x>y)
			largest = x;
		else
			largest = y;
      
		System.out.println("\nLargest = " +largest);
	}
}
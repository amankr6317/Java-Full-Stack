import java.util.Scanner; 
 
public class LargestNumberExample1  
{  
	public static void main(String[] args)   
	{  
		int a, b, c, largest, temp;  
		Scanner sc = new Scanner(System.in);  

		System.out.print("Enter the first number:");  
		a = sc.nextInt();  
		System.out.print("Enter the second number:");  
		b = sc.nextInt();  
		System.out.print("Enter the third number:");  
		c = sc.nextInt();  
  
		if(a>=b && a>=c)  
			System.out.println(a+" is the largest Number");
		else if (b>=a && b>=c)  
			System.out.println(b+" is the largest Number");  
		else  
			System.out.println(c+" is the largest number");  
	}  
}  
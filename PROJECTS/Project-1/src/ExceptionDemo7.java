import java.util.Scanner;
class ExceptionDemo7 {
	public static void main(String[] args) {
		try {
			int a, b, c;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter First number");
		    a=sc.nextInt();
		    System.out.println("Enter Second number");
		    b=sc.nextInt();
			c=a/b;
			System.out.println("The quotient of"+a+"/"+b+"="+c);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Inside Finally Block");
		}
	}
}

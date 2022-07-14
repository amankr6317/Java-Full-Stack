import java.util.Scanner;

class Calculations {
	public void demo(int a, int b) throws Exception {
		int c;
		c = a + b;
		System.out.println("ADD : " + c);
		c = a - b;
		System.out.println("SUB : " + c);
		c = a / b;
		System.out.println("DIV : " + c);
		c = a * b;
		System.out.println("MUL : " + c);
	}
}

public class ThrowsDemo {
	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		a = sc.nextInt();
		System.out.print("Enter 2nd Number : ");
		b = sc.nextInt();
		try {
			Calculations calculations = new Calculations();
			calculations.demo(a, b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
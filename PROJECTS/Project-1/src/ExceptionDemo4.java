import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionDemo4 {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter 5 number");
	    int[] arr = new int[5];
	    int sum = 0;
		double avg = 0;
		try {
			for (int i = 0; i < 5; i++) {
				arr[i] = Integer.parseInt(sc.next());
			}
			for (int i = 0; i < 5; i++) {
				sum += arr[i];
			}
			avg = sum / 5;
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
	}
}
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter a Number ");
		str = sc.nextLine();
		try {
            int number = Integer.parseInt(str);
            System.out.println("The Square value : "+number*number);
        } catch (NumberFormatException ex){
            System.out.println("Entered input is not a valid format for an integer.");
        }
	}
}
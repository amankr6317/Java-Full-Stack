import java.io.Console;
public class ConsoleDemo {
	public static void main(String args[]) {
		String str; char ch[];
		Console ob=System.console();
		System.out.print("Enter Username: ");
		str=ob.readLine();
		System.out.print("Enter Password: ");
		ch=ob.readPassword();
		System.out.println("Username: "+str+" Password: "+ch);
		String a=String.valueOf(ch);
		System.out.println("Username: "+str+" Password: "+a);
	}
}
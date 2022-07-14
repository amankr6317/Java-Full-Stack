import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("amangmail.com");
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
	}
}

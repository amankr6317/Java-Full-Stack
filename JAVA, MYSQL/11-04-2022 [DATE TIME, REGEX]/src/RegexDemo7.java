import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
	public static void main(String[] args) {
		String regex = "(https?://)*";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("https://www.google.com");
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
	}
}

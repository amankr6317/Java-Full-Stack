import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
	public static void main(String[] args) {
		String regex = "[7-9][0-9]{9}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("9428347832");
		if (matcher.matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Not Valid");
		}
	}
}

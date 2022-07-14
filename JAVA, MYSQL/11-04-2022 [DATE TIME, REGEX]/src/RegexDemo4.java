import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\b\\w+@XYZ\\.com\\b");
		Matcher matcher = pattern.matcher("a@XYZ.com"+"\n"+"b@XYZ.com");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}		
	}
}

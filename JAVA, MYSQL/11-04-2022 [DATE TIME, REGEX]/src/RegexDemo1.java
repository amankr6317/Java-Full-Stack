import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\d+"); 
		String str = "ASDSAIUD3268AKSDJ SADHA89";
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}

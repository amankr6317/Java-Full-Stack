import java.util.regex.Pattern;

public class RegexDemo2 {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\n");
		String str = "ASDSAIUD3268AKSDJ\nSADHA89";
		String arr[] = pattern.split(str);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}

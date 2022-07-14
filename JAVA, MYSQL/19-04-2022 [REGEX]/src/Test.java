
public class Test {
	public static void main(String[] args) {
		String str1 = "AACCC6016B";
		String str2 = "29AACCC6016B1Z5";
		boolean result1 = str1.matches("[A-Z]{5}+[0-9]{4}+[A-Z]{1}");
		String str3 = str2.substring(2, 12);
		boolean result2 = false;
		if (str1.contentEquals(str3)) {
			result2 = true;
		}
		String str4 = str2.replaceAll("[^\\d]", " ");
		str4 = str4.replaceAll(" ", "");
		int sum = 0;
		for (int i = 0; i < str4.length() - 1; i++) {
			if (Character.isDigit(str4.charAt(i)))
				sum = sum + Character.getNumericValue(str4.charAt(i));
		}
		String str5 = "";
		str5 = str5 + sum;
		boolean result3 = false;
		if ((str2.charAt(str2.length() - 1)) == (str5.charAt(str5.length() - 1))) {
			result3 = true;
		}
		if (result1 && result2 && result3) {
			System.out.println("TRUE"); // return true;
		}
	}
}

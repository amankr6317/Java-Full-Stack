import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
	public static void main(String[] args) {
		byte arr[] = { 35, 36, 37, 38 };
		ByteArrayInputStream bin = new ByteArrayInputStream(arr);
		int i = 0;
		while ((i = bin.read()) != -1) {
			char ch = (char) i;
			System.out.print(ch);
		}
	}
}

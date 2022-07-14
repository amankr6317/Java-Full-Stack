import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		File file = new File("D:/yash.txt");
		try {
			FileInputStream fileInputStream = new FileInputStream(file);
			fileInputStream.read();
			Class.forName("TestClassNotFoundException");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
}

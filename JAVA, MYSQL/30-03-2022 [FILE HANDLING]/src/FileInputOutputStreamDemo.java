import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class FileInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream("D:/Yash Technology/Eclipse Workspace/30-03-2022 (File Handling)/src/abc.txt");
			out = new FileOutputStream("D:/Yash Technology/Eclipse Workspace/30-03-2022 (File Handling)/src/xyz.txt");
			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

class BufferedInputOutputDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream(
					"D:/Yash Technology/Eclipse Workspace/30-03-2022 (File Handling)/src/abc.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			FileOutputStream fout = new FileOutputStream(
					"D:/Yash Technology/Eclipse Workspace/30-03-2022 (File Handling)/src/xyz.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
				bout.write(i);
			}
			bin.close();
			fin.close();
			bout.close();
			fout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

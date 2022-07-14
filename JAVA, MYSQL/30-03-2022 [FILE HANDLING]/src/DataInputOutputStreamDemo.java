import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

class DataInputOutputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fin1 = null;
		FileOutputStream fin2 = null;
		DataInputStream din = null;
		DataOutputStream dout = null;
		try {
			fin1 = new FileInputStream("D:/Yash Technology/Eclipse Workspace/30-03-2022 (File Handling)/src/abc.txt");
			fin2 = new FileOutputStream("D:/Yash Technology/Eclipse Workspace/30-03-2022 (File Handling)/src/xyz.txt");
			din = new DataInputStream(fin1);
			dout = new DataOutputStream(fin2);
			int i;
			while ((i = din.read()) != -1) {
				System.out.print(i);
				dout.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				din.close();
				fin2.close();
				fin1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

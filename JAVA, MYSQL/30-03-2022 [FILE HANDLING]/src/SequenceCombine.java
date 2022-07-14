import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

class SequenceInputDemo {
	public static void main(String[] args) {
		FileInputStream fin1 = null, fin2 = null;
		SequenceInputStream st = null;
		FileOutputStream fout;
		try {
			fin1 = new FileInputStream("d:/yash/abc.txt");
			fin2 = new FileInputStream("d:/yash/xyz.txt");
			st = new SequenceInputStream(fin1, fin2);
			fout = new FileOutputStream("d:/yash/combine.txt");
			int i;
			while ((i = st.read()) != -1) {
				System.out.println((char) i);
				fout.write(i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				fin2.close();
				fin1.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
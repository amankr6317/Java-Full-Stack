import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileReaderWriter {
	public static void main(String[] args) throws IOException {
		File f = new File("d:/yash/FileReadWrite.txt");
		f.createNewFile();
		FileWriter w = new FileWriter(f);
		w.write("Welcome to yash");
		w.close();
		FileReader r = new FileReader(f);
		char a[] = new char[20];
		r.read(a);
		for (char c : a) {
			System.out.print(c);
		}
		r.close();
	}
}
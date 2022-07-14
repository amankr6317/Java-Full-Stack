import java.io.File;
import java.io.IOException;

class FileDemo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("d:/yash/abc.txt");
		file.createNewFile();
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.getName());
		System.out.println(file.length());
		file.delete();
	}
}
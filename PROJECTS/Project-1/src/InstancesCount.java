import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class InstancesCount {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Charater : ");
		char ch = sc.next().charAt(0);
		File f = new File("yash.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int c = 0, count = 0;
		while ((c = br.read()) != -1) {
			char character = (char) c;
			if (character == ch) {
				count++;
			}
		}
		System.out.println("file '" + f.getName() + "' has " + count + " instances of letter " + ch);
		br.close();
		sc.close();
	}
}
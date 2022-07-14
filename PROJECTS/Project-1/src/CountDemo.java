import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class Q1 {
	public static void main(String[] args) throws Exception {

		String line;
		int wordCount = 0;
		int characterCount = 0;
		int whiteSpaceCount = 0;
		int lineCount = 0;

		File file = new File("yash.txt");
		FileInputStream fileInputStream = new FileInputStream(file);
		InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

		while ((line = bufferedReader.readLine()) != null) {
			characterCount += line.length();
			String words[] = line.split("\\s+");
			wordCount += words.length;
			whiteSpaceCount += wordCount - 1;
			String sentence[] = line.split("[!?.:]+");
			lineCount += sentence.length;
		}
		System.out.println("Total word count = " + wordCount);
		System.out.println("Total number of line = " + lineCount);
		System.out.println("Total number of characters = " + characterCount);
		System.out.println("Total number of whitespaces = " + whiteSpaceCount);
		bufferedReader.close();
		inputStreamReader.close();
		fileInputStream.close();
	}
}
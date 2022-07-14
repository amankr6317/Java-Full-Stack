package Assignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Q2
{
	public static void main(String[] args) throws IOException {
		File f = new File("yash.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int c = 0, count = 0, countA = 0, countE = 0, countI = 0, countO = 0, countU=0;
		while ((c = br.read()) != -1) {
			char character = (char) c;
			if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' || character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
				count++;
			}
			if (character == 'e' || character == 'E') {
				countE++;
			}
			if (character == 'i' || character == 'I') {
				countI++;
			}
			if (character == 'a' || character == 'A') {
				countA++;
			}
			if (character == 'o' || character == 'O') {
				countO++;
			}
			if (character == 'u' || character == 'U') {
				countU++;
			}
		}
		System.out.println("Vowel Count : "+count);
		System.out.println("A Count : "+countA);
		System.out.println("E Count : "+countE);
		System.out.println("I Count : "+countI);
		System.out.println("O Count : "+countO);
		System.out.println("U Count : "+countU);
		br.close();
	}
}
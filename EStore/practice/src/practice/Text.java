package practice;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Text {
	public static void readText() throws IOException {
		File file = new File("x.txt");
		FileReader fr = new FileReader(file);
		
		int ch = 0;
		while ((ch = fr.read()) != -1) {
			System.out.print((char) ch);
		}
	}

	public static void main(String[] args) throws IOException {
		readText();
	}

}

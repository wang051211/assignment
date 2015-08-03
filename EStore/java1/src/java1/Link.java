package java1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Link {
	
	public static void main(String[] args) throws IOException{
		FileReader reader = new FileReader("link.txt");
		BufferedReader br = new BufferedReader(reader);
		String link = "";
		while(true){
			String s = br.readLine();
			if (s == null){
				break;
			}
			link = getLink(s);
		}
		System.out.println(link);
		System.exit(0);
	}

	/*private static String getLink(String s) {
		Pattern pattern = Pattern.compile("<a\\s*href\\s*=\\s*\"?([^\"]+?)\"?>\\s*\\[\\d\\]\\s*</a>");
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(m.find()){
			matches += m.group();
		}
		return matches;
	}*/

	private static String getLink(String s) {
		String regex = "<a\\s*href\\s*=\\s*\"?([^\"]+?)\"?>\\s*\\[\\d\\]\\s*</a>" ; 
		String matches = "";
		matches = findLink(regex, s);
		return matches;
	}

	private static String findLink(String regex, String s) {
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(m.find()){
			matches += m.group();
		}
		return matches;
	}
		

}

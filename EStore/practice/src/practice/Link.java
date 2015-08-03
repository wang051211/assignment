package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Link {
	public static HashSet<String> isLink(String input) {
		  HashSet<String> set = new HashSet<String>();
		  String regex = "<a\\s*href\\s*=\\s*\"?([^\"]+?)\"?>\\s*\\[\\d\\]\\s*</a>";
		  Pattern p = Pattern.compile(regex);
		  Matcher m = p.matcher(input);
		  while (m.find()) {
		   set.add(m.group(1));
		  }
		  return set;
		 }
	public static void main(String[] args) throws IOException{
		FileReader reader = new FileReader("link.txt");
		BufferedReader br = new BufferedReader(reader);
		HashSet<String> link = new HashSet<String>();
		while(true){
			String s = br.readLine();
			if (s == null){
				break;
			}
			link = isLink(s);
		}
		System.out.println(link);
	}

}

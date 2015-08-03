package practice;

import java.io.FileReader;


public class SmallLetter {
	public static void main(String[] args)  {
		FileReader reader = new FileReader("c:\\input.txt");
		BufferedReader br = new BufferedReader(reader);
		String letters = "";
		while(true){
			String s = br.readLine();
			if (s == null){
				break;
			}
			letters += getMatch(s);
		}
		System.out.println(letters);
	}

	private static String getMatch(String s) {
		String regex = "[A-Z]{3}([a-z])[A-Z]{3}";
//		String regex2 = "^[A-Z]{3}([a-z])[A-Z]{3}[^A-Z]";
//		String regex3 = "[^A-Z][A-Z]{3}([a-z])[A-Z]{3}$";
		String matches = "";
		matches += _findMatch(regex, s);
//		matches += _findMatch(regex2, s);
//		matches += _findMatch(regex3, s);
		return matches;
	}
	
	private static String _findMatch(String regex, String s){
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		String matches = "";
		while(m.find()){
			matches += m.group(1);
		}
		return matches;
	}

}

package practice;

import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Pattern;

public class StringOutput {
	public static <Matcher> void main(String[] args){
		
		String s = "zbzazzzzzbbazzzbazzzazz";
		Pattern p = Pattern.compile("(.)\\1*");
		Matcher m = p.matcher(s);
		ArrayList<String> result = new ArrayList<String>();
		while(m.find()){
			result.add(m.group());
		}
		Collections.sort(result, new Comparator<String>() {
			public int compare(String arg0, String arg1) {
				if(arg0.length()<arg1.length()){
					return 1;
				}else if (arg0.length()>arg1.length()){
					return -1;
				}
				return 0;
			}
		});
		System.out.println(result);
	}

	
}

package practice;

import java.util.Scanner;

public class StringOut {

	public static void main(String[] args) {
		int k;
		int max = 0, sn = 1, maxn = 0;
		System.out.println("ÇëÊäÈë×Ö·û´®(ÒÔ¶ººÅ¸ô¿ª)£º");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		for (int j = 0; j < str.length(); j++) {
			for (k = 1; k < str.length(); k++) 
				if (str.charAt(k) == str.charAt(k + 1))
					sn++;
				// String c=String.valueOf(chars[j]);
				// String[] ch=c.split(",");
				else
					break;
				if (sn > maxn) {
					maxn = sn;
					char maxc=str.charAt(k);
					

				}
				sn = 1;
		}
		for(int n=0;n<str.length();n++)
		System.out.print(maxc);
	}

	
}

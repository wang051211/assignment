package java1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IdentityCard {

	public static int isIdentityCard(ArrayList<String> str) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		Iterator iter = str.iterator();
		while(iter.hasNext()){
			a.add(Integer.parseInt((String) iter.next()));
		}
		int sum = 0;
		sum = a.get(0)* 7 +a.get(1)* 9 + a.get(2) * 10 + a.get(3)
				* 5 + a.get(4)* 8 + a.get(5)* 4 + a.get(6)* 2
				+ a.get(7)* 1 + a.get(8)* 6 + a.get(9)* 3
				+ a.get(10) * 7 + a.get(11) * 9 + a.get(12) * 10
				+ a.get(13) * 5 + a.get(14) * 8 + a.get(15) * 4
				+ a.get(16) * 2;
		int k = sum % 11;
		return k;

	}

	public static void main(String[] args) {
		ArrayList<String> ai = new ArrayList<String>();
		System.out.print("请输入18位身份证号码：");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		//String[] number = str.split(",");
		char[] chars=str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			ai.add((chars[i]+""));
		}
		switch (isIdentityCard(ai)) {
		case 0:
			if (str.charAt(17)=='1') {
				System.out.println("身份证合法！");
			}
			else
				System.out.println("身份证不合法！");
			break;
		case 1:
			if (str.charAt(17)=='0')
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 2:
			if (str.charAt(17)=='x')
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;

		case 3:
			if (str.charAt(17)=='9'){
				System.out.println("身份证合法！");
			}	
			else
				System.out.println("身份证不合法！");
			break;
		case 4:
			if (str.charAt(17)=='8')
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 5:
			if (str.charAt(17)=='7')
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 6:
			if (str.charAt(17)=='6')
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 7:
			if (str.charAt(17)=='5')
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 8:
			if (str.charAt(17)=='4')
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 9:
			if (str.charAt(17)=='3')
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 10:
			if (str.charAt(17)=='2')
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		default:
			break;
		}
	}
}

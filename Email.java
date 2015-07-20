package java1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		System.out.println("请输入email：");
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		if(isEmail(s)){
			System.out.println("输入的email正确！");
		}
		else{
			System.out.println("输入的email不正确！");
		}
	}

	private static boolean isEmail(String s) {
		String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		if(m.find()){
			return true;
		}
		else
			return false;
	}

}

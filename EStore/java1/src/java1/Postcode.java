package java1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Postcode {

	public static void main(String[] args) {
		System.out.println("请输入要匹配的邮政编码：");
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		if(isPostcode(s)){
			System.out.println("输入的邮政编码正确！");
		}
		else{
			System.out.println("输入的邮政编码不正确！");
		}
	}

	private static boolean isPostcode(String s) {
		String regex = "[1-9][0-9]{5}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		if(m.find()){
			return true;
		}
		else
			return false;
	}

}

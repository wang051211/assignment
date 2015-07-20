package java1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Postcode {

	public static void main(String[] args) {
		System.out.println("������Ҫƥ����������룺");
		Scanner sc=new Scanner(System.in);
		String s = sc.next();
		if(isPostcode(s)){
			System.out.println("���������������ȷ��");
		}
		else{
			System.out.println("������������벻��ȷ��");
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

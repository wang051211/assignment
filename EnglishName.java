package java1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EnglishName {
	
	public static void main(String[] args){
		System.out.println("������Ӣ��������");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(isName(s)){
			System.out.println("�����Ӣ�������Ϸ���");
		}
		else
			System.out.println("�����Ӣ���������Ϸ���");	
	}

	private static boolean isName(String s) {
		String regex = "([A-Za-z]+\\s){1,2}[A-Za-z]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		if(m.find())
			return true;
		else
			return false;
	}

}

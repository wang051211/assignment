package java1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ���ͬ���ַ������� 
 * ���룺�����������ɸ��ַ��� 
 * ������ַ���ͬ������ַ���(������ͬ������ַ���Ӧascii��С���ַ�����
 **/
public class CommonString {
	public static void findCommon(ArrayList<String> list) {
		// list.get(0).length();
		// System.out.println("sdgg" + list.get(0).charAt(0));
		// for(int i=0;i<)
		ArrayList<String> l = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			Pattern p = Pattern.compile("(.)\\1+ssss");
			Matcher m = p.matcher(list.get(i));
			if (m.find()) {
				l.add(m.group());
				System.out.println(m.group());
			}
		}
		Collections.sort(l);
		if (l.size() == 0) {
			System.out.println(l.get(0));
		} else {
			for (int j = 0; j < l.size() - 1; j++) {
				if (l.get(j).length() == l.get(j + 1).length()
						&& l.get(j).charAt(0) < l.get(j + 1).charAt(0)) {
					System.out.println(l.get(0));
				} else {
					System.out.println(l.get(j));
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ���(�ԣ��ָ�):");
		String str = sc.next();
		String[] ss = str.split(",");
		// String[][] stdt = {}
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < ss.length; i++) {
			list.add(ss[i]);
		}
		findCommon(list);
	}
}

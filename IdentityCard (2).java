package java1;

import java.util.ArrayList;
import java.util.Scanner;

public class IdentityCard {

	public static int isIdentityCard(ArrayList<Integer> str) {
		int sum = 0;
		sum = str.get(0) * 7 + str.get(1) * 9 + str.get(2) * 10 + str.get(3)
				* 5 + str.get(4) * 8 + str.get(5) * 4 + str.get(6) * 2
				+ str.get(7) * 1 + str.get(8) * 6 + str.get(9) * 3
				+ str.get(10) * 7 + str.get(11) * 9 + str.get(12) * 10
				+ str.get(13) * 5 + str.get(14) * 8 + str.get(15) * 4
				+ str.get(16) * 2;
		int k = sum % 11;
		return k;

	}

	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		System.out.print("请输入18位身份证号码：");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		String[] number = str.split(",");
		/*
		 * if ((str.length()) != 18) { System.out.println();
		 * System.out.print("输入有误！请重新输入："); str = s.nextLine(); }
		 */
		for (int i = 0; i < number.length; i++) {
			ai.add(Integer.parseInt(number[i]));
		}
		System.out.println(isIdentityCard(ai));
		switch (isIdentityCard(ai)) {
		case 0:
			if (number[17] == "1")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;

		case 1:
			if (number[17] == "0")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 2:
			if (number[17] == "x")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;

		case 3:
			if (number[17] == "9")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 4:
			if (number[17] == "8")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 5:
			if (number[17] == "7")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 6:
			if (number[17] == "6")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 7:
			if (number[17] == "5")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 8:
			if (number[17] == "4")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 9:
			if (number[17] == "3")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;
		case 10:
			if (number[17] == "2")
				System.out.println("身份证合法！");
			else
				System.out.println("身份证不合法！");
			break;

		}
	}
}

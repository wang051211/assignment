package practice;

import java.util.Scanner;

public class LeapYear {

	public static boolean isLeap(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		try {
			System.out.print("��������ݣ�");
			Scanner s = new Scanner(System.in);
			int year = s.nextInt();
			if (isLeap(year))
				System.out.println(year + "������");
			else
				System.out.println(year + "��������");
		} catch (Exception e) {
			System.out.println("��������");
			System.out.print("��������ȷ����ݣ�");
			Scanner s = new Scanner(System.in);
			int year = s.nextInt();
			if (isLeap(year))
				System.out.println(year + "������");
			else
				System.out.println(year + "��������");
		}
        System.out.println("�Ƿ�������룺y|Y or n|N");
        if(input="y|Y"){
        	System.out.print("��������ݣ�");
			Scanner s = new Scanner(System.in);
			int year = s.nextInt();
			if (isLeap(year))
				System.out.println(year + "������");
			else
				System.out.println(year + "��������");
        }
        else if(input="n|N"){
        	
        }
	}

}

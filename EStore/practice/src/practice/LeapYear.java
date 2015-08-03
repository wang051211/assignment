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
			System.out.print("请输入年份：");
			Scanner s = new Scanner(System.in);
			int year = s.nextInt();
			if (isLeap(year))
				System.out.println(year + "是闰年");
			else
				System.out.println(year + "不是闰年");
		} catch (Exception e) {
			System.out.println("输入有误！");
			System.out.print("请输入正确的年份：");
			Scanner s = new Scanner(System.in);
			int year = s.nextInt();
			if (isLeap(year))
				System.out.println(year + "是闰年");
			else
				System.out.println(year + "不是闰年");
		}
        System.out.println("是否继续输入：y|Y or n|N");
        if(input="y|Y"){
        	System.out.print("请输入年份：");
			Scanner s = new Scanner(System.in);
			int year = s.nextInt();
			if (isLeap(year))
				System.out.println(year + "是闰年");
			else
				System.out.println(year + "不是闰年");
        }
        else if(input="n|N"){
        	
        }
	}

}

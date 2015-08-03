package java1;

import java.util.Scanner;

public class GetDays {
	public static boolean notDays(int year){
		if(year>1970) 
			return true;
		else 
			return false;
	}
	public static boolean isLeap(int year){
		if((year%4==0&&year%100!=0)||year%400==0)
			return true;
		else 
			return false;
	}
	public static int getDays(int year){
		if(isLeap(year))
			return 366;
		else
			return 365;
		
	}
	
	
	public static void main(String[] args){
		
		System.out.print("请输入年份：");
		Scanner s=new Scanner(System.in);
		int year=s.nextInt();
		if(!notDays(year)){
			System.out.println("输入错误！请输入正确的年份：");
			year=s.nextInt();	
		}
		System.out.println(year+"年的天数是："+getDays(year));
		
	}

}

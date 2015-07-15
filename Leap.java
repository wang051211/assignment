package java2;

import java.util.Scanner;

public class Leap {
	public static boolean isLeap(int year){
		if(year%4==0&&year%100!=0||year%400==0)
			return true;
		else 
			return false;
	}
   public static void main(String[] args){
	   System.out.print("请输入年份：");
	   Scanner s=new Scanner(System.in);
	   int year=s.nextInt();
	   if(isLeap(year))
	      System.out.println(year+"是闰年");
	   else
	      System.out.println(year+"不是闰年");
   }
	
}

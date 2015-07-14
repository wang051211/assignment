package area;

import java.util.Scanner;

public class Area {
	 public static double getArea(double r){
			double pi=3.14;
			return pi*r*r ;
		}
		public static void main(String[] args){
			System.out.print("半径r为：");
		    Scanner sc=new Scanner(System.in);
			double r=sc.nextDouble();
			System.out.println("面积为："+getArea(r));
	}

}

package area;

import java.util.Scanner;

public class Area {
	 public static double getArea(double r){
			double pi=3.14;
			return pi*r*r ;
		}
		public static void main(String[] args){
			System.out.print("�뾶rΪ��");
		    Scanner sc=new Scanner(System.in);
			double r=sc.nextDouble();
			System.out.println("���Ϊ��"+getArea(r));
	}

}

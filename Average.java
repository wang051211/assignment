package java1;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
	public static double averageScore(ArrayList<Integer> scores) {
		int length = scores.size();
		double sum = 0;
		double aver = 0;
		int i = 0;
		// for循环
		for (; i < length; i++) {
			sum = sum + scores.get(i);
		}

		// for循环2
		/*
		 * for(Integer x: scores){ sum=sum+x; }
		 */

		// while循环
		/*
		 * while(i<length){ sum=sum+scores.get(i); i++; }
		 */

		// do...while循环
		/*
		 * do{ sum=sum+scores.get(i); i++; }while(i<length);
		 */

		aver = sum / length;
		return aver;
	}

	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		System.out.print("请输入成绩(以逗号隔开)：");
		Scanner s = new Scanner(System.in);
		String scores = s.next();
		String[] str = scores.split(",");
		for (int i = 0; i < str.length; i++) {
			ai.add(Integer.parseInt(str[i]));
		}
		System.out.println("平均成绩为：" + averageScore(ai));
	}
}

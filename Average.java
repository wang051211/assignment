package java1;

import java.util.ArrayList;
import java.util.Scanner;

public class Average {
	public static double averageScore(ArrayList<Integer> scores) {
		int length = scores.size();
		double sum = 0;
		double aver = 0;
		int i = 0;
		// forѭ��
		for (; i < length; i++) {
			sum = sum + scores.get(i);
		}

		// forѭ��2
		/*
		 * for(Integer x: scores){ sum=sum+x; }
		 */

		// whileѭ��
		/*
		 * while(i<length){ sum=sum+scores.get(i); i++; }
		 */

		// do...whileѭ��
		/*
		 * do{ sum=sum+scores.get(i); i++; }while(i<length);
		 */

		aver = sum / length;
		return aver;
	}

	public static void main(String[] args) {
		ArrayList<Integer> ai = new ArrayList<Integer>();
		System.out.print("������ɼ�(�Զ��Ÿ���)��");
		Scanner s = new Scanner(System.in);
		String scores = s.next();
		String[] str = scores.split(",");
		for (int i = 0; i < str.length; i++) {
			ai.add(Integer.parseInt(str[i]));
		}
		System.out.println("ƽ���ɼ�Ϊ��" + averageScore(ai));
	}
}

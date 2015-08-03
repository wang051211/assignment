package practice;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListPractice {

	public static void main(String[] args){
		ArrayList<Integer> p = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
			p.add(i);
			//System.out.print(p.get(i));
		p.remove(5);//将第6个元素移除
		for( int i=0;i<3;i++ ) //再增加3个元素
		  p.add(i+20);
		for(int j=0;j<p.size();j++)
		System.out.print(p.get(j)+" ");


		
	}
	

}

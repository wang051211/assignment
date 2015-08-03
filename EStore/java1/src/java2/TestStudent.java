package java2;

import java1.Student;

public class TestStudent {
	public static void main(String[] args){
		int[] cet4_scores={417,390,405,437};
		Student s=new Student("wang",0,"µç×Ó",cet4_scores);
		s.printInfo();
		s.level_up();
		s.printInfo();
		
	} 

}

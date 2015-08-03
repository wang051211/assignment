package java2;

import java1.Square;

public class TestSquare {
	public static void main(String[] args){
		Square s1=new Square();
		Square s2=new Square(10);
		Square s3=new Square(10,"red");
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		
	}

}

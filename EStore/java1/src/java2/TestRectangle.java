package java2;

import java1.Rectangle;

public class TestRectangle {
	public static void main(String[] args){
		Rectangle s1=new Rectangle();
		Rectangle s2=new Rectangle(12);
		Rectangle s3=new Rectangle(12,10);
		Rectangle s4=new Rectangle(12,10,"red");
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		s4.printInfo();
		
		
	}

}

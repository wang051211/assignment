package java1;

public class Square {
	private double length;
	private String color;
	
	public Square(){
		
	}
	public Square(double length){
		this.length = length;
	}
	public Square(double length,String color){
		this.length = length;
		this.color = color;
		
	}
	public void printInfo() {
		System.out.println("边长为："+length+"  颜色："+color);
		System.out.println("面积为："+getArea());
		
	}
	public double getArea(){
		double area=length*length;
		return area;
		
	}
	
	public static void main(String[] args){
		Square s1=new Square();
		Square s2=new Square(10);
		Square s3=new Square(10,"red");
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		
	}



}

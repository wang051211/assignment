package java1;

public class Rectangle {
	private double length;
	private double width;
	private String color;

	public Rectangle() {

	}

	public Rectangle(double length) {
		this.length = length;
	}

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public Rectangle(double length, double width, String color) {
		this.length = length;
		this.width = width;
		this.color = color;

	}

	public void printInfo() {
		System.out.println("长为：" + length + "  宽为：" + width + "  颜色：" + color);
		System.out.println("面积为：" + getArea());

	}

	public double getArea() {
		double area = length * width;
		return area;

	}

	public static void main(String[] args) {
		Rectangle s1 = new Rectangle();
		Rectangle s2 = new Rectangle(12);
		Rectangle s3 = new Rectangle(12, 10);
		Rectangle s4 = new Rectangle(12, 10, "red");
		s1.printInfo();
		s2.printInfo();
		s3.printInfo();
		s4.printInfo();

	}

}

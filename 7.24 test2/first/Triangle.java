package Test;

public class Triangle extends Shape {
	private double length;
	private double height;

	public Triangle(double length, double height) {
		this.length = length;
		this.height = height;
	}

	public double getArea() {
		double area = 0;
		return area = length * height / 2;
	}

}

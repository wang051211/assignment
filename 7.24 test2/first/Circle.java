package Test;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		double area = 0;
		return area = Math.PI * radius * radius;
	}

}

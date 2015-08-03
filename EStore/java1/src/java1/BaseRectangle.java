package java1;

public class BaseRectangle {
	public double length;
	public double width;
	public String color;

	public BaseRectangle(double length, String color) {
		this.length = length;
		this.color = color;
		this.width = length;
	}

	public void printInfo() {
		System.out.println("长为：" + length + "  宽为：" + width + "  颜色：" + color);
		System.out.println("面积为：" + getArea());

	}

	public double getArea() {
		double area = length * width;
		return area;

	}

}

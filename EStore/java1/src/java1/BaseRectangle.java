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
		System.out.println("��Ϊ��" + length + "  ��Ϊ��" + width + "  ��ɫ��" + color);
		System.out.println("���Ϊ��" + getArea());

	}

	public double getArea() {
		double area = length * width;
		return area;

	}

}

package practice;

public class Changfangti extends Object3D {
	public double length;
	public double width;
	public double height;

	public Changfangti(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double getVolume() {
		double volume;
		return volume = length * width * height;
	}

	public double getSurfaceArea() {
		double surface_area;
		return surface_area = 2 * length * width + 2 * length * height + 2
				* height * width;
	}

	public void printInfo() {
		System.out
				.println("体积为：" + getVolume() + "   表面积为：" + getSurfaceArea());

	}

}

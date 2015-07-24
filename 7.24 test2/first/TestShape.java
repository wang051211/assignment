package Test;

import java.util.ArrayList;

public class TestShape {

	public static void main(String[] args) {
		ArrayList shapes = new ArrayList();

		shapes.add(new Rectangle(2, 3));
		shapes.add(new Square(2));
		shapes.add(new Circle(2));
		shapes.add(new Triangle(4, 2));

		System.out.println("Total Area:" + getTotalArea(shapes));

	}

	public static double getTotalArea(ArrayList shapes) {
		double total_area = 0;
		for (int i = 0; i < shapes.size(); i++) {
			total_area += ((Shape) shapes.get(i)).getArea();

		}
		return total_area;

	}

}

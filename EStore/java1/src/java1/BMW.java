package java1;

public class BMW extends Car {
	private String name;
	private int price;

	public BMW(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

}

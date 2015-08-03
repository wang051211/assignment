package java1;

public class CarShop {
	private static int money = 0;

	public static void sellCar(Car c) {
		System.out.println("sellCar is:" + c.getName());
		System.out.println("¼ÛÇ®£º" + c.getPrice());
		money = money + c.getPrice();

	}

	public static int getMoney() {
		return money;

	}

}

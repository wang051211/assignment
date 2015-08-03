package java1;

public class TestCar {

	public static void main(String[] args) {
		CarShop shop = new CarShop();
		shop.sellCar(new QQ("QQ3", 50000));
		shop.sellCar(new BMW("BMW X6", 1000000));
		System.out.println("Sale income: " + shop.getMoney());

	}

}

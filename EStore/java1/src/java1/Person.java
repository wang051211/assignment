package java1;

public class Person {

	/*Leg[] leg = new Leg[2];
	Hand[] hand = new Hand[2];*/
	private Leg[] leg;
	private Hand[] hand;

	public void printInfo() {
		for (int i = 0; i < 2; i++) {
			System.out.println("第" + (i + 1) + "条腿的重量为:" + leg[i].getWeight()
					+ "    第" + (i + 1) + "条腿的长度为:" + leg[i].getLength());
			System.out.println("第" + (i + 1) + "只手的重量为:" + hand[i].getWeight()
					+ "    第" + (i + 1) + "只手的长度为:" + hand[i].getLength());
		}

	}

}

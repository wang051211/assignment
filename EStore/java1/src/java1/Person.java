package java1;

public class Person {

	/*Leg[] leg = new Leg[2];
	Hand[] hand = new Hand[2];*/
	private Leg[] leg;
	private Hand[] hand;

	public void printInfo() {
		for (int i = 0; i < 2; i++) {
			System.out.println("��" + (i + 1) + "���ȵ�����Ϊ:" + leg[i].getWeight()
					+ "    ��" + (i + 1) + "���ȵĳ���Ϊ:" + leg[i].getLength());
			System.out.println("��" + (i + 1) + "ֻ�ֵ�����Ϊ:" + hand[i].getWeight()
					+ "    ��" + (i + 1) + "ֻ�ֵĳ���Ϊ:" + hand[i].getLength());
		}

	}

}

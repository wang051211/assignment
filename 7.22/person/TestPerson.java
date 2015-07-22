package java1;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person();
		p.hand[0] = new Hand(2, 10);
		p.hand[1] = new Hand(2, 10);
		p.leg[0] = new Leg(30, 100);
		p.leg[1] = new Leg(30, 100);
		p.printInfo();
	}

}

package practice;

public class TestMain {

	public static void main(String[] args) {
		printObject3D(new Changfangti(1, 2, 3));
		printObject3D(new Lifangti(2, 2, 2));
	}

	private static void printObject3D(Object3D obj) {
		obj.printInfo();
	}

}

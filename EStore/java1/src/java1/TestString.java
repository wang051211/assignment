package java1;

public class TestString {

	public static void main(String[] args) {
		StringMatch m = new StringMatch("ccbbbaaddaaffsgccbbcch");
		System.out.println(m.numberOfOccurence('a'));
		System.out.println(m.getMaxSubStr(2));
		System.out.println(m.getMaxSubStr(3));
		System.out.println(m.getMaxSubStr(4));

	}

}

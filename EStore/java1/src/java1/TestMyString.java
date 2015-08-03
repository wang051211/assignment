package java1;

public class TestMyString {

	public static void main(String[] args) {
		MyString x = new MyString("abc");
		System.out.println(x.toValue());
		System.out.println(x.length());
		x.reverse();
		System.out.println(x.toValue());
		System.out.println(x.length());
		x.lower();
		System.out.println(x.toValue());
		x.upper();
		System.out.println(x.toValue());
		MyString y = new MyString("xyz");
		x.concat(y);
		System.out.println(x.toValue());
	}

}

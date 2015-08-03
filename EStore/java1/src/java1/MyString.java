package java1;

/* int length()
 void reverse() 返回反转的字符串，例如abc执行后变为cba
 void concat(MyString x)将x字符串连接，例如abc.concat(xyz)执行后变为abcxyz
 void lower()转换为小写
 void upper()转换为大写
 String toValue()转换为String*/

public class MyString {
	private String x;

	public MyString(String x) {
		this.x = x;
	}

	public int length() {
		return x.length();
	}

	public void reverse() {
		char[] c = new char[x.length()];
		for (int i = 0; i < x.length(); i++)
			c[i] = x.charAt(x.length() - 1 - i);
		x = String.valueOf(c);
	}

	public void concat(MyString y) {
		x = x + y.toValue();
	}

	public void lower() {
		char[] y = x.toCharArray();
		for (int index = 0; index < x.length(); index++) {
			if (((int) x.charAt(index) > 64) && ((int) x.charAt(index) < 91)) {
				y[index] = (char) ((int) x.charAt(index) + 32);
			}
		}
		x = String.valueOf(y);
	}

	public void upper() {
		char[] y = x.toCharArray();
		for (int index = 0; index < x.length(); index++) {
			if (((int) x.charAt(index) > 96) && ((int) x.charAt(index) < 123)) {
				y[index] = (char) ((int) x.charAt(index) - 32);
			}
		}
		x = String.valueOf(y);
	}

	public String toValue() {
		return x;
	}

}

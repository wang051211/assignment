package java2;

import java1.Man;

public class TestMan {

	public static void main(String[] args) {
		Man m = new Man("xiaoming", 18, 180.5, "M");
		System.out.println("������" + m.getName());
		System.out.println("�Ա�" + m.getGender());
		System.out.println("���䣺" + m.getAge());
		System.out.println("��ߣ�" + m.getHeight());
		if (m.CanMarry(m.getGender(), m.getAge())) {
			System.out.println("The person can marry!");
		} else {
			System.out.println("The person cannot marry!");
		}

	}

}

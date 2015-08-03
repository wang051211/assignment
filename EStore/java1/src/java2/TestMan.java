package java2;

import java1.Man;

public class TestMan {

	public static void main(String[] args) {
		Man m = new Man("xiaoming", 18, 180.5, "M");
		System.out.println("姓名：" + m.getName());
		System.out.println("性别：" + m.getGender());
		System.out.println("年龄：" + m.getAge());
		System.out.println("身高：" + m.getHeight());
		if (m.CanMarry(m.getGender(), m.getAge())) {
			System.out.println("The person can marry!");
		} else {
			System.out.println("The person cannot marry!");
		}

	}

}

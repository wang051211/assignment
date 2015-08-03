package java1;

public class Student {
	private String name;
	private int grade;
	private String major;
	private int[] cet4_scores;

	public Student(String name, int grade, String major, int[] cet4_scores) {
		this.name = name;
		this.grade = grade;
		this.major = major;
		this.cet4_scores = cet4_scores;

	}

	public String getGrade() {
		String[] gradelist = { "һ", "��", "��", "��" };
		return gradelist[grade];

	}

	public void level_up() {
		if (grade < 0 || grade >= 4) {
			System.out.println("�Ѿ���ҵ");
		} else {
			grade++;
			System.out.println("��һ��Ϊ��" + getGrade() + "�꼶");

		}

	}

	public boolean passed_cet4() {
		for (int i = 0; i < cet4_scores.length; i++) {
			if (cet4_scores[i] >= 425) {
				return true;
			}
		}
		return false;
	}

	public void printInfo() {
		System.out.println("������" + name + "  �꼶��" + getGrade() + "   רҵ:"
				+ major);
		if (passed_cet4()) {
			System.out.println("ͨ��CET4");
		} else {
			System.out.println("δͨ��CET4");
		}

	}

	public static void main(String[] args) {
		int[] cet4_scores = { 417, 390, 405, 437 };
		Student s = new Student("wang", 0, "����", cet4_scores);
		s.printInfo();
		s.level_up();
		s.printInfo();

	}

}

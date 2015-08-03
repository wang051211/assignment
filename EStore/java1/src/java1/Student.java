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
		String[] gradelist = { "一", "二", "三", "四" };
		return gradelist[grade];

	}

	public void level_up() {
		if (grade < 0 || grade >= 4) {
			System.out.println("已经毕业");
		} else {
			grade++;
			System.out.println("升一级为：" + getGrade() + "年级");

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
		System.out.println("姓名：" + name + "  年级：" + getGrade() + "   专业:"
				+ major);
		if (passed_cet4()) {
			System.out.println("通过CET4");
		} else {
			System.out.println("未通过CET4");
		}

	}

	public static void main(String[] args) {
		int[] cet4_scores = { 417, 390, 405, 437 };
		Student s = new Student("wang", 0, "电子", cet4_scores);
		s.printInfo();
		s.level_up();
		s.printInfo();

	}

}

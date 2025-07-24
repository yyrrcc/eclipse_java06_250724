package test1.person;

public class Student extends Person {
	int score;

	public Student(String name) {
		super(name);
	}

	public void grade(int score) {
		if (score >= 80) {
			System.out.println("우수한 성적입니다.");
		} else if (score >= 60) {
			System.out.println("보통 성적입니다.");
		} else {
			System.out.println("분발하세요.");
		}

	}

}

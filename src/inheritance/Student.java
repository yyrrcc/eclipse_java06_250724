package inheritance;

public class Student extends Person {
	String grade;

	// 생성자 만들 때 부모 클래스의 생성자가 호출하면서 name 값을 필드값으로 넘긴다
	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

}

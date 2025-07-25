package test2.person;

public class Student extends Person {

	// 생성자
	public Student(String name) {
		super(name);
	}

	@Override
	void sayHello() {
		System.out.println("안녕하세요, 저는 학생입니다.");
	}

}

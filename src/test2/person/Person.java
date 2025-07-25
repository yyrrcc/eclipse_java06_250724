package test2.person;

// 추상클래스에서 생성자가 가능한지 여부를 알아보시오.
public abstract class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	abstract void sayHello();

	public static void printHi() {
		System.out.println("안녕하세요. 반갑습니다!");

	}
}

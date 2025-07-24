package inheritance;

// 부모 클래스 Animal 상속 받은 자식 클래스 Dog
public class Dog extends Animal {
	String tail;

	public Dog() {
		super(); // super() : 부모 클래스의 생성자 호출
	}

	public Dog(String tail) {
		super();
		this.tail = tail;
	}

	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void run() {
		System.out.println("달린다.");
	}

	public void sleep() {
		System.out.println("잔다.");
	}

}

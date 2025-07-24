package inheritance;

// animal, dog, dogmain 다시 공부할 것
// 부모 클래스
public class Animal {
	String name;
	int age;
	String sound;

	public Animal() {
	}

	public Animal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public Animal(String name, int age, String sound) {
		this.name = name;
		this.age = age;
		this.sound = sound;
	}

	public void eat() {
		System.out.println("먹는다.");
	}

	public void bark() {
		System.out.println(this.sound);
	}
}

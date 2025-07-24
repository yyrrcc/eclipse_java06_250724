package test1.animal;

public class Dog extends Animal {
	public void sleep() {
		System.out.println("잠을 잔다.");
	}

	@Override
	public void bark() {
		super.bark();
	}
}

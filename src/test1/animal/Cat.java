package test1.animal;

public class Cat extends Animal {

	public void watch() {
		System.out.println("벌레를 본다.");
	}

	@Override
	public void bark() {
		System.out.println("야옹야옹");
	}

}

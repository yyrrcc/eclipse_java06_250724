package test1.animal;

public class Dog extends Animal {
	public void sleep() {
		System.out.println("잠을 잔다.");
	}

	// Animal 부모 클래스와 동일한 메서드를 사용할 경우 메서드 오버라이딩 할 필요 없음
//	@Override
//	public void bark() {
//		super.bark();
//	}
}

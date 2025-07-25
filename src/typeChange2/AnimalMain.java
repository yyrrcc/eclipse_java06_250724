package typeChange2;

public class AnimalMain {

	public static void main(String[] args) {

		Animal animal = new Dog(); // 업캐스팅(부모 = 자식)
		animal.name = "해피";
		// animal.age; // 자식 클래스의 필드는 접근 불가
		animal.sound(); // 자식 클래스에 오버라이딩된 메서드 실행 가능

		// 내가 만든 거 다시 확인해보기
//		Dog dog = (Dog) new Animal(); // 다운 캐스팅
//		dog.age = 5;
//		dog.name = "보리";
//		dog.sound();

		// 학원 수업
		Dog dog1;
		dog1 = (Dog) animal;
		dog1.age = 10;
		dog1.name = "멍멍이";
		dog1.sound();

		Animal animal2 = new Animal(); // 인스턴스화 실체 객체가 Animal 클래스로 만들어짐
		// Dog dog2 = (Dog) animal2; // ClassCastException 오류 발생

		Animal animal3 = new Cat();
		// animal3.eat(); // 자식 클래스의 메서드는 접근 불가
		Cat cat = (Cat) animal3; // 다운 캐스팅
		cat.eat(); // 자식 메서드 접근 가능

		// 다운 캐스팅을 할 경우 instanceof 연산자로 확인 후 다운 캐스팅을 하면 안전하게 가능
		Dog dog3;
		if (animal instanceof Dog) { // animal이 Dog 클래스로 만든 객체를 참조한다 true
			dog3 = (Dog) animal; // 다운 캐스팅
			dog3.sound();
		}

	}

}

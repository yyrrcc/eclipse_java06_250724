package typeChange1.person;

public class PersonMain {
	Person person = new Person();
	Student student = new Student();
	Soldier soldier = new Soldier();

	// 다형적 참조: 부모는 자식을 품을 수 있다.

	// person=student; // (가능) 자식 객체는 부모 타입 참조 변수에 대입 가능
	Person polyPerson = new Student();

	// soldier=person; // (불가능) 부모 타입 객체를 자식 타입 변수에 바로 대입할 수 없음

	// soldier=(soldier) person; // (가능) 강제 변환
	Soldier polySoldier = (Soldier) new Person();

	// soldier=student; // (불가능) 서로 다른 자식 클래스. 직접적인 상속 관계가 없음.
}

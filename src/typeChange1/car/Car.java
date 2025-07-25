package typeChange1.car;

public class Car {
	String type;
	int year;
	int price;

	// 동일한 패키지라서 Car, Tire import 안하고 사용 가능
	// 업캐스팅(부모 클래스 = new 자식 클래스)
	Tire fronttire = new ATire();
	Tire reartire = new BTire();

	Tire frontTire;
	Tire rearTire;

	// 매개변수 인자로 A객체가 들어오면 A, B객체가 들어오면 B로 출력하는 메서드
	public void tirePrint(Tire tire) {
		tire.tireName();
	}
}

package typeChange1.car;

public class TireMain {
	public static void main(String[] args) {
		Tire tire = new ATire();

		// 부모는 자식을 품음. 부모의 필드는 사용 가능
		tire.tireName = "부모 필드";

		// tire 객체는 ATire 이지만 선언타입이 Tire(부모)이기 때문에 Tire 클래스의 필드와 메서드만 사용 가능
		// tire.companyName;
	}

}

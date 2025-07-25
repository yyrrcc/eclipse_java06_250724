package typeChange1.car;

public class CarMain {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.type = "소나타";
		myCar.year = 2020;

		myCar.frontTire = new ATire();
		myCar.rearTire = new BTire();

		ATire aTire = new ATire();
		myCar.tirePrint(aTire); // A타이어
		aTire.tireName(); // 부모의 메서드 사용 가능 -> 오버라이딩 된 게 있으니 자신 거 사용
		BTire bTire = new BTire();
		myCar.tirePrint(bTire); // B타이어

		myCar.frontTire.tireName(); // A타이어
	}

}

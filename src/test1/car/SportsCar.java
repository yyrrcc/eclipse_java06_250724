package test1.car;

public class SportsCar extends Car {
	int speed;

	public SportsCar() {
		// 부모 클래스의 기본 생성자가 존재하기 때문에 super(); 생략 가능인듯?
		// super();
	}

	@Override
	public void move() {
		System.out.println("엄청 빠르게 움직입니다. 속도는 " + speed + "km/s 입니다.");
	}

}

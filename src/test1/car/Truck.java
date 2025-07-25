package test1.car;

public class Truck extends Car {
	// 변수 이름을 year로 변경하면 왜 2000 출력이 되지 않을까?
//	int oldYear = 2000;

	// 따로 변수 만들지 말고 그냥 부모 메서드 사용하기
	public Truck(int year) {
		this.year = year;
	}

	public Truck(String company, int year) {
		super(company, year);
	}

}

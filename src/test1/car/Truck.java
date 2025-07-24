package test1.car;

public class Truck extends Car {
	// 변수 이름을 year로 변경하면 왜 2000 출력이 되지 않을까?
	int oldYear = 2000;

	public Truck(int oldYear) {
		this.year = oldYear;
	}

	public Truck(String company, int year) {
		super(company, year);
	}

}

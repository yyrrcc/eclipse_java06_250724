package test1.car;

public class Car {
	String company; // 제조사
	int year; // 생산연도

	public Car() {
	}

	public Car(String company, int year) {
		this.company = company;
		this.year = year;
	}

	public void move() {
		System.out.println("움직입니다.");
	}

	public int fuel(int price) {
		return price;
	}
}

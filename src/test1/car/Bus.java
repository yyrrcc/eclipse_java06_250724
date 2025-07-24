package test1.car;

public class Bus extends Car {
	String color;

	// 기본 생성자를 굳이 만들어야 할까?
	public Bus() {
	}

	// 부모의 생성자는 '그대로' 받아야 하나봄. 물론 자기 자신 멤버변수는 추가 가능
	public Bus(String company, int year, String color) {
		super(company, year);
		this.color = color;
	}

	@Override
	public int fuel(int oil) {
		return super.fuel(oil);
	}

	public void color() {
		System.out.println("버스의 색깔은 " + this.color + "입니다.");
	}

}

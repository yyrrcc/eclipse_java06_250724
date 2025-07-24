package test1.car;

public class CarMain {
	public static void main(String[] args) {
		Car car1 = new Car("현대", 2020);
		car1.move();
		int car1fuel = car1.fuel(5000);
		System.out.println(car1fuel + "원 어치 주유 했습니다.");

		System.out.println("------------------------");

		Bus bus1 = new Bus("기아", 2023, "노랑");
		bus1.color();
		int bus1fuel = bus1.fuel(50);
		System.out.println(bus1fuel + "리터 주유하세요.");

		System.out.println("------------------------");

		SportsCar sp1 = new SportsCar();
		sp1.year = 2025;
		sp1.speed = 135;
		sp1.move();

		System.out.println("------------------------");

		Truck tru1 = new Truck(2000);
		tru1.old();
	}
}
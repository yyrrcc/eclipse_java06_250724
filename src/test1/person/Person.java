package test1.person;

public class Person {
	String name;
	int salary;
	String[] locations = { "서울", "경기" };

	public Person() {
	}

	public Person(String name) {
		this.name = name;
	}

	public Person(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public void salaryDay() {
		System.out.println(this.salary + "원, 월급이 들어왔습니다.");
	}

	public void living(String location) {
		if (location.equals(this.locations[0])) {
			System.out.println(this.name + ", 서울 시민입니다.");
		} else if (location.equals(this.locations[1])) {
			System.out.println(this.name + ", 경기 시민입니다.");
		} else {
			System.out.println(this.name + ", 수도권 시민이 아닙니다.");
		}
	}

}

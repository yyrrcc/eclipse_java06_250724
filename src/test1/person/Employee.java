package test1.person;

public class Employee extends Person {
	int bonus;

	public Employee(String name, int salary, int bonus) {
		super(name, salary);
		this.bonus = bonus;
	}

	@Override
	public void salaryDay() {
		super.salaryDay();
		System.out.println(this.bonus + "원, 상여금도 들어왔습니다.");
	}
}

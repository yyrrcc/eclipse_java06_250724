package test1.person;

public class PersonMain {

	public static void main(String[] args) {
		Student stu1 = new Student("김학생");
		stu1.living("경기");
		stu1.grade(70);

		System.out.println("------------------------");

		Employee emp1 = new Employee("김직장", 10000, 30000);
		emp1.salaryDay();

		System.out.println("------------------------");

		Solider sol1 = new Solider("김군인", 7);
		System.out.println(sol1.levelUp(3) + ", 축하합니다.");

		System.out.println("------------------------");

		Solider sol2 = new Solider("최군인");
		sol2.living("부산");
		System.out.println(sol2.levelUp(0) + ", 이제 시작입니다.");

	}

}

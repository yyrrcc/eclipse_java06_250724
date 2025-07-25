package test1.person;

public class Soldier extends Person {
	int rank = 3;

	public Soldier(String name) {
		super(name);
	}

	public Soldier(String name, int rank) {
		super(name);
		this.rank = rank;
	}

	public int levelUp(int num) {
		this.rank += num;
		return this.rank;
	}

}

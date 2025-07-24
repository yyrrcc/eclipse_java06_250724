package test1.person;

public class Solider extends Person {
	int rank = 3;

	public Solider(String name) {
		super(name);
	}

	public Solider(String name, int rank) {
		super(name);
		this.rank = rank;
	}

	public int levelUp(int num) {
		this.rank += num;
		return this.rank;
	}

}

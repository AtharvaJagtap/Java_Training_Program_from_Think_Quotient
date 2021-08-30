package Lectures;

public class Undergraduate extends Person {
	private int undergraduateNumber;
	

	public Undergraduate() {
		super();
		undergraduateNumber = 0;// Indicating no number yet
	}

	public Undergraduate(String initialName, int initialUndergraduateNumber) {
		super(initialName);
		undergraduateNumber = initialUndergraduateNumber;
	}

	public void reset(String newName, int newUndergraduateNumber) {
		setName(newName);
		undergraduateNumber = newUndergraduateNumber;
	}

	public int getUndergraduateNumber() {
		return undergraduateNumber;
	}

	public void setUndergraduateNumber(int newUndergraduateNumber) {
		undergraduateNumber = newUndergraduateNumber;
	}

	public void writeOutput() {
		System.out.println("Name: " + getName());
		System.out.println("Undergraduate Number: " + undergraduateNumber);
	}

	public boolean equals(Undergraduate otherUndergraduate) {
		return this.hasSameName(otherUndergraduate) && (this.undergraduateNumber == otherUndergraduate.undergraduateNumber);
	}
}
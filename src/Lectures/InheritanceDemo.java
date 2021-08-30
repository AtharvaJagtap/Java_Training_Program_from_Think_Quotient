package Lectures;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	Student s = new Student();
		 s.setName("Ankita");
		 s.setStudentNumber(101); 
		 s.writeOutput();
		 Undergraduate u = new Undergraduate();
		 u.setName("Atharva");
		 u.setUndergraduateNumber(102); 
		 u.writeOutput();
	
	*/

		 Person[] people = new Person[4];
		 people[0] = new Undergraduate("Cotty, Manny", 4910);
		 people[1] = new Undergraduate("Kick, Anita", 9931);
		 people[2] = new Student("DeBanque, Robin", 8812);
		 people[3] = new Undergraduate("Bugg, June", 9901);
		for (Person p : people)
		 {
		 p.writeOutput();
		 System.out.println();
		 }
	}
}

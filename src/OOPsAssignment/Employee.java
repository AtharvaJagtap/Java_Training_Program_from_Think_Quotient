package OOPsAssignment;

import java.util.Scanner;

public class Employee {
	private int id;
	private String Name;
	private int salary;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee em = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Id: ");
		int id = sc.nextInt();
		em.setId(id);
		System.out.println("Enter your name: ");
		String nm = sc.next();
		em.setName(nm);
		System.out.println("Enter your Salary: ");
		int sl = sc.nextInt();
		em.setSalary(sl);
		System.out.println("Employee Id: "+em.getId());
		System.out.println("Employee Name: "+em.getName());
		System.out.println("Employee Salary "+em.getSalary());
	}

}

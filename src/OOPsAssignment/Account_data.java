package OOPsAssignment;

import java.util.Scanner;

public class Account_data {
	public String name;
	public int id;
	public double bl;
	
	
	
	public void insert() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		 name = sc.next();
		System.out.println("Enter the Account no.:");
		 id = sc.nextInt();
		System.out.println("Enter the Balance: ");
		 bl = sc.nextInt();
	}
	 public void display() {
		 System.out.println("Account no."+id);
		 System.out.println("Account User name "+name);
		 System.out.println("Account Balance "+bl);
	 }
	public void deposit(int dp) {
		System.out.println("Account no."+id);
		bl =  (bl + dp);
		System.out.println("Balance now:"+bl);
	}
	public void withdraw(int wd) {
		System.out.println("Account no."+id);
		bl =  (bl - wd);
		System.out.println("Balance now:"+bl);	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account_data se = new Account_data();
		Scanner sc =new Scanner(System.in);
		
		se.insert();
		se.display();
		System.out.println("Enter the deposit:");
		int dp = sc.nextInt();
		se.deposit(dp);
		System.out.println("Enter the Withdraw amount:");
		int wd = sc.nextInt();
		se.withdraw(wd);
	}

}

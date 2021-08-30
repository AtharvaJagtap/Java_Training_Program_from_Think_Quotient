package OOPsAssignment;


import java.util.Scanner;


public class Account_with_member_Variable {
	public long Account_No;
	public String Customer_Name;
	
	public void DDemo() {
		Account_No =101;
		Customer_Name ="Ankita";
		System.out.println("Account no." + Account_No + " Account Name " + Customer_Name);
		System.out.println("I'm default constructor");
	}
	
	public void PPram(int An,String Cn) {
		Account_No = An;
		Customer_Name = Cn;
		System.out.println("Enter the Account name" + Account_No + " and Account no." + Customer_Name);
		System.out.println("I'm parameterized constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account_with_member_Variable ac =new Account_with_member_Variable();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account no. : ");
		int An = sc.nextInt();
		System.out.println("Enter the Account Name: ");
		String Cn = sc.next();
		ac.PPram(An, Cn);
		ac.DDemo();
	}

}

  package ConditionalAssignment;

import java.util.Scanner;
public class Max_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nt = new Scanner(System.in);
		System.out.println("Enter the two number :");
		int a = nt.nextInt();
		int b = nt.nextInt();
		
		switch(a/b)
		{
		case 1: System.out.println("First number is greater : " +a);
				break;
		default: System.out.println("Second number is greater : " +b);	
	 }
		
	}
}

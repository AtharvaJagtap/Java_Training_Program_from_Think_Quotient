package SwitchAssignment;
import java.util.Scanner;
public class Even_or_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();		
		switch(num%2) {
		case 0: System.out.println("Even number");
			   break;
		default: System.out.println("Odd number");
		}

	}

}

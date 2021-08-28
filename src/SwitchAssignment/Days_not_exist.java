package SwitchAssignment;
import java.util.Scanner;
public class Days_not_exist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to see if it exist or not : ");
		int a = sc.nextInt();
		switch(a) {
		case 1,2,3,4,5,6,7: System.out.println("day exist");
								break;
		default : System.out.println("error, day does not exist");
		}


	}

}

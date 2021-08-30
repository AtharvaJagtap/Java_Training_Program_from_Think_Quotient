package ConditionalAssignment;
import java.util.Scanner;
public class Divisible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		if((n%5==0)&&(n%11==0)) 
			System.out.println("Yes Divisible by both 5 and 11 ");
		else
			System.out.println("No it's not divisible by 5 and 11 ");
	}

}

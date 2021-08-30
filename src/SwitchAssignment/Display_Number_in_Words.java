package SwitchAssignment;
import java.util.Scanner;
public class Display_Number_in_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number between 1 to 5: ");
		  int ch = sc.nextInt();
		  switch(ch) {
		  case 1: System.out.println("One");
		  			break;
		  case 2: System.out.println("Two");
		  			break;
		  case 3: System.out.println("Three");
		  			break;
		  case 4: System.out.println("Four");
		  			break;
		  case 5: System.out.println("Five");
		  			break;
		  default: break;
		  }

	}

}

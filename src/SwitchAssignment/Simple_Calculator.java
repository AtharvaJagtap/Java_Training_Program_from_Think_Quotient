package SwitchAssignment;
import java.util.Scanner;
public class Simple_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers: ");
	    int a = sc.nextInt(),b =sc.nextInt();
	    System.out.print("Enter the opeartion : ");
	    String ch = sc.next();
	    switch(ch) {
	    case "add": System.out.println("a + b = " + (a+b));
	    			break;
	    case "substract ": System.out.println("a - b = " + (a-b));
	    					break;
	    case "mul" , "multiple": System.out.println("a * b = " + (a*b));
	    						break;
	    case "divide": System.out.println("a/b = "+ (a/b));
	    				break;
	    case "modulus" , "mode": System.out.println("a%b = "+ (a%b));
	    					break;
	    default: break;
	    }

	}

}

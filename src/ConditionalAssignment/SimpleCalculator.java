package ConditionalAssignment;
import java.util.Scanner;
public class SimpleCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter the 1 to 5 number : ");
		int z = sc.nextInt();
		if(z == 1) {
			System.out.println("Add two no.s: " +Math.addExact(a,b));
		}
		else if(z == 2) {
			System.out.println("Substract two no.s: " +Math.subtractExact(a, b));
		}
		else if(z == 3) {
			System.out.println("Multiply two number: "+Math.multiplyExact(a, b));
		}
		else if(z == 4) {
			System.out.println("Divide two number: "+Math.floorDiv(a, b));
		}
		else if(z == 5) {
			System.out.println("Modulus of two no.s: "+Math.floorMod(a, b));
		}
		else {
			System.out.println("No operation: ");
		}
			
	  
	}
}

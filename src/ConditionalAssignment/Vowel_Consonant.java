package ConditionalAssignment;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Letter: ");
		String n = sc.next();
		if((n == "a") || (n == "e") || (n == "i") || (n == "o") || (n == "u") || (n == "A") || (n == "E") || (n == "I") || (n == "O") || (n == "U")) {
			System.out.println("It's a Vowel");
		}
		else if ((n.equals("z")) || (n.equals("t")) || (n =="g") || (n == "b") || (n == "h") || (n == "Z") || (n == "B") || (n == "T") || (n == "G") || (n == "H")){
		 System.out.println("It's a Consonant");	
		}
		else {
			System.out.println("NAh");
		}

	}

}

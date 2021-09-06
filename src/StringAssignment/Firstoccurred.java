package StringAssignment;
import java.util.Scanner;
public class Firstoccurred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String str = sc.nextLine();
		System.out.println("Enter the word of which you want to find the first occurence: ");
		String st = sc.next();
		System.out.println();
		System.out.println(str.indexOf(st));
	}

}

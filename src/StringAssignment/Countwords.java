package StringAssignment;
import java.util.Scanner;
import java.io.*;
public class Countwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence or word without expressions:");
		String str = sc.nextLine();
		String s = str.replaceAll("\\s", "");
		String st = new String(s);
		if (!st.matches("[a-zA-Z]+$")){
			System.out.println("No, not a word or sentence without experssions");
		}
		else {
		int a = s.length();
		System.out.println("Number words in a String :-");
		System.out.println(a);
		}
	}

}

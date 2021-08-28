package SwitchAssignment;
import java.util.Scanner;
public class Vowels_or_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the char: ");
		String ch = sc.next();
		switch(ch) {
		case "A" , "a": System.out.println("It's a vowel");
					break;
		case "E" , "e": System.out.println("It's a vowel");
					break;
		case "I" , "i": System.out.println("It's a vowel");
					break;
		case "O" , "o": System.out.println("It's a vowel");
					break;
		case "U" , "u": System.out.println("It's a vowel");
					break;
		case "Z" , "z": System.out.println("It's a consonants");
					break;
		case "B" , "b": System.out.println("It's a consonant");
					break;
		case "T" , "t": System.out.println("It's a consonant");
					break;
		case "G" , "g": System.out.println("It's a consonant");
					break;
		case "H" , "h": System.out.println("It's a consonant");
					break;
		}
	}

}

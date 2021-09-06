package StringAssignment;
import java.util.Scanner;
public class Stringfunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String a = "String";
		System.out.println("Length of String input: "+a.length());
		int s = a.length();
		for(int i=1;i<=s;i++) {
			System.out.println(a.charAt(s-i));
		}
		String d = String.format("Roll no. is %d",21); 
		String c = String.format("Name is %s", "Atharva");
		String m = String.format("Marks is %f", 24.0);
		System.out.println(d+","+c+","+m);
		
		String w = " Pull";
		System.out.println(a.compareTo(w));
		System.out.println(w.concat(a));
		System.out.println(w.contentEquals(c));
		System.out.println(a.hashCode());
		System.out.println(a.repeat(s));
		System.out.println(a.split("/"));
	}

}

package StringAssignment;

public class firstOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="Atharva";
		char a = 'r';
		int b = s.length();
		int i;
		for( i=0;i<=b;i++) {
			if(s.charAt(i)==a) {
				break;
			}
		}
		System.out.println("Inder no. of String: "+i);
	}

}

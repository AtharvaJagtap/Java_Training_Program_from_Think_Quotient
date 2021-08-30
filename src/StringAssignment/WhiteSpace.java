package StringAssignment;

public class WhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Say Something atleast";
		/*
		 * int x = s.length(); char m = 0; for(int i=0;i<=x-1;i++) { if(s.charAt(i)=='
		 * ') { m = s.charAt(i+1); } else { m =s.charAt(i); } } System.out.println(m);
		 */
		String str = s.replaceAll("\\s", "");
		System.out.println(str);
	}

}

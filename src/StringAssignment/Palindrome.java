package StringAssignment;

public class Palindrome {
	public static boolean isPalindrome(String str) {
		StringBuilder st = new StringBuilder(str);
		st.reverse();
		String sb = st.toString();
		if(str.equals(sb)) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(Palindrome.isPalindrome("saas"));
	System.out.println(Palindrome.isPalindrome("css"));
	}

}

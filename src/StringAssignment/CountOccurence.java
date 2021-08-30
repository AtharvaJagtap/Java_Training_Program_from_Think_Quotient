package StringAssignment;

public class CountOccurence {

	public static void main(String[] args) {
		String x = "Atharva";
		char y ='a';
		int count =0; 
		int size = x.length();
		for(int i=0;i<=size-1;i++) {
			if(x.charAt(i) == y){
				count++;
				
			}
		}
		System.out.println("Count number: "+count);
		
	}
}

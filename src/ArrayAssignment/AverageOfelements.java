package ArrayAssignment;
import java.util.*;
public class AverageOfelements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n =sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers:");
		
		for(int i=0;i<n;i++) {
			arr[i] =sc.nextInt();
		}
		
		int sum=0;
		System.out.println("Average of all the numbers: ");
		for(int j=0;j<n;j++) {
			 sum = sum + arr[j];
		}
		sum = sum/n;
		System.out.println(sum);
		
	}

}

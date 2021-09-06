package ArrayAssignment;
import java.util.*;
public class IteratingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = sc.nextInt();
		System.out.println("Enter the numbers for array: ");
		int[] arr = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Iterating the array: ");
		int[] brr = new int[n];
		for(int i=0;i<arr.length;i++) {
			brr[i] = arr[i];
			System.out.println(brr[i]);
		}
		
	}

}

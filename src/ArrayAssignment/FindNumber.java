package ArrayAssignment;
import java.util.*;
public class FindNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the number you want to find: ");
		int x =sc.nextInt();
		int count=0;
		for(int j=0;j<n;j++) {
		if(arr[j]==x) {
			System.out.println("The index of the number "+x+"is"+(j+1));
			break;
		}
		
		}
		
	}

}

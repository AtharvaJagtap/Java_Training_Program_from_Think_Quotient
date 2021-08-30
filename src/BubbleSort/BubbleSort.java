package BubbleSort;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	
	       System.out.println("hellos........");
	       System.out.println("hii....new22 branch");
	      
	       System.out.println("Hi");
	        int arr[] = {8,3,2,9,7,6,11,10,1,12};
	        System.out.println("Sorted array");
			 int n = arr.length;
		        for (int i = 0; i < n-1; i++)
		            for (int j = 0; j < n-i-1; j++)
		                if (arr[j] > arr[j+1])
		                {
		                    // swap arr[j+1] and arr[j]
		                    int temp = arr[j];
		                    arr[j] = arr[j+1];
		                    arr[j+1] = temp;
		                    }
	
		        int a = arr.length;
		        for (int i=0; i<a; ++i)
		            System.out.print(arr[i] + " ");
		        System.out.println();
	}
}

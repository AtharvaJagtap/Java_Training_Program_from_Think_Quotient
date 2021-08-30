package SelectionSort;

public class selectionSort {

	public static void ArraySorter(int[] Arr)
	{
	for(int i=0;i<Arr.length-1;i++) {
		int IndexOfSmaillestNumber =  getSmallestIndex(i,Arr);
		interchange(i,IndexOfSmaillestNumber,Arr);
	}
	}
	public static int getSmallestIndex(int startindex, int[] a) {
		int min = a[startindex];
		int indexOfMin = startindex;
		int smallestIndex = startindex;
		for(int j=startindex+1;j<a.length;j++) {
			if(a[j]<min) {
				min = a[j];
				indexOfMin = j;
			}
			
		}
		return indexOfMin;
	}
	public static void interchange(int x,int y,int[] a) {
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	public static void main(String[] args) {
	int[] b = {8,3,2,9,7,6,11,10,1,12};
	selectionSort sc = new selectionSort();
	display(b,"before");
	sc.ArraySorter(b);
	display(b,"after");
	}
	private static void display(int[] b, String when) {
		// TODO Auto-generated method stub
		System.out.println("Array values " + when + "sorting:");
		for(int z =0;z< b.length;z++) {
			System.out.print(b[z]+" ");
			System.out.println();
			
		}
	}

}

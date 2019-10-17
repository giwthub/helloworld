package study.java.recursiveMethod;

public class RecursiveBinarySearch {

	public static int recursiveBinarySearch(int[] list, int key) {
		
		int low = 0;
		
		int high = list.length - 1;
		return recursiveBinarySearch(list, key, low, high );
		
	}

	private static int recursiveBinarySearch(int[] list, int key, int low, int high) {
		// TODO Auto-generated method stub
		
		if(low > high)
			return -low-1;
		int mid = (low + high)/2;
		if(key <list[mid]) {
			return recursiveBinarySearch(list, key,low,mid - 1);
			
		}
		else if(key > list[mid])
			return recursiveBinarySearch(list, key, mid + 1, high);
		else if(key == list[mid])
			return mid;
		
		
		return 0;
	}
	
	public static void main(String[] args) throws Exception {
		int[] arr = {
				2,14,6,7,4,25,7,8
		};
		System.out.println("key = 25 = arr[" + recursiveBinarySearch(arr, 25) + "]");
	}
	
	
}

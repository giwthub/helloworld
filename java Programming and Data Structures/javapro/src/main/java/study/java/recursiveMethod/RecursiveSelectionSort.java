package study.java.recursiveMethod;

import java.util.Arrays;

public class RecursiveSelectionSort {

	public static void sort(double[] list) {
		
		sort(list,0,list.length - 1);
	}
	
	private static void sort(double[] list,int low,int high) {
		
		//Find the smallest number and its index in list[low...high]
	
			if (low < high) {
				int indexOfMin = low;
				double min = list[low];
				for (int i = 0; i < list.length; i++) {
					if (list[i] < min) {
						min = list[i];
						indexOfMin = i;
					}
				}
				
				//Swap the smallest in list[low ... high] with list[low]
				list[indexOfMin] = list[low];
				list[low] = min;
				
				System.out.println("array is " + Arrays.toString(list));
				
				//sort the remaining list[low ... high]
				sort(list,low + 1,high);
			}
		
			
			
		
		
	}
	
	public static void main(String[] args) throws Exception {
		double[] arr = {
				432.24,134.25,645,253.56};

		System.out.println(Arrays.toString(arr));
		sort(arr);
		
		
	};
	
	

	
}

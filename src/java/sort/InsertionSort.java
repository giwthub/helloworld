package sort;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSort(int[] list) {
		for(int i = 1; i < list.length;i++) {
			int currentElement = list[i];
			int k;
			for(k = i-1;k >=0 && list[k] > currentElement;k--) {
				list[k+1] = list[k];
			}
			list[k+1] = currentElement;
		}
		return list;
	}
	public static void main(String[] args) throws Exception {
		int[] arr = {32,56,43,12,678,3};
		
		System.out.println(Arrays.toString(insertionSort(arr)));
	}
}

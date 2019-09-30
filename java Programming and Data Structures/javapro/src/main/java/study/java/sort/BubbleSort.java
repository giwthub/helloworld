package sort;

import java.util.Arrays;

public class BubbleSort{
	public static void main(String[] args){
		int[] arr = {32,125,357,85,99};
		
		System.out.println(Arrays.toString(new BubbleSort().sort(arr)));
	}
	public int[] sort(int[] arr){
		int temp = 0;
		for(int i = 0; i < arr.length; i++){
			for(int j = i+1; j < arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
}
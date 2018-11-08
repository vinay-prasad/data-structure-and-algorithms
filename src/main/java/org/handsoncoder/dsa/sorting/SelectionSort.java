package org.handsoncoder.dsa.sorting;

import java.util.Arrays;

public class SelectionSort {

	public static int[] quickSort(int[] array) {
		int size = array.length;
		for (int outer = 0; outer <size; outer ++) {
			int iMin = outer;
			for (int inner = outer+1; inner < size; inner++) {
				if (array[inner] < array[iMin]) {
					iMin = inner;
				}				
			}
			int temp = array[outer];
			array[outer] = array[iMin];
			array[iMin] = temp;
		}
		return array;
	}


	public static void main(String[] args) {
		int[] input = new int[] { 7, 5, 9, 3, 11, 2, 1 };
		System.out.println("Array to be sorted - " + Arrays.toString(input));
		int[] output = quickSort(input);
		System.out.println("Sorted array 1 - " + Arrays.toString(output));
	}
}

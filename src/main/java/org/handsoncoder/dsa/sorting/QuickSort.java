package org.handsoncoder.dsa.sorting;

import java.util.Arrays;

public class QuickSort {

	public static int[] quickSort(int[] array) {
		quickSort(array, 0, (array.length - 1));
		return array;
	}

	private static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pIndex = partition(array, start, end);
			quickSort(array, start, (pIndex - 1));
			quickSort(array, (pIndex + 1), end);
		}
	}

	private static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if (array[i] <= pivot) {
				int temp = array[pIndex];
				array[pIndex] = array[i];
				array[i] = temp;
				pIndex++;
			}
		}
		int temp = array[pIndex];
		array[pIndex] = array[end];
		array[end] = temp;
		return pIndex;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 7, 5, 9, 3, 11, 2, 1 };
		System.out.println("Array to be sorted - " + Arrays.toString(input));
		int[] output = quickSort(input);
		System.out.println("Sorted array 1 - " + Arrays.toString(output));
	}
}

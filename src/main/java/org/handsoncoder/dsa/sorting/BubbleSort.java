package org.handsoncoder.dsa.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static int[] bubbleSort(int[] array) {
		int size = array.length;
		boolean flag = false;
		for (int outer = 0; outer < size; outer++) {
			for (int inner = 0; inner < (size - outer - 1); inner++) {
				if (array[inner] > array[inner+1]) {
					int temp = array[inner];
					array[inner] = array[inner+1];
					array[inner+1] = temp;
					flag = true;
				}
			}
			if (!flag) {
				break;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 7, 5, 9, 3, 11, 2, 1 };
		System.out.println("Array to be sorted - " + Arrays.toString(input));
		int[] output = bubbleSort(input);
		System.out.println("Sorted array 1 - " + Arrays.toString(output));
	}
}

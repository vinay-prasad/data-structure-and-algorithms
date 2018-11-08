package org.handsoncoder.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static int[] insertionSort1(int[] array) {
		int size = array.length;
		for (int o = 1; o < size; o++) {
			int i;
			int temp;

			for (i = (o - 1); i >= 0 && array[i + 1] < array[i]; i--) {
				// swap
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
			}
		}

		return array;
	}

	public static int[] insertionSort2(int[] array) {
		int size = array.length;
		for (int o = 1; o < size; o++) {
			int i = (o - 1);
			int temp;

			while (i >= 0 && array[i + 1] < array[i]) {
				// swap
				temp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = temp;
				i--;
			}
		}

		return array;
	}

	public static void main(String[] args) {
		int[] input = new int[] { 7, 5, 9, 3, 11, 2, 1 };
		System.out.println("Array to be sorted - " + Arrays.toString(input));
		int[] output = insertionSort1(input);
		System.out.println("Sorted array 1 - " + Arrays.toString(output));
		input = new int[] { 7, 5, 9, 3, 11, 2, 1 };
		output = insertionSort2(input);
		System.out.println("Sorted array 2 - " + Arrays.toString(output));
	}
}

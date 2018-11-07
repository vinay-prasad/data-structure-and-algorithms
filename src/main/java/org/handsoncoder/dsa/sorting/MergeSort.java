package org.handsoncoder.dsa.sorting;

import java.util.Arrays;

public class MergeSort {

	public static int[] mergeSort(int[] array) {
		int sizeOfArray = array.length;
		if (sizeOfArray < 2)
			return array;
		int mid = sizeOfArray / 2;

		int[] lArray = new int[mid];
		int[] rArray = new int[sizeOfArray - mid];

		for (int l = 0; l < mid; l++) {
			lArray[l] = array[l];
		}
		for (int r = 0; r < (sizeOfArray - mid); r++) {
			rArray[r] = array[r+mid];
		}

		mergeSort(lArray);
		mergeSort(rArray);
		merge(lArray, rArray, array);

		return array;
	}

	private static void merge(int[] lArray, int[] rArray, int[] array) {

		int sizeOfLarray = lArray.length;
		int sizeOfRarray = rArray.length;
		int l, r, a;
		l = r = a = 0;
		while (l < sizeOfLarray && r < sizeOfRarray) {
			if (lArray[l] <= rArray[r]) {
				array[a] = lArray[l];
				l++;
			} else {
				array[a] = rArray[r];
				r++;
			}
			a++;
		}

		while (l < sizeOfLarray) {
			array[a] = lArray[l];
			l++;
			a++;
		}
		while (r < sizeOfRarray) {
			array[a] = rArray[r];
			r++;
			a++;
		}
	}

	public static void main(String[] args) {
		int[] input = new int[] { 7, 5, 9, 3, 11, 2, 1 };
		System.out.println("Array to be sorted - " + Arrays.toString(input));
		int[] output = mergeSort(input);
		System.out.println("Sorted array 1 - " + Arrays.toString(output));
	}
}

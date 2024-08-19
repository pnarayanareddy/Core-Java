package main.java.com.pnr.core;

import java.util.Arrays;
import java.util.Collections;

public class MaxArray {
	public static void main(String[] args) {

		// Initialize array
		Integer arr[] = { 25, 11, 7, 7500, 56, 789, 0, 6798 };
		// Initialize max with first element of array.
		int max = arr[0];
		// Loop through the array
		System.out.println(max);
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			// Compare elements of array with max
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Largest element present in given array: " + max);

		Arrays.sort(arr, Collections.reverseOrder());
		for (int i : arr) {
			System.out.println("Largest element present in given array: " + i);
		}

		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println("Largest element present in given array: " + i);
		}
	}
}
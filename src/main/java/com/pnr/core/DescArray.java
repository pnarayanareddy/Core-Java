package main.java.com.pnr.core;

public class DescArray {
	public static void main(String[] args) {

		// Initialize array
		int arr[] = { 25, 11, 7, 75, 56 };
		int temp = 0;
		// Initialize max with first element of array.
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

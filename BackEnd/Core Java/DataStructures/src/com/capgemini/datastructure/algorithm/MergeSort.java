package com.capgemini.datastructure.algorithm;

import java.time.Duration;
import java.time.Instant;

public class MergeSort {

	void merge(int arr[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;

		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void sort(int arr[], int l, int r) {
		if (l < r) {
			int m = (l + r) / 2;

			sort(arr, l, m);
			sort(arr, m + 1, r);

			merge(arr, l, m, r);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String args[]) {
		System.out.println("Given Array");

		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 100, 45, 74, 84, 54, 42, 84, 8845, 247, 521, 41, 4, 411554, 746130, 4,
				42, 5125, 471 };
		
		Instant start = Instant.now();

		MergeSort ob = new MergeSort();
		ob.sort(arr, 0, arr.length - 1);
		System.out.println("\nSorted array");
		printArray(arr);

		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double second = duration / 1000.0;
		System.out.println("Duration is " + second);

	}
}

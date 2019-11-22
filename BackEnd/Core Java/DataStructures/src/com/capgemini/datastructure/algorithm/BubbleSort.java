package com.capgemini.datastructure.algorithm;

import java.time.Duration;
import java.time.Instant;

public class BubbleSort {
	public static void main(String args[]) {
		BubbleSort ob = new BubbleSort();
		
		int arr[] = { 64, 34, 25, 12, 22, 11, 90, 100, 45, 74, 84, 54, 42, 84, 8845, 247, 521, 41, 4, 411554, 746130, 4,
				42, 5125, 471 };
		
		Instant start = Instant.now();
		ob.bubbleSort(arr);
		System.out.println("Sorted array");
		ob.printArray(arr);
		Instant end = Instant.now();
		
		long duration = Duration.between(start, end).toMillis();
		double second = duration / 1000.0;
		System.out.println("Duration is " + second);

	}

	void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

	void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}

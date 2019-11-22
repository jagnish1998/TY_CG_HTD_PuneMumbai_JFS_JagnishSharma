package com.capgemini.datastructure.algorithm;

import java.time.Duration;
import java.time.Instant;

public class AlogoAnalysis {
	public static void main(String[] args) {
		// long number = 99999999L;
		countingDuration2();
		countingDuration1();
		// System.out.println(addUpto(number));
		// System.out.println(addUptoQuick(number));
	}

	public static long addUpto(long number) {
		long total = 0L;
		for (long i = 0; i <= number; i++) {
			total = total + i;
		}
		return total;
	}

	public static long addUptoQuick(long number) {

		return number * (number + 1) / 2;
	}

	public static void countingDuration1() {
		long number = 9999L;
		Instant start = Instant.now();
		System.out.println("add Upto  " + addUpto(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double second = duration / 1000.0;
		System.out.println("Duration is " + second);
	}

	public static void countingDuration2() {
		long number = 9999L;
		Instant start = Instant.now();
		System.out.println("add UptoQuick   " + addUptoQuick(number));
		Instant end = Instant.now();
		long duration = Duration.between(start, end).toMillis();
		double second = duration / 1000.0;
		System.out.println("Duration is " + second);
	}
}

package com.capagemini.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMyStudent {
	private static final Scanner scan = new Scanner(System.in);
	static ArrayList<MyStudent> a1 = new ArrayList<MyStudent>();

	static void addStudent() {
		System.out.println("Enter Name of Student");
		scan.next();
		String name = scan.nextLine();
		System.out.println("Enter Id of student");
		int id = scan.nextInt();
		System.out.println("Enter Percentage of Student");
		double percentage = scan.nextDouble();

		MyStudent m1 = new MyStudent(id, name, percentage);
		a1.add(m1);
	}

	static void displayStudent() {
		for (MyStudent myStudent : a1) {
			MyStudent m = myStudent;
			System.out.println("Name is " + m.name);
			System.out.println("Id is " + m.id);
			System.out.println("Percentage is " + m.percenage);
			System.out.println("----------------------------------------------------");
		}
	}

	public static void main(String[] args) {

		while (true)
		{
			System.out.println("Enter  1 to Add \n   2 to Display \n 3 to exit ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				addStudent();
				break;

			case 2:
				displayStudent();
				break;

			case 3:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid Option");

			}
		}
	}
}
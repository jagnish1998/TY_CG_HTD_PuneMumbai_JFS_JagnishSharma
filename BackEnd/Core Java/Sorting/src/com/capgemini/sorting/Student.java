package com.capgemini.sorting;

public class Student implements Comparable<Student> {
	int id;
	String name;
	double percentage;

	public Student(int id, String name, double percentage) {
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}
// Logic to Sort By ID
		/*
		 * public int compareTo(Student o) { if(this.id > o.id) { return 1; } else
		 * if(this.id < o.id) { return -1; } else { return 0; } }
		 */
// Logic to Sort Student ON bases of Percentage

		/*
		 * public int compareTo(Student o) { if(this.percentage > o.percentage) { return
		 * 1; } else if(this.percentage < o.percentage) { return -1; } else { return 0;
		 * } }
		 */

// Logic to sort using String

		/*
		 * public int compareTo(Student o) { String s1 = this.name; String s2 = o.name;
		 * int rs = s1.compareTo(s2); return rs; }
		 */

	
// Logic for sort in decending Order
		
		/*
		 * public int compareTo(Student o) { return this.name.compareTo(o.name)*-1; }
		 */
	//logic for sort by Boxing using Percentage
	
	public int compareTo(Student o)
	{
		Double k = this.percentage;
		Double t = o.percentage;
		return k.compareTo(t);
	}
		
	
}

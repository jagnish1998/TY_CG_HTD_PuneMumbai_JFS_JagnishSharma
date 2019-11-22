package com.capgemini.treeSet;

import java.util.Comparator;

public class ByPercentage implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		Double i = o1.getPercentage();
		Double j = o2.getPercentage();
		return i.compareTo(j);
	}

}

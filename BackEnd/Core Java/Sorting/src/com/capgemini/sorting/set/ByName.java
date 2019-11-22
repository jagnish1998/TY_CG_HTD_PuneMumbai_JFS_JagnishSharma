package com.capgemini.sorting.set;

import java.util.Comparator;

public class ByName implements Comparator<Bank>
{

	@Override
	public int compare(Bank o1, Bank o2)
	{
		String s1 = o1.name;
		String s2 = o2.name;
		return s1.compareTo(s2);
	}

}

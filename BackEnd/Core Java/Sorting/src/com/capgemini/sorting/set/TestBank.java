package com.capgemini.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestBank
{
public static void main(String[] args) 
{
	ByPin bp = new ByPin();
	ByName bn  = new ByName();
	ByMicr bm = new ByMicr();
	
	TreeSet<Bank> ts = new TreeSet<Bank>(bm);
	Bank b1  = new Bank(567677,"SBI",223344l);
	Bank b2  = new Bank(453267,"HDFC",445566l);
	Bank b3  = new Bank(123456,"Axis",112233l);
	Bank b4  = new Bank(657432,"ICICI",332211l);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	
	Iterator<Bank> b = ts.iterator();
	while(b.hasNext())
	{
		Bank d = b.next();
		System.out.println("Pin is"+d.pin);
		System.out.println("Name is"+d.name);
		System.out.println("MICR is"+d.micr);
		System.out.println("-------------------------------------------");
	}
	
	
	
}
}

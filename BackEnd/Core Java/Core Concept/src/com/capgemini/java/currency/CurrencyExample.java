package com.capgemini.java.currency;

import java.util.Currency;
import java.util.Set;

public class CurrencyExample 
{
	public static void main(String[] args) 
	{
		Currency code1  = Currency.getInstance("INR");
		Currency code2 = Currency.getInstance("USD");

		String c = code1.getSymbol();
		String d = code2.getSymbol();

		System.out.println("Symbol for INR:"+c);
		System.out.println("Symbol for USD:"+d);
		System.out.println("**************************************************");

		System.out.println("Dispaly name for INR :"+code1.getDisplayName());
		System.out.println("Dispaly name for USD :"+code2.getDisplayName());
		System.out.println("**************************************************");

		Set<Currency> s1 = Currency.getAvailableCurrencies();
		System.out.println(s1);
		System.out.println("**************************************************");

		int e = code1.getDefaultFractionDigits();
		int f  = code2.getDefaultFractionDigits();
		System.out.println("Fraction Digit for INR :"+e);
		System.out.println("Fraction Digti for USD :"+f);
	}
}

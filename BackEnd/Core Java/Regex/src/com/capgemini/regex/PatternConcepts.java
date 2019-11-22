package com.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternConcepts {
	static Pattern pattern;
	static Matcher matcher;

	public static void main(String[] args) { // Single Digit
		pattern = Pattern.compile("\\d");
		matcher = pattern.matcher("1");
		System.out.println("pattern \\d: " + matcher.matches());
		// n no. of digit
		pattern = Pattern.compile("\\d+");
		matcher = pattern.matcher("1234567890");
		System.out.println("pattern \\d+: " + matcher.matches());
		// for specific no. of digit
		pattern = Pattern.compile("\\d{10}");
		matcher = pattern.matcher("1234567890");
		System.out.println("pattern \\d{10}: " + matcher.matches());

		// for Null digit
		pattern = Pattern.compile("\\d{0}");
		matcher = pattern.matcher("");
		System.out.println("pattern \\d{0}: " + matcher.matches());

		// for Maximum And Minimum
		pattern = Pattern.compile("\\d{1,9}");
		matcher = pattern.matcher("1524");
		System.out.println("pattern \\d{1,9}: " + matcher.matches());

		// Not for Digit we Use D
		pattern = Pattern.compile("\\D");
		matcher = pattern.matcher("7");
		System.out.println("pattern \\D: " + matcher.matches());

		// Not for Digit and MultiCharacter
		pattern = Pattern.compile("\\D+");
		matcher = pattern.matcher("7585");
		System.out.println("pattern \\D+: " + matcher.matches());

		// for Spaces
		pattern = Pattern.compile("\\s");
		matcher = pattern.matcher(" ");
		System.out.println("pattern \\s: " + matcher.matches());

		// for Spaces multivalue
		pattern = Pattern.compile("\\s+");
		matcher = pattern.matcher("   ");
		System.out.println("pattern \\s: " + matcher.matches());

		// Not for Spaces
		pattern = Pattern.compile("\\S++");
		matcher = pattern.matcher("AA");
		System.out.println("pattern \\S: " + matcher.matches());

		// Not for Spaces multivalue
		pattern = Pattern.compile("\\S");
		matcher = pattern.matcher("A");
		System.out.println("pattern \\S: " + matcher.matches());

	}
}

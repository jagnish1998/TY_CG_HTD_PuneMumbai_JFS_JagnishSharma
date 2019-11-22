package com.capgemini.exceptionhandling.first;

import java.io.File;
import java.io.IOException;

public class TestF {
public static void main(String[] args) {
	System.out.println("Main Started");
	File f1 = new File("jagnish.txt");
	try {
		f1.createNewFile();
		System.out.println("File Created");
	}
	catch (IOException e)
	{
		System.out.println("Sorry not able to create");
	}
}
}

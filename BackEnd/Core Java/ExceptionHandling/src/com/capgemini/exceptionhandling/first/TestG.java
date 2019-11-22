package com.capgemini.exceptionhandling.first;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class TestG 
{
	void bottle() throws IOException, ClassNotFoundException , SQLException
	{
	File f = new File("hello.txt");
	f.createNewFile();
	
	Class.forName("com.capgemini.exceptionhandling.first.TestG");
}
}

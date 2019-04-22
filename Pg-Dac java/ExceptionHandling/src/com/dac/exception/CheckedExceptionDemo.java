package com.dac.exception;

import java.io.File;
import java.io.FileReader;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try
		{
			File file = new File("somefile.txt");
			FileReader fileReader = new FileReader(file);
			int read = fileReader.read();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("End of the program");
	}
}

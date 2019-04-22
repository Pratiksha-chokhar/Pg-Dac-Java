package com.dac.javaio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterBasedDemo {
	public static void main(String[] args) {
		write();
		read();
		System.out.println("\nEnd of the program");
	}
	
	public static void write(){
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("G:\\Java Operations\\chardemo.txt");
			fileWriter.write("Good Evening");
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void read(){
		FileReader fileReader = null;
		try {
			fileReader = new FileReader("G:\\Java Operations\\chardemo.txt");
			System.out.println("File Content is ::");
			int i;
			while(   ( i = fileReader.read()) != -1 ){
				char ch = (char) i;
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
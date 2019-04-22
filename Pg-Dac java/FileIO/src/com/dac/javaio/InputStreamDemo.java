package com.dac.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamDemo {
	
	public static void main(String[] args) {
		fileWrite();
		fileRead();
		System.out.println("End of the program");
	}
	
	public static void fileWrite(){
		FileOutputStream fos = null; 
		try {
			fos = new FileOutputStream("G:\\Java Operations\\streamdemo.txt");
			//file is created
			//file handler is opened
			String content = "Hello Java !";
			byte[] buffer = content.getBytes();
			fos.write(buffer);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void fileRead(){
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("G:\\Java Operations\\streamdemo.txt");
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			String content = new String(buffer);
			System.out.println("File content is :: "+content);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}

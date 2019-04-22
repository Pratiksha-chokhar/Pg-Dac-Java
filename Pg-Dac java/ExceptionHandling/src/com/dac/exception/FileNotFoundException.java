package com.dac.exception;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException {

	public static void main(String[] args) throws IOException {
		File file = new File("G:\\Core Java\\Notes\\exception handling.bacd");
		FileInputStream fis;
		/*try {
			fis = new FileInputStream(file);
			byte[] buffer = new byte[1024];
			fis.read(buffer);
			String fileContent = String.valueOf(buffer);
			System.out.println(fileContent);
		} catch (java.io.FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("File is not found"); 
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		
		fis = new FileInputStream(file);
		byte[] buffer = new byte[1024];
		fis.read(buffer);
		String fileContent = String.valueOf(buffer);
		System.out.println(fileContent);
		
		System.out.println("Do some other stuff here");
		System.out.println("End of the program");
		
	}
}

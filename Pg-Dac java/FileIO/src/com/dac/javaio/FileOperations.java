package com.dac.javaio;

import java.io.File;
import java.io.IOException;

public class FileOperations {
	
	
	public static void main(String[] args) throws IOException {
		
		File parentDir = new File("G:\\Java Operations");
		//Path  \\, Linux /, Mac .
		File dir = new File(parentDir,"code");
		dir.mkdir();
		
		System.out.println( "Dir isFile ?  :: "+dir.isFile() );
		System.out.println( "Dir isDirectory ? :: "+dir.isDirectory() );
		
		File file = new File(dir, "test.txt");
		file.createNewFile();
//		file.delete();
		
		File drive = new File("G:\\");
		
		File[] files = drive.listFiles();
		System.out.println("Files count :: "+files.length);
		
		for(File f : files){
			
			String name = f.getName();
			String path = f.getPath();
			boolean isFile = f.isFile();
			System.out.println(name+" ::  "+isFile);
		}
		
		
		
		
		System.out.println("End of the program");
	}

}



package com.dac.reflection;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.activation.FileDataSource;

public class NIODemo {
	
	public static void main(String[] args) throws IOException {

		//CREATE
		Path p = Paths.get("G:\\niodemo\\a.txt");
//		Files.createFile(p);
		System.out.println("File existance : "+Files.exists(p));
		String content = "Hello Java !";
		Files.write(p, content.getBytes());
		
		List<String> lines = Files.readAllLines(p);
		System.out.println("File Content : "+lines);
		
		Path path2 = Paths.get("G:\\niodemo\\b.txt");
//		Files.createFile(path2);
		
		Files.copy(p, path2);
		
		System.out.println("End of the program");
	}

}

package com.dac.java;

import java.util.Scanner;

//package name section
//import section
//class declaration

public class WrapperClassDemo {
	
	public static void main(String[] args) {

		int i = 5;
		int j; //current value 0 or garbage
		
		Integer intObj; //current value null
						// 	memory is not allocated
		Integer iObj1 = new Integer(10);
		System.out.println("Obj1 : "+iObj1);
		Integer iObj2 = new Integer("-1000");
		System.out.println("Obj2 : "+iObj2);
//		Integer iObj3 = new Integer("ten");  // wrong statement
//		System.out.println("Obj3 : "+iObj3);
		
		
		Float f1 = new Float(3.14f);
		
		Boolean b1 = new Boolean("true"); 
		System.out.println("Boolean 1 : "+b1);
		Boolean b2 = new Boolean("false");
		System.out.println("Boolean 2 : "+b2);
		Boolean b3 = new Boolean("hello");
		System.out.println("Boolean 3 : "+b3); 
		//except true or false in double quotes will be converted to false
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number :: "); 
		String s = scanner.nextLine(); 
		
		int no = Integer.parseInt(s);
		float f2 = Float.parseFloat("3.15f");
		long l = Long.parseLong("1123456789L");
		
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
	}
	
}
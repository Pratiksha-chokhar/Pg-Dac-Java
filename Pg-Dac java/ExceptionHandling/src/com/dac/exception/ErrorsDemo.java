package com.dac.exception;

public class ErrorsDemo {
	
	public static void main(String[] args) {
		//STACK OVERFLOW
		//fact(10);
		//main(args);
		memory();
		System.out.println("End");
	}
	
	public static int fact(int n){
		return fact(n);
	}
	
	public static void memory(){
		Student[] students = new Student[Integer.MAX_VALUE];
	}
}

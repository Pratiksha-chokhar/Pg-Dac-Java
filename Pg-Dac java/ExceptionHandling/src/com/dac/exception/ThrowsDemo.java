package com.dac.exception;

public class ThrowsDemo {
	
	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		
		try{
			strLenth();	
		}catch(NullPointerException e){
			System.out.println("String is null");
		}

		try{
			int result = cal.div(10, 0);	
		}catch(ArithmeticException e){
			System.out.println("Divide by zero is not possible");
		}
	}

	public static void strLenth() throws NullPointerException
	{
		String s = "Hello";
		if( s == null)
			throw new NullPointerException();
		System.out.println(s.length());
	}
}

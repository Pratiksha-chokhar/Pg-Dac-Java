package com.dac.exception;

public class Calculator {
	
	public int add(int a,int b){
		return a+b;
	}

	public int div(int a,int b) throws ArithmeticException{
		return a / b;
	}
}

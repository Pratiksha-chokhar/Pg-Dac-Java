package com.dac.thread;


public class NumberThreadMain {
	
	public static void main(String[] args) {
		MultiplesOf100 t1 = new MultiplesOf100();
		
		MultiplesOfFive r1 = new MultiplesOfFive();
		Thread t2 = new Thread(r1, "Five");
		
		t1.start(); //asynchronous
		t2.start(); 
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		add(10,20);  //execute first
		System.out.println("End of Main method");  //execute next
	}
	
	public static int add(int a,int b){
		int c = a+b;
		System.out.println("Result is ");
		return c;
	}

}

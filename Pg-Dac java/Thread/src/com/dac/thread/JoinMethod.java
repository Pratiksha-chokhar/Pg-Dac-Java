package com.dac.thread;

public class JoinMethod {

	public static void main(String[] args) {
		MultiplesOf100 t1 = new MultiplesOf100();

		MultiplesOfFive r1 = new MultiplesOfFive();
		Thread t2 = new Thread(r1, "Five");

		t1.start(); // asynchronous
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
	}
}
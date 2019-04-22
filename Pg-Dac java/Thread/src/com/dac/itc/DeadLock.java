package com.dac.itc;

public class DeadLock {
	
	public static void main(String[] args) {
		System.out.println("Main method starts");
		try {
			Thread mainThread = Thread.currentThread();
			mainThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Main method ends");
	}
}
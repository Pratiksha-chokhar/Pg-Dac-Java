package com.dac.thread;

public class MainClass {
	
	public static void main(String[] args) {
		SimpleThread myThread = new SimpleThread();
		myThread.setName("SIMPLE THREAD");
		myThread.start(); // starts the new thread / new call stack
		
		GoodAfternoonThread runnableInterface = new GoodAfternoonThread();
		Thread afternoonThread = new Thread(runnableInterface);
		afternoonThread.setName("AFTERNOON");
		afternoonThread.start();  //starts another new thread / another new call stack
		
		Thread mainThread = Thread.currentThread();
		mainThread.setName("MAIN");
		System.out.println("Main Thread Name : "+mainThread.getName());
		
		System.out.println("End of the Program");  // main thread 
	}
}
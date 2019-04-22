package com.dac.thread;

public class SimpleThread extends Thread{
	
	@Override
	public void run() {
		super.run();
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		System.out.println("SimpleThread :: "+threadName);
		//here is the logic for your thread
		for(int i=0;i<20;i++)
			System.out.println("Hello Java !");
	}
}

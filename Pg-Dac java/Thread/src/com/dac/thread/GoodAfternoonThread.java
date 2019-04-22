package com.dac.thread;

public class GoodAfternoonThread implements Runnable{
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		String threadName = currentThread.getName();
		System.out.println("GoodAfternoonThread :: "+threadName);
		
		for(int i=0;i<20;i++)
			System.out.println("Good Afternoon !");
	}
}
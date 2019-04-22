package com.dac.itc;

public class ITCMain {
	
	public static void main(String[] args) {
		
		Factory factory = new Factory();
		ProducerThread pRunnable = new ProducerThread(factory);
		ConsumerThread cRunnable = new ConsumerThread(factory);
		
		Thread pThread = new Thread(pRunnable);
		Thread cThread = new Thread(cRunnable);
		
		cThread.start();
		
		pThread.start();
		
		
	}
}
package com.dac.thread;

public class ThreadPriorityDemo {
	
	public static void main(String[] args) {
		GoodAfternoonThread r1 = new GoodAfternoonThread();
		Thread t1 = new Thread(r1);
		
		System.out.println("T1 default priority " + t1.getPriority());
		
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("T1 priority after change " + t1.getPriority());
		
		String name = Thread.currentThread().getName();
		System.out.println("In Main Method thread name : "+name);
		
		t1.start();		//this creates the new thread and runs parallel to main thread
//		t1.run();			//does not create any new thread, runs in the main thread
		
		System.out.println("End of the program");
		
	}

}

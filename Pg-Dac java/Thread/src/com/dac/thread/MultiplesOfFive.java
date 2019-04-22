package com.dac.thread;

public class MultiplesOfFive implements Runnable{

	@Override
	public void run() {
		
		Thread t = Thread.currentThread();
		String name = t.getName();
		
		for(int i=1;i<10;i++){
			System.out.println(name+" "+ (i*5) );
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
	}
}
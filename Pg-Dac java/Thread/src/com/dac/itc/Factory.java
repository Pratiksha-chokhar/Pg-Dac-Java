package com.dac.itc;

public class Factory {
	
	int capacity = 5;
	int current = 0; 
	Object lock = new Object();
	
	
	public void produce(){
		synchronized (lock) {
			System.out.println("Going to Produce the Items");
			while ( current < capacity){
				current++;
				System.out.println("Producing Item :: "+current);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Production is done, going awake the waiting thread");
			lock.notifyAll();
			System.out.println("Production is done!");
		}
	}
	
	public void consume(){
		synchronized (lock) {
			System.out.println("Going to consuem the itesm");
			if(current == 0)
			{
				try {
					System.out.println("No Items to consume, going to wait state");
					lock.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			while ( current > 0){
				current--;
				System.out.println("Consumeing the Item : "+current);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("Consumption is done!");
		}
		
	}
}

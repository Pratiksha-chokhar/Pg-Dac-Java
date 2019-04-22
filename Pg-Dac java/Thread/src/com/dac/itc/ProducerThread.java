package com.dac.itc;

public class ProducerThread implements Runnable{
	
	Factory factory;
	
	public ProducerThread(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		factory.produce();
	}
}
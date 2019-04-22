package com.dac.itc;

public class ConsumerThread implements Runnable{
	
	Factory factory;
	
	public ConsumerThread(Factory factory) {
		this.factory = factory;
	}
	
	@Override
	public void run() {
		factory.consume();
	}
}
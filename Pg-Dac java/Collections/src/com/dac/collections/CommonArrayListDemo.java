package com.dac.collections;

import java.util.ArrayList;

public class CommonArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		ArrayList commonList = new ArrayList();
		commonList.add("Hello");
		commonList.add(121345);
		commonList.add(new Float(3.14f));
		
		int j = (int) commonList.get(0);
		int i = (int) commonList.get(1);
	
		System.out.println("End");
		
	}
}
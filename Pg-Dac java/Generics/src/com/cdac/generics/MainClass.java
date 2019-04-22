package com.cdac.generics;

import java.util.Date;

public class MainClass {
	
	public static void main(String[] args) {
		/*CommonDataStore dataStore = new CommonDataStore();
		
		dataStore.setElement("Hello");
		System.out.println("Get String : "+dataStore.getElement());
		
		dataStore.setElement(new Float(3.14f));
		System.out.println("Get Float :: "+dataStore.getElement());
		*/
		
		DataStore<String> stringDataStore = new DataStore<>();
		stringDataStore.setElement("Java");
		String s =  stringDataStore.getElement();
		
		DataStore<Date> dateStore = new DataStore<>();
		dateStore.setElement(new Date());
		
		
		
	}
}
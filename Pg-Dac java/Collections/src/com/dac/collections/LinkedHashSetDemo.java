package com.dac.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		LinkedHashSet<String> countrySet = new LinkedHashSet<>();
		
		countrySet.add("India");
		countrySet.add("China");
		countrySet.add("Japan");
		
		Iterator<String> iterator = countrySet.iterator();
		while( iterator.hasNext() ){
			String value = iterator.next();
			System.out.println("Country Name is :: "+value);
		}
	}
}
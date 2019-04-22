package com.dac.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		HashSet<String> countrySet = new HashSet<>();
		
		//ADD
		countrySet.add("India");
		countrySet.add("China");
		countrySet.add("US");
		countrySet.add("London");
		countrySet.add(null);
		
		String strIndia = new String("India");
		System.out.println("strIndia hashCode :: "+strIndia.hashCode());
		String str2 = new String("India");
		System.out.println("str2 hashCode :: "+str2.hashCode());
				
		//DUPLICATE ELEMETNS ARE IGNORED
		countrySet.add("india");
		countrySet.add("London");
		countrySet.add(strIndia);
		countrySet.add(str2);
		
		//SIZE AND EMPTY
		System.out.println("Size of the Set :: "+countrySet.size());
		System.out.println("Isempty :: "+countrySet.isEmpty());
		
		//SEARCH OR CONTAINS
		System.out.println("is it Contains India :: "+countrySet.contains("India"));
		System.out.println("is it Contains Japan :: "+countrySet.contains("Japan"));
		
		//GET OR READ OR ITERATE
		Iterator<String> iterator = countrySet.iterator();
		
		while ( iterator.hasNext() ){
			String country = iterator.next();
			System.out.println("Country Name is : "+country);
		}
		
		//REMOVE
		countrySet.remove("US");
		countrySet.clear();
		
		System.out.println( countrySet );
	}
}
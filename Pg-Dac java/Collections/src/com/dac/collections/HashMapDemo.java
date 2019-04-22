package com.dac.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(null, null);
		map.put(10, "One");
		
		//DUPLICATE KEY - VALUE WILL BE REPLACED
		map.put(1, "ONE");
		
		String value = map.get(2);
		System.out.println("Value of key 2 is :: "+value);
		String value2 = map.get(200);
		System.out.println("Value of key 200 is :: "+value2);
		
		int size = map.size();
		System.out.println("Size of the map is : "+size);
		
		System.out.println("Does key 200 is available :: "+map.containsKey(200));
		System.out.println("Does key 10 is available :: "+map.containsKey(10));
				
		System.out.println("is value ONE available :: "+map.containsValue("ONE"));
		System.out.println("is value TEN available :: "+map.containsValue("TEN"));

		Set<Entry<Integer, String>> entries =  map.entrySet();
		Iterator<Entry<Integer, String>> iterator =  entries.iterator();
		
		System.out.println();
		System.out.println();
		while ( iterator.hasNext() )
		{
			Entry<Integer, String> entry = iterator.next();
			System.out.println("Key is : "+entry.getKey()+" Value is : "+entry.getValue());
		}
		System.out.println();
		System.out.println();
		
		Set<Integer> keys = map.keySet();
		Set<String> uniqueValue = (Set<String>) map.values();
		List<String> allValues = (List<String>) map.values();
		
		map.remove(10);
		
		System.out.println(map.toString());
	}
}
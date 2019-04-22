package com.dac.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> list;   // null
		list = new ArrayList<>();

		//ADD
		list.add("Android");	//0
		list.add("Windoes");	//1   2
		list.add("MacOS");		//2   3
		list.add(1,"Linux");	//1
		list.add("Ubuntu");
		list.add("Android");
		list.add("Windows");
		list.add("Windows");
		list.add(null);
		list.add("Android");
		
		//SIZE OR ISEMPTY
		int size = list.size();
		System.out.println("Size is : "+size);
		System.out.println("Is it empty : "+list.isEmpty());
		
		//READ OR GET OR ITERATE
		String value = list.get(3);
		System.out.println("Value at index 3: "+value);
		
		System.out.println("Using For loop");
		for(int i=0;i<list.size();i++){
			System.out.println("Value at "+i+" is "+list.get(i));
		}
		
		//READ OR REMOVE
		System.out.println("Using Iterator");
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()){
			String val = iterator.next();
			System.out.println(val);
			//iterator.remove();
		}	
		System.out.println("End of Iterator");
		
		//SEARCH
		boolean isAvailable = list.contains("Android");
		System.out.println("Is list contains Android :: "+isAvailable);
		boolean isWebOs = list.contains("WebOS");
		System.out.println("Is list contains WebOS :: "+isWebOs);
		
		int linuxIndex = list.indexOf("Linux");
		System.out.println("Index of Linux :: "+linuxIndex);
		
		int webOsIndex = list.indexOf("WebOS");
		System.out.println("Index of WebOs :: "+webOsIndex);
		
		int androidIndex = list.indexOf("Android");
		System.out.println("Index of Android :: "+androidIndex);
		
		int androidLastIndex = list.lastIndexOf("Android");
		System.out.println("Last index of Android :: "+androidLastIndex);
		
		int testIndex = list.indexOf("TestOS");
		System.out.println("Index of TestOS :: "+testIndex);
		
		
		//UPDATE OR SET
		list.set(2, "WebOS");
		
		//REMOVE 
//		list.remove("Android");
		list.remove(5);
		list.clear();
		
		System.out.println(list.toString());
		
	}
}
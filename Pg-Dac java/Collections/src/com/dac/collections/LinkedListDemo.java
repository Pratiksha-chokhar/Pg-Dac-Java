package com.dac.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(new Integer(20));
		list.add(30);
		list.add(1,50);
		
		list.addLast(60);
		list.addFirst(70);
		
		int value = list.get(2);
		int firstValue = list.getFirst();
		int lastValue  = list.getLast();

		System.out.println("Value at index 2 is : "+value);
		System.out.println("Fist value in the list : "+firstValue);
		System.out.println("Last value in the list : "+lastValue);
		
		ListIterator<Integer> listIterator = list.listIterator();
		
		while ( listIterator.hasNext()){
			value = listIterator.next();
			//NAVIGATION, REMOVE, ADD, UPDATE
			if(value == 10)
				listIterator.add(100);
			
			else if(value == 50)
				listIterator.set(500);
			
			else if(value == 60)
				listIterator.remove();
		}
		
		System.out.println(list);
		
		list.remove(2); 
		list.removeLast();  // removes the last element
		list.remove(); 		// remove the first element

		
	}
}
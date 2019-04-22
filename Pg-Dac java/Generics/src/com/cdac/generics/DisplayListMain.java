package com.cdac.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class DisplayListMain {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		
		DisplayListCollection.display(list);
		
		Vector<Integer> vector = new Vector<>();
		vector.add(10);
		vector.add(100);
		vector.add(1000);
		
		LinkedList<Float> linkedList = new LinkedList<>();
		linkedList.add(3.14f);
		linkedList.add(5.23f);
		linkedList.add(13.1414f);
		
		DisplayListCollection.display(vector);
		DisplayListCollection.display(linkedList);
		
		
		System.out.println("Upper Bounded Wild Card Generic");
		//Upper Bounded Wild card generic
		//DisplayListCollection.display2(list); // Not Allowed
		DisplayListCollection.display2(vector);    //valid
		DisplayListCollection.display2(linkedList);   //valid
		
		System.out.println("Lower Bound Wild Card Generic");
//		DisplayListCollection.lowerBoundWildCard(list);  //Not Allowed
		DisplayListCollection.lowerBoundWildCard(vector); // Allowed
//		DisplayListCollection.lowerBoundWildCard(linkedList);  //Not Allowed
		
		
		
		
	}
}
package com.dac.reflection;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsUtility {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		list.add("Five");
		list.add("Six");
		list.add("One");
		list.add("One");

		System.out.println(list);
		
		HashSet<String> set = new HashSet<>();
		set.addAll(list);
		System.out.println("Set is :: "+set);
		
		Collections.sort(list);
		System.out.println("After Sorting :: "+list);
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse Order  :: "+list);
		
		
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(10);
		integerList.add(20);
		integerList.add(15);
		integerList.add(30);
		integerList.add(25);
		
		int max = Collections.max(integerList);
		System.out.println("Max in Integer List : "+max);
		int min = Collections.min(integerList);
		System.out.println("Min in integer list : "+min);
		
		String maxStr = Collections.max(list);
		System.out.println("Max in string list : "+maxStr);
		
		List<String> emptyList = Collections.emptyList();
//		emptyList.add("Trying to add");
		
		List<String> singletonList = Collections.singletonList("OnlyOne");
//		singletonList.add(0,"new value");
		
		List<Integer> threadSafeLsit = Collections.synchronizedList(integerList);
		Set<String> threadSafeSet = Collections.synchronizedSet(set);
		
		
		System.out.println("Before shuffle : "+integerList);
		Collections.shuffle(integerList);
		System.out.println("After shuffle : "+integerList);

		Collections.replaceAll(integerList, 10, 100);
		System.out.println("After replace all : "+integerList);
	}
}
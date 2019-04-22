package com.cdac.generics;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class NumberGenericMain {
	
	public static void main(String[] args) {
		NumberDataStore<Integer> ints = new NumberDataStore<>();
		ints.setNumber(10);
		int i = ints.getNumber();
		
		NumberDataStore<Float> floats = new NumberDataStore<>();
		floats.setNumber(3.14f);
		float f = floats.getNumber();
		
		//NumberDataStore<Date> strings = new NumberDataStore<>(); error
		
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("End");
		
		CustomMap<Integer, String> map = new CustomMap<>();
		map.putEntry(10, "Ten");
		
		System.out.println("Key is : "+map.getKey());
		System.out.println("Value is : "+map.getValue());
		
		HashMap<Integer, String> m;
		
	}
}
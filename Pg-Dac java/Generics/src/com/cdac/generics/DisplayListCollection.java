package com.cdac.generics;

import java.util.List;

public class DisplayListCollection {
	public static void display(List<?> list){
		for(Object s : list){
			System.out.println(s);
		}
	}
	
	public static void display2(List<? extends Number> list){
		for(Object o : list){
			System.out.println(o);
		}
	}
	
	public static void lowerBoundWildCard(List<? super Integer> list){
		for(Object o : list){
			System.out.println(o);
		}
	}
}
package com.dac.compare;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentMain{
	
	public static void main(String[] args) {
		
		TreeSet<Student> set = new TreeSet<>();
		TreeSet<String> strSet = new TreeSet<>();
		
		set.add(new Student(104,"ABC",550));
		set.add(new Student(102,"BAA",350));
		set.add(new Student(105,"CBC",500));
		
		Student student = new Student(112,"Atul", 550);
		
		Iterator<Student> iterator = set.iterator();
		while ( iterator.hasNext() ){
			System.out.println(iterator.next());
		}
		
		MarkComparator markComparator = new MarkComparator();
		TreeSet<Student> markSet = new TreeSet<>(markComparator);
		markSet.addAll(set);
		
		System.out.println("Ordered By Marks");
		Iterator<Student> iterator2 = markSet.iterator();
		while ( iterator2.hasNext() ){
			System.out.println(iterator2.next());
		}		
		
		NameComparator nameComparator = new NameComparator();
		TreeSet<Student> nameSet = new TreeSet<>(nameComparator);
		nameSet.addAll(set);
		System.out.println("Ordered By Name");
		Iterator<Student> iterator3 = nameSet.iterator();
		while ( iterator3.hasNext() ){
			System.out.println(iterator3.next());
		}		
		
	}

}

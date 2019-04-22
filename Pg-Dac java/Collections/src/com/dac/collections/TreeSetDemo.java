package com.dac.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
//		TreeSetDemo.strTreeSet();

		TreeSetDemo.studentTreeSet();
		
		System.out.println("End");
	}

	public static void strTreeSet() {
		TreeSet<String> osSet = new TreeSet<>();
		osSet.add("Windows");
		osSet.add("Linxu");
		osSet.add("MacOs");
		Iterator<String> iterator = osSet.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("Country Name :: " + value);
		}
	}
	
	public  static void studentTreeSet(){
		
		//DESCENDING ORDER
		StudentComparator comparator = new StudentComparator();
//		TreeSet<Student> set = new TreeSet<>(comparator);
		
		//ASCENDING ORDER
		TreeSet<Student> set = new TreeSet<>();
		
		
		Student s1 = new Student();
		s1.setName("Atul");
		s1.setId(101);
		s1.setMark(99);
		
		Student s2 = new Student(102, "Amit",95);
		Student s3 = new Student(103,"Maturi",100);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		
		Iterator<Student> iterator = set.iterator();
		while ( iterator.hasNext() ){
			Student s = iterator.next();
			System.out.println(s.toString());
		}
	}
}
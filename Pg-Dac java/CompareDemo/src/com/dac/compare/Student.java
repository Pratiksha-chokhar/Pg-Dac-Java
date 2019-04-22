package com.dac.compare;

public class Student implements Comparable<Student>{
	
	private int rollNo;
	String name;
	int marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollNo, String name, int marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}



	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return rollNo+" "+name+" "+marks;
	}

	@Override
	public int compareTo(Student o) {
		
		// +ve   o1 > o2 
		// -ve	o1 < o2
		// 0	o1 == o2
		
		if(this.rollNo > o.rollNo)
			return 1;
		else if(this.rollNo < o.rollNo)
			return -1;
		//both are equals
		return 0;
	}
}
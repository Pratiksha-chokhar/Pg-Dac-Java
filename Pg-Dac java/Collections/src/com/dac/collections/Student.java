package com.dac.collections;

public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	private int mark;
	
	public Student() {

	}
	
	public Student(int id, String name,int mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}
	
	@Override
	public String toString() {
		return id+ " "+name+" "+mark;
	}

	@Override
	public int compareTo(Student o) {
		//student 1 is - this
		//student 2 is - o (argument)
		
		//Sorting based on the name
//		return this.name.compareTo(o.name);
		
		if( this.mark == o.mark)
			return 0;
		else if ( this.mark > o.mark)
			return 1;
		else if( this.mark < o.mark)
			return -1;
		
		
		return 0;
	}
}

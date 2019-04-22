package com.dac.reflection;

public class Student {
	private int rollNo;
	private String name;
	
	private static Student student = null;
	
	private Student() {
	
	}
	
	public static Student getInstance(){
		if(student == null){
			student = new Student();
		}
		return student;
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
}

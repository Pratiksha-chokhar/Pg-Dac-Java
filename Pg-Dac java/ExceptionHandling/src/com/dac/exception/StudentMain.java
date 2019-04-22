package com.dac.exception;

public class StudentMain {
	public static void main(String[] args) {
		StudentDB studentDB = new StudentDB();
		
		try {
			Student s1 = studentDB.getStudent(112);
			System.out.println("Name is : "+s1.getName());
		} catch (StudentNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
				
		
	}
}

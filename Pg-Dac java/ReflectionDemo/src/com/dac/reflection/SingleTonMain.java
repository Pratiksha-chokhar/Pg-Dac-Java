package com.dac.reflection;

public class SingleTonMain {
	
	public static void main(String[] args) {
		Student student = Student.getInstance();
		student.setName("AAAAA");
		student.setRollNo(1111);
		System.out.println("Student 1 value : "+student.getName()+" "+student.getRollNo());

		Student student2 = Student.getInstance();
		System.out.println("student 2 value : "+student2.getName()+" "+student2.getRollNo());
		
	}

}

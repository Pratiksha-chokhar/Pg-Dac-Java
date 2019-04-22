package com.dac.exception;

public class StudentDB {
	
	Student[] students = new Student[3];
	
	public StudentDB(){
		read();
	}
	
	public void read(){
		Student s1 = new Student(101,"Atul");
		Student s2 = new Student(102,"Sathish");
		Student s3 = new Student(103,"Ranjit");
		
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
	}
	
	public Student getStudent(int inputId) throws StudentNotFoundException{
		
		
		for(int i=0;i<students.length;i++){
			Student s = students[i];
			if(inputId == students[i].getId()){
				System.out.println("Student Record found");
				return s;
			}
		}
		
		//You searched all the 90 students records
		//But still you didnt find the student record
		throw new StudentNotFoundException("I got some trouble!");
		
	}
}

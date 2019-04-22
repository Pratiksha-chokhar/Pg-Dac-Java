package com.dac.javaio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationDemo {
	
	public static void main(String[] args) {
		try {
			writeObject();
			readObject();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of the program");
	}
	
	public static void writeObject() throws IOException{
		Employee emp = new Employee();
		emp.setEmpId(1100);
		emp.setName("Atul");
		emp.setSalary(50000);
		FileOutputStream fos = new FileOutputStream("G:\\Java Operations\\emp_object");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
	}
	
	public static void readObject() throws IOException, ClassNotFoundException{
		FileInputStream fis  = new FileInputStream("G:\\Java Operations\\emp_object");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		Employee e = (Employee) ois.readObject();
		
		System.out.println("Name is :: "+e.getName());
		System.out.println("Emp id : "+e.getEmpId());
		System.out.println("Salary is :: "+e.getSalary());
		
	}

}

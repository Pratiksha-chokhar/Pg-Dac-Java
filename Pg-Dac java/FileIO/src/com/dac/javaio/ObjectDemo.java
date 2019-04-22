package com.dac.javaio;

import java.util.Scanner;

public class ObjectDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Employee emp = new Employee();
		emp.setEmpId(1100);
		System.out.println("Enter the emp name : ");
		emp.setName(scanner.nextLine());
		System.out.println("Enter the employee salary ::");
		emp.setSalary(scanner.nextInt());
	}
}
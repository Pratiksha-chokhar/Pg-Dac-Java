package com.dac.exception;

import java.util.Scanner;

public class CalDiv {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;

		try {
			System.out.println("Enter the value a : ");
			String s1 = scanner.nextLine();
			a = Integer.parseInt(s1); // NumberFormat

			System.out.println("Enter the value b : ");
			String s2 = scanner.nextLine();
			b = Integer.parseInt(s2); // NumberFormat

			int result = a / b; // ArithmeticException
			System.out.println("Result is : " + result);
			
		} catch (NumberFormatException ne) {
			System.out.println("Please give the valid input");
		} catch(ArithmeticException e2){
			System.out.println("Divide by zero is not possible");
		}
	}
}

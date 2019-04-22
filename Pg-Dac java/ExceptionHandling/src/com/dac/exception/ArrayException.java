package com.dac.exception;

public class ArrayException {
	public static void main(String[] args) {
		
		int[] a = new int[5];
		int[] array = {1,2,3,4,5};
		//values are 5 (5 elements)
		// index range 0 - 4
		// what will be the value at index 6 -
		
		System.out.println("value at index 0 : "+array[0]);
//		System.out.println("value at index 6 : "+array[6]);
		
		strLenght(); //function call
	}

	// function definition
	public static void strLenght() {
		try{
			String s = new String("hello");
			System.out.println("Length of hello is : "+s.length());
			
			String s2 = null;
			System.out.println("Length of s2 is : "+s2.length());
			System.out.println("End of try block");
			
			//close the db connectivity - this will not get exectuted wehn an exeception occurs
		}catch(NullPointerException e){
			System.out.println("Null strings dont have length");
		}finally{
			System.out.println("Finally block is called");
			//close the db connectivity
		}
		System.out.println("End of the method");
	}
}

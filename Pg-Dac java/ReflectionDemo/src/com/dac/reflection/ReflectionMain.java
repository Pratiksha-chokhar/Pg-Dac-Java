package com.dac.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Class c = String.class;
		
		String s = "Hello";
/*		Method[] methods = c.getMethods();
		for(Method m : methods){
			System.out.println(m.getName());
		}*/
		
		Class accountClass = Class.forName("com.dac.reflection.Account");
		Method[] accountMethods = accountClass.getMethods();
		for(Method m : accountMethods){
			System.out.println(m.getName());
		}
		
		Field[] fields = accountClass.getFields();  // public members
		fields = accountClass.getDeclaredFields();  //includes private members
		System.out.println("Fields in Account class : "+fields.length);
		for(Field f : fields){
			System.out.println(f.getName());
		}
		
		Account account = new Account(5000);
		System.out.println("Account balance is : "+account.getBalance());
		
		Field balanceField = accountClass.getDeclaredField("balance");
		balanceField.setAccessible(true);
		balanceField.set(account, 12000);
		
		System.out.println("New Balance :: "+account.getBalance());
		
		
		
	}
}
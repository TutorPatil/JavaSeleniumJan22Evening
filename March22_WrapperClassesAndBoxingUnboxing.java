package com.corejava.exceptions;

public class March22_WrapperClassesAndBoxingUnboxing {

	public static void main(String[] args) {
		
		int x = 20;	
		
		Integer x2 = new Integer(x);  // Boxing
		
		
		int x3 = x2.intValue();  // Unboxing
		
		System.out.println(x3);
		
		
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		
		String s = "2000";
		
		System.out.println(s+500);
		
		int sInt = Integer.parseInt(s);
		
		System.out.println(sInt+500);
		
		
		char c = 'a';
		
		Character c1 = new Character(c);
		char c2 = c1.charValue();
		
		
		//int i = 50;
		
		Integer i2 = 50;  // Auto Boxing		
		int i3 = i2;  // Aut Unboxing
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

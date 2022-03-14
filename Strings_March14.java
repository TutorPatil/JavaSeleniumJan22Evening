package com.corejava.strings;

import com.java.classesandobjects.Student;

public class Strings_March14 {

	public static void main(String[] args) {
		StringEx2();
		
	}
	
	public static void StringEx2()
	{
		
		String s = "Selenium";
		
		//s="Java";
		
		System.out.println(s.length());
		
		String s1 = s.toUpperCase();
		
		System.out.println(s);
		
		System.out.println(s1);
		
		s1 = s1.toLowerCase();
		
		
		System.out.println(s1);
		
		System.out.println(s.charAt(2));
		
		System.out.println(s.indexOf('u'));
		
		System.out.println(s.indexOf('e'));
		
		System.out.println(s.lastIndexOf('e'));
		
		
	}
	
	
	public static void StringEx1()
	{
		String s = "Selenium";
		
		System.out.println(s.hashCode());
		
		String s1 = new String("Selenium");
		
		System.out.println(s1.hashCode());
		
		
		System.out.println(s);
		
		System.out.println(s.toString());
		
		
		
		
		/*
		 * Student st1 = new Student();
		 * 
		 * System.out.println(st1);
		 * 
		 * System.out.println(st1.toString());
		 */
		
		
	}

	
	public static void creatingStringObjects()
	{
		// 1st approach using String Key Word , Objects are stored in String Constant Pool Area or Permanent generation Area
		String s = "Selenium";		
		
		// 2 nd Approach using new Key word like any other Objects , Objects are stored in the Heap Memory
		String s1 = new String("Selenium");
		
		
		System.out.println(s.getClass());
		
		System.out.println(s1.getClass());
		
		System.out.println(s==s1);  // Comparing the refereces
		
		System.out.println(s.equals(s1)); // COmparing the contents for equality
		
		System.out.println("=================");
		
		String s2 = "Selenium";
		
		System.out.println(s==s2);  // Comparing the refereces
		
		System.out.println(s.equals(s2)); // COmparing the contents for equality
		
		System.out.println("====================");
		
		String s3 = new String("Selenium");
		
		
		System.out.println(s1==s3);  // Comparing the refereces
		
		System.out.println(s1.equals(s3)); // COmparing the contents for equality
		
		
	}
}

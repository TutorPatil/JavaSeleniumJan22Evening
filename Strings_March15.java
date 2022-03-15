package com.corejava.strings;

import java.util.Arrays;

public class Strings_March15 {

	public static void main(String[] args) {
		
		String s = "Selenum";
		
		System.out.println(s.isEmpty());
		

		

	}
	
	public static void stringEx6()
	{
		String s = "Selenium";
		String s1 = "selenium";
		
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s.concat(s1));  // instead of using + operator to join...
	}
	
	
	public static void stringEx5()
	{
		
		String s = "Selenium";
		
		System.out.println(s.contains("ni"));
		
		System.out.println(s.startsWith("Se"));
		
		System.out.println(s.endsWith("rm"));
		
		String s1 = " Automation ";
		
		System.out.println(s1.length());
		
		s1 = s1.trim();
		
		System.out.println(s1.length());
		
		
		
	}
	public static void stringEx4()
	{
		
		String s = "selenium";		
		
		System.out.println((s.length() ) - (s.replace("e", "").length()));
	}
	
	public static void stringEx3()
	{
		// Replace
		String s = "Selenium";
		
		
		System.out.println(s.replace('S', 'W'));
		
		
		System.out.println(s.replace("Se", "me"));
		
	}
	
	
	/*
	 * 
	 * String s = "Selenium";		
		int count = findOccurancesOfCharInString(s,'m');		
		System.out.println(count);
		
	 */
	public static int findOccurancesOfCharInString(String s, char c)
	{
		int counter = 0;
		
		for(int x=0;x<s.length();x++)
		{
			char c1 = s.charAt(x);
			if( c1 == c)
			{
				counter++;
			}
			
		}
		
		return counter;
		
		
	}
	
	public static void stringEx2()
	{
	String s = "Selenium";
		
		System.out.println(s.length());
		
		for( int x=0;x<s.length();x++)
		{
			System.out.println(s.charAt(x));
		}
		
		System.out.println("=======================");
		
		String s1="";
		
	for(int x=s.length()-1; x>=0; x--)
	{
		char c = s.charAt(x);
		s1 = s1+c;
	}
	
	System.out.println(s1);
	
	}

	
	public static void stringEx1()
	{
		String s = "Selenium";
		
		int x = s.indexOf('S');
		int y = s.lastIndexOf('S');
		
		if( y > x)
		{
			System.out.println("The character is present more than once");
		}
		else
		{
			System.out.println("The character is only present once");
		}
		
		


	}
}

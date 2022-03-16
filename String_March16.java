package com.corejava.strings;

import java.util.concurrent.CountDownLatch;

public class String_March16 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Selenium");
		
		sb.append("Automation");
		
		System.out.println(sb);
		
		sb.delete(2, 6);
		
		
		System.out.println(sb);
		
		sb.insert(2, 'b');
		
		sb.insert(2, "Manual Testing");
		
		System.out.println(sb);
		
		sb.setCharAt(2, 'A');
		
		System.out.println(sb);
		
		sb.reverse();
		
		System.out.println(sb);
		
		
		

	}
	
	public static void escapeCharacters()
	{

		String s = "Selenium \n Automation";
		
		System.out.println(s);
		
		String s2 = "Selenium\tAutomation";
		
		System.out.println(s2);
		
		String contryText = "I am a 'proud' \"Indian\" and I love my country";
		
		System.out.println(contryText);
		
		String path = "C:\\patil\\temp";
		
		System.out.println(path);
		
		
		
	}
	
	public static void stringToCharArray()
	{
		
		String s = "Automation";
		
		char[] c = s.toCharArray();
		
		
		for( char m : c)
		{
			System.out.println(m);
		}
	}
	
	
	public static void convertingOtherTypesToString()
	{
		int sal = 5000;
		
		String s = String.valueOf(sal);
		
		System.out.println(s.length());
		
		char c = 'a';
		
		System.out.println(String.valueOf(c).length());
		
		boolean b = true;
		
		System.out.println(String.valueOf(b).length());
		
	}
	
	
	public static void stringEx_substr()
	{

		String s = "Selenium";
		
		System.out.println(s.substring(2));
		
		System.out.println(s.substring(2, 6)); // End index -1
		
		

	}
	
	public static void stringEx_Split()
	{
		String s1 = "Java is very interesting";
		String[] s2=s1.split(" ");
		
		
		
		for(String m : s2)
		{
			System.out.println(m);
		}
		
	}

}

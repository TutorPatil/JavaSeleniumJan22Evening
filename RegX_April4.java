package com.corejava.finalsession;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_April4 {

	public static void main(String[] args) {
		
		System.out.println(Days.MONDAY);
		
		
		for( Days m : Days.values())
		{
			System.out.println(m);
		}
		
		
		System.out.println("================");
		
		// Create the Pattern class Object
		Pattern p = Pattern.compile("\\d");
		
		//Create Matcher class object
		Matcher m = p.matcher("7");
		
		// Using the matches method to check whether the string matches the pattern or not..
		boolean result = m.matches();
		
		System.out.println(result);
		
		System.out.println(Pattern.compile(".x").matcher("bx").matches());
		
		System.out.println(Pattern.matches("[^0-9]", "a"));
		
		
		
		
		

	}

}

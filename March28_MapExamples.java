package com.corejava.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class March28_MapExamples {

	public static void main(String[] args) {
	
	String s = "seleniume";
	
	Map<Character, Integer> hm = new HashMap<Character, Integer>();
	
	int counter = 1;
	
	for( int i=0; i < s.length(); i++)
	{
		char c = s.charAt(i);
		
		if( hm.containsKey(c))
		{
			Integer val =hm.get(c);
			hm.put(c, val+1);
			
		}
		else
		{
			hm.put(c, counter);
		}
		
		counter = 1;	
	}
	
	System.out.println(hm);
		
	}
	
	public static void hashMapEx1()
	{
		Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101,"Ramu");
		hm.put(102,"Shamu");
		hm.put(103,"Peter");
		hm.put(104,"Abdul");
		
		System.out.println(hm);
	}
	
	public static void hashMapEx2()
	{
	Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101,"Ramu");
		hm.put(102,"Shamu");
		hm.put(103,"Peter");
		hm.put(104,"Abdul");
		hm.put(102,"Geetha");
		
		System.out.println(hm.get(102));
		
		//hm.clear();
		
		System.out.println(hm);
		
		System.out.println(hm.containsKey(104));
		
		System.out.println(hm.containsValue("Geetha"));
	}
	
	public static void hashMapEx3()
	{
	Map<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(101,"Ramu");
		hm.put(103,"Peter");
		hm.put(102,"Shamu");		
		hm.put(104,"Abdul");
		hm.put(102,"Geetha");
		
		System.out.println(hm.isEmpty());
		
		Set<Integer> hmSet = hm.keySet();
		
		
		System.out.println(hmSet);
		
		System.out.println(hm.values());
	}

}

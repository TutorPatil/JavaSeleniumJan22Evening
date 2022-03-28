package com.corejava.collections;

import com.corejava.collections.Outer.InnerClass;

public class Outer {
	
	int oAge = 15;
	String oName = "Ramu";
	
	public void getAgeAndName()
	{
		System.out.println(oName +"---"+ oAge);
		// System.out.println(iAge); This is not allowed
	}
	
	public static void main(String[] args) {
		 
		Outer out = new Outer();
		out.getAgeAndName();
		
		Outer.InnerClass  in = out.new InnerClass();
		in.testInner();
		
	}
	
	class InnerClass{
		
		int iAge = 12;
		String iName = "RamaKrishna";
		
		
		public void testInner()
		{
			System.out.println(oName);
			System.out.println(iName);
			
		}
	}

}

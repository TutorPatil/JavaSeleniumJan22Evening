package com.corejava;

public class Arrays_Feb14 {

	public static void main(String[] args) {
	
		arrayEx1();
	}
	
	// An array is index collection of fixed length of homogeneous data elements
	public static void arrayEx1()
	{
		// Array Declaration ( 3 ways of declaration ) 
		
		int x[];
		int[] y;
		int z[];
		
		// Array Construction
		
		x = new int[5];
		y = new int [10];
		
		// Declaration and construction can be done in one line
		
		int a[] = new int[4];
		char c[] = new char[3];
		String s1[] = new String[4];
		double d[] = new double[6];
		
		// Array initialization
		x[0] = 10;
		x[1] = 200;
		x[2] = 30;
		x[3] = 40;
		x[4] = 550;
		
		
		// Declaration, Construction and initialization in one line....
		int[] x1 = {10,20,30,40};
		
		String[] s4 = { "Java","Bhava","Mava"};
		
		char[] c4 = {'a','b','c','d'};
		
		
		
		
		char chr[] = new char[3];
		
		chr[0] = 'a';
		chr[1] = 'g';
		chr[2] =  'x';
		
		
		for( int i=0; i<chr.length;i++)
		{
			System.out.println(chr[i]);
		}
		
		for( char m : chr)
		{
			System.out.println(m);
		}
		
		System.out.println(x.length);
		
		System.out.println(c.length);
		
		//System.out.println(s.length);
		
		
		
		// fetching the values from Arrays
		
		System.out.println(x[2]);
		
		System.out.println(x[0]);
		
		System.out.println("================================");
		
		// looping through an array
		
		for( int i=0;i<x.length;i++)
		{
			
			System.out.println(x[i]);
		}
		
		// For each loop for int array
		
		for(int m : x)
		{
			System.out.println(m);
		}
		
		
		System.out.println("+++++++++++++++++++++++++++++");
		
		String[] s = new String[3];		
		String s2 = "java";
		
		
		s[0] = "java";
		s[1] = "Bhava";
		s[2] = "Mava";
		
		for(int i=0; i<s.length; i++)
		{
			System.out.println(s[i]);
		}
		
	System.out.println("=====================");
	// Enhanced for loop or for each loop for String array
	
	for( String m : s)
	{
		System.out.println(m);
	}
		
		
				
		
		
		
		
	}

}

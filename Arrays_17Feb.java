package com.corejava;

import java.util.Arrays;

public class Arrays_17Feb {
	
	static 	int x = 10;
	static int[] arr = {10,20,30,40};
	int[] arr2 = {10,20,30,40};

	public static void main(String[] args) {
		
		twoDimeArrayEx2();
		
		
		
	}
	
	public static void twoDimeArrayEx2()
	{
		int[][] x = new int[2][];
		
		x[0] = new int[3];
		x[1] = new int [4];
		
		
				
		
		
		
		for ( int i = 0; i< x.length;i++)
		{
			for( int j=0; j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
	public static void twoDimArrayEx1()
	{
				
		int[][] x = new int[3][3];
		
		x[0][0] = 10;
		x[0][1] = 20;
		x[0][2] = 30;
		x[1][0] = 40;
		x[1][1] = 50;
		x[1][2] = 60;
		x[2][0] = 70;
		x[2][1] = 80;
		x[2][2] = 90;		
		
		System.out.println(x[2][2]);
		
		System.out.println(x.length);
		
		for( int i=0 ; i< x.length;i++)
		{
			for( int j=0; j<x[i].length;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			
			System.out.println();
			
			
		}
		
		
		
		
	}
	
	
	
	
	
	public static void annonymousArraysEtc()
	{
		System.out.println(x);
		
		System.out.println(Arrays.toString(arr)); // static array can be accessed inside the static methods
		
		// non static array cant be accessed inside static method
		//System.out.println(Arrays.toString(arr2));
		
		int[] m = {1,2,3,4,5};
		
		m[2] = 10;
		
		final int[] n = {1,2,3,4,5}; // Arrays can be final as well.
		
		
		int[] m1 = {10,20,30,40};
			
		test(new int[] {10,20,30,40});
			
		Arrays.sort(new int[] {10,50,5,40});
		
	}
	
	
	
	
	public static void arraysClassInbuiltMethods()
	{

		int[] x = {5,2,10,15,3,25,1};  
		
		System.out.println(x);
		
		System.out.println(Arrays.toString(x));	
		
		Arrays.sort(x);
		
		System.out.println(Arrays.toString(x));		
		
		System.out.println(Arrays.binarySearch(x, 10));
		
		System.out.println(Arrays.binarySearch(x, 100));		
		
		
		
		char[] c = {'x','b','a','z','m','c'};
		
		System.out.println(Arrays.toString(c));
		
		Arrays.sort(c);
		
		System.out.println(Arrays.toString(c));
		
		int m = Arrays.binarySearch(c, 'd');
		
		if( m >= 0 )
		{
			System.out.println(" The required char is present in the char array");
		}
		else
		{
			System.out.println(" The required char is not present in the char array");
		}
		

		
	}
	
	public static int[]  test(int[] a)	
	{		
		Arrays.sort(a);
		return a;
	}

}

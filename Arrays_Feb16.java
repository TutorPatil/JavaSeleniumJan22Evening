package com.corejava;

import java.util.Arrays;

public class Arrays_Feb16 {

	public static void main(String[] args) {
		
		int[] x = { 5,2,10,15,3,25,1};	
				
		String s = Arrays.toString(x);
		
		System.out.println(s);
		
		Arrays.sort(x);
		
		System.out.println(Arrays.toString(x));
		
	}
	/*
		int[] x = { 5,2,10,15,3,25,1};	
		System.out.println(joinElementsOfIntArray(x));	
		int[] y = sortIntArray(x);	
		System.out.println(joinElementsOfIntArray(y));
	*/
	
	public static int[] sortIntArray(int[] x)
	{
		int temp = 0;
		
		for( int i=0; i< x.length; i++)
		{
			for( int j=i+1; j<x.length;j++)
			{
				if(x[i] > x[j])
				{
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;					
				}
			}
		}
		
		return x;
	}
	
	/*
		int[] x = { 10, 20, 30, 40, 50 };
		int sum = sumOfIntArrayElements(x);
		System.out.println(sum);
	 */
	public static int sumOfIntArrayElements(int[] x) {
		int sum = 0;
		for (int m : x) {
			sum = (sum + m);
		}
		return sum;
	}
	
	/*
		int[] x = { 10, 20, 30, 40, 50 };
		String s = joinElementsOfIntArray(x);
		System.out.println(s);
	*/	
	public static String joinElementsOfIntArray(int[] x)
	{
		String s = "";
		
		for( int i=0; i< x.length; i++)
		{
			s = s+x[i]+", ";
		}
		
		/*
		for (int m : x) {
			s = (s + m+" ");
		}
		*/
		return s;
		
	}
	
	public static void loopingThroughAnIntArray()
	{		

		int[] x = { 10, 20, 30, 40, 50 };
		
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
		
		for( int i : x)
		{
			System.out.println(i);
		}
		
	}
	
	public static void reverseTravserseAnIntArray()
	{
		int[] x = { 10, 20, 30, 40, 50 };
		
		for( int i = (x.length-1); i>=0;i--)
		{
			System.out.println(x[i]);
		}
	}
	
}

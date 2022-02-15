package com.corejava;

public class Arrays_Feb15 {

	public static void main(String[] args) {
		
		int num = 5555;
		int[] arr = {10,45,55,100,458};
		
		boolean result =searchForAnumberInIntArray(arr, num);
		
		System.out.println(result);
		
		
		
		
		
		//countTheOccurancesOfAnumInIntArray();

	}
	
	public static void arrayEx1()
	{
		int[] x = {10,20,10,40};
		
		System.out.println(x);
		
		System.out.println(x.length);
		
		x[0] = 50;
		
		// System.out.println(x[5]); // This line will throw an exception
		
		for( int i=0; i < x.length ; i++)
		{
			System.out.println(x[i]);
		}
		
	}

	public static void searchAnElementInStringArray()
	{
		String searchString = "Selenium";
		String[] s = {"java","Selenium","Automation"};
		
		for( int x = 0 ; x<s.length ; x++)
		{
			if (s[x].equals(searchString))
			{
				System.out.println(" The required String is present in the array ");
				System.out.println(" The element is present in the index "+x);
				break;
			}			
		}
		
	}
	
	public static void searchForAnumberInIntArray()
	{
		int num = 55;
		int[] arr = {10,45,55,100,458};
		
		for( int x = 0; x< arr.length; x++)
		{
			if( arr[x] == num)
			{
				System.out.println(" The required number  is present in the array ");
				System.out.println(" The element is present in the index "+x);
				break;
			}
		}
	}
	
	
	public static boolean searchForAnumberInIntArray(int[] arr, int num)
	{
		//int num = 55;
		//int[] arr = {10,45,55,100,458};
		
		
		boolean isPresent = false;
		for( int x = 0; x< arr.length; x++)
		{
			if( arr[x] == num)
			{
				isPresent = true;				
				break;
			}
		}
		
		return isPresent;
	}
	
	
	
	public static void countTheOccurancesOfAnumInIntArray()
	{
		int num = 10;
		int[] arr = {10,45,10,100,458,10,178};
		int counter = 0;
		
		for( int x = 0; x< arr.length; x++)
		{
			if( arr[x] == num)
			{
				counter++;				
			}
		}
		
		System.out.println(" The number of occurances of the number "+num + " is -- "+ counter);
	}
	
}

package com.corejava;

public class Methods_Feb11 {

	static double d1;

	public static void main(String[] args) {
		/*
		 * printTotalIncomeoFEmp();
		 * 
		 * double x = 4000.45;
		 * 
		 * double d = addSalaryAndCom(50000, 1500.75);
		 * 
		 * d1 = ( x + d);
		 * 
		 * //System.out.println(" Your total income is "+d1);
		 * 
		 * printTotalIncomeoFEmp();
		 */

		// System.out.println(giveCountryInitialOfUser("Ramu"));
		
		System.out.println(addNumbers(10,20));
		
		System.out.println(addNumbers(10,20,30));

	}

	public static void printTotalIncomeoFEmp() {
		System.out.println(" The total income of emp is " + d1);
	}

	public static double addSalaryAndCom(int salary, double com) {
		double d = 0.0;

		d = salary + com;

		return d;

	}

	public static char giveCountryInitialOfUser(String name) {
		char c = 'x';

		if (name != null) {
			return 'I';
		}

		return c;

	}
	
	public static int addNumbers(int a, int b)
	{
		int sum = ( a + b);
		return sum;
	}
	
	public static int addNumbers()
	{
		return 10+20;
	}
	public static int addNumbers(int a)
	{
		return a+20;
	}
	
	
	public static int addNumbers(int a, int b, int c)
	{
		int sum = ( a + b + c);
		return sum;
	}
	
	
	public static String joinNameAndEmpId(String name, int empID)
	{
		return ( name + " " + empID);
	}
	

	public static String joinNameAndEmpId(int empID,String name)
	{
		return ( name + " " + empID);
	}
}

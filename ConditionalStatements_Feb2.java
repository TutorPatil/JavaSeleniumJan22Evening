package com.corejava;

public class ConditionalStatements_Feb2 {

	public static void main(String[] args) {
		whileExample2();

	}	
	public static void biggestOf3Numbers()
	{
		int a = 100;
		int b = 15;
		int c = 50;
		
		if( a > b)
		{
			if( a > c)
			{
				System.out.println(" A is the biggest");
			}
			else
			{
				System.out.println(" C is the biggest");
			}
			
		}
		else
		{
			if( b > c )
			{
				System.out.println(" B is the biggest");
			}
			else
			{
				System.out.println(" C is the biggest");
			}
		}
		
		
	}

	public static void biggestOf3Numbers1()
	{
		int a = 100;
		int b = 150;
		int c = 500;
		
	
		if((a > b) && (a > c))
		{
			System.out.println(" A is the biggest..");
		}
		else if((b > a) && (b > c))
		{
			System.out.println(" B is the biggest..");
		}
		else if((c > a) && (c > b))
		{
			System.out.println(" c is the biggest..");
		}
		
	}

	public static void switchExample1()
	{
		int month = 13;
		
		switch(month)
		{
		case 1:
		{
			System.out.println(" you are born in Jan");
			break;
		}
		case 2:
		{
			System.out.println(" you are born in Feb");
			break;
		}
		case 3:
		{
			System.out.println(" you are born in March");
			break;
		}
		case 4:
		{
			System.out.println(" you are born in April");
			break;
		}
		default:
		{
			System.out.println(" Please enter the correct value for month...");
		}
		
		
		
		
		}
	}


	public static void switchExample2()
	{
		int month = 20;
		
		switch ( month )
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
		{
			System.out.println(" There are 31 days in your month..");
			break;
		}
		case 4:
		case 6:
		case 9:
		case 11:
		{
			System.out.println(" There are 30 Days in your month....");
			break;
		}
		case 2:
		{
			System.out.println(" There are 28 or 29 days in your month..");
			break;
		}
		default:
		{
			System.out.println(" Please enter correct value for month....");
		}
			
		
			
			
			
			
			
			
		}
		
		
	}
		
	public static void switchExample3()
	{
		
		String browser = "Safari";
		
		//browser.equals("Chrome")
		
		switch(browser)
		{
		case "Chrome":
		{
			System.out.println("Running the test cases using Chrome browser..");
			break;
		}	
		case "Firefox":
		{
			System.out.println("Running the test cases using Firefox browser..");
			break;
		}	
		case "Edge":
		{
			System.out.println("Running the test cases using Edge browser..");
			break;
		}	
		default :
		{
			System.out.println(" Browser not supported...");
		}
		
		}
		
	}
	
	public static void whileExample1()
	{
		int x = 10;
		
		while( x >= 1)
		{
			System.out.println(" The value of x is "+x);
			x--;
			
		}
		System.out.println(" After the while loop....");		
		
	}
	
	public static void whileExample2()
	{
		int x = 1;
		
		while( x <= 10)
		{
			System.out.println(" The value of x is "+x);
				if( x == 5)
				{
					break;
				}
			x++;			
		}
		System.out.println(" After the while loop....");		
		
	}
	
}

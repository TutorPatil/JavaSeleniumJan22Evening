package com.java.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class March17_FileHandling {

	public static void main(String[] args) throws IOException {
		
		
		
		

	}
	
	public static void readFromFile() throws IOException
	{
		File f = new File("D:\\EveningBatchJan22\\TempFolder2\\data.txt");
		
		FileReader fr = new FileReader(f);
		
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		
		while( ((line = br.readLine() )!= null ) )
		{
			System.out.println(line);
			
					
		}
		
	}
	

	public static void writeToFile() throws IOException
	{
		File f = new File("D:\\EveningBatchJan22\\TempFolder2\\data.txt");
		
		FileWriter fw = new FileWriter(f);
		
		fw.write("Java is very interesting..\n");
		
		fw.write("Selenium will be interesting as well..\n");
		
		fw.flush();
		
		fw.close();
		
	}
	
	//writeTestResultsToFile("Login_001","Pass");
	public static void writeTestResultsToFile(String testCaseName, String testCaseStatus) throws IOException
	{
		File f = new File("D:\\EveningBatchJan22\\TempFolder2\\data.txt");
		
		FileWriter fw = new FileWriter(f,true);
		
		fw.write(testCaseName +"----- "+ testCaseStatus+"\n");	
		
		
		fw.flush();
		
		fw.close();
		
	}
	
	//writeToHtmlFile();
	public static void writeToHtmlFile() throws IOException
	{
		File f = new File("D:\\EveningBatchJan22\\TempFolder2\\login.html");
		
		FileWriter fw = new FileWriter(f,true);
		
		fw.write("<html>");
		fw.write("<body>");
		
		fw.write("<input type='text'>UserName </input>");
		fw.write("<br>");
		fw.write("<input type='text'>Password</input>");
		fw.write("<br>");
		fw.write("</body>");
		
		fw.write("</html>");
		
		
		fw.flush();
		
		fw.close();
		
	}
	
	
	
	
	
	public static void fileCreation() throws IOException
	{
		File f = new File("D:\\EveningBatchJan22\\TempFolder2\\data.txt");
		
		f.createNewFile();
		
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.exists());
		
		System.out.println(f.getName());
		
		System.out.println(f.isFile());
		
		System.out.println(f.isDirectory());
	}
	
	public static void folders()
	{
		File f = new File("D:\\EveningBatchJan22\\TempFolder2");
		
		//File f1 = new File("D:\\EveningBatchJan22\\TempFolder2");
		
		//f.mkdir();
		
		System.out.println(f.getAbsolutePath());
		
		System.out.println(f.exists());
		
		System.out.println(f.getName());
		
		System.out.println(f.isDirectory());
		
		//f.renameTo(f1);
		
		String[] s = f.list();
		
		for( String m : s)
		{
			System.out.println(m);
		}
	}

}

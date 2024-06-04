package com.Example;

public class ExceptionD2 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		try 
		{
			  int c = Integer.parseInt("2");
			  System.out.println(c);
			  int a = Integer.parseInt("sang");
			  System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("it is inresting but difficult to learn java");
		}
		
	}

}

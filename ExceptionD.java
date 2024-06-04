package com.Example;

public class ExceptionD {

	public static void main(String[] args)
	{
		
		try 
		{
			//int data = 50/0;
			//System.out.println("data"+data);
			int a []=new int [5];
			a[4]=50/5;
			System.out.println(a[4]);
			
		}
		catch(ArithmeticException e)
		{
		
			System.out.println(e);
			System.out.println("you cannot divied by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("exception is not in a catch");
    }

}

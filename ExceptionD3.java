package com.Example;

public class ExceptionD3
{
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("person is not able to vote ");
		}
		else
		{
			System.out.println("person is able to vote");
		}
	}
	
public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		validate(13);
		System.out.println("rest of the code");

	}

}

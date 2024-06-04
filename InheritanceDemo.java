package com.java;

import java.util.Scanner;

class signalInheritance
{
//	int a,b;
	int age;
	Scanner sc = new Scanner(System.in);
	public void getdata()
	{
//	     System.out.println("enter firt no:");	
//	     a = sc.nextInt();
//	     System.out.println("enter second  no:");	
//	     b = sc.nextInt();
		
		System.out.println("enter your age :");	
        age = sc.nextInt();
	}
	
}
class derivedInheritance extends signalInheritance
{
	public void setdata()
	{
		if(age>=18)
		{
		 System.out.println(age+":you are eligible for vote");
		}
		else
		{
			System.out.println(age+":you are not eligible for vote");
		}
	}
	
}
public class InheritanceDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		derivedInheritance ad = new derivedInheritance();
		ad.getdata();
		ad.setdata();
		

	}

}

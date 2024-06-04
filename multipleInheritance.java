package com.java;

import java.util.Scanner;

class SingleInh
{
	int a,b;
	Scanner sc = new Scanner(System.in);

	public void getdata()
	{
		System.out.println("enetr you mark1");
		a = sc.nextInt();
		System.out.println("enetr you mark1");
		b = sc.nextInt();		
	}
}
class DerivedDemo extends SingleInh
{
	float avg;
	public void getvalues()
	{
		
		avg = (a+b)/2;
	}
}
class multilevelDemo extends DerivedDemo
{
	public void display()
	{
		System.out.println("mark 1"+a);
		System.out.println("mark 2"+b);
		System.out.println("AVg"+avg);
	}
}
public class multipleInheritance {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		multilevelDemo obj = new multilevelDemo();
				obj.getdata();
		         obj.getvalues();
		         obj.display();
	}

}

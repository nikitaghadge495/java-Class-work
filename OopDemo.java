package com.java;

import java.util.Scanner;

class EmpDetails{
	
	int id;
	String names;
	double salary;
	Scanner sc = new Scanner(System.in);
	public void inputData()
	{
		System.out.println("enetr your employee Id :");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter your name:");
		names = sc.nextLine();
		System.out.println("enter your salary :");
		salary = sc.nextDouble();
	}
	public void displayData()
	{
		System.out.println("****************************");
		System.out.println("employe Id : "+id);
		System.out.println("employe name : "+names);
		System.out.println("employe salary : "+salary);
		
	}
}
public class OopDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        EmpDetails obj = new EmpDetails();
        obj.inputData();
        obj.displayData();
        
	}

}

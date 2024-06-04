package com.java;

import java.util.Scanner;

class CarDemo{
		int price;
		String model;
		String brand;
		Scanner sc = new Scanner(System.in);
		public void getdetails()
		{
			System.out.println("enter car brand :");
			brand = sc.nextLine();
			System.out.println("enter car model :");
			model = sc.nextLine();
			System.out.println("enter car price:");
			price = sc.nextInt();
		}
		public void setdetais()
		{
			System.out.println("**********************************");
			System.out.println("***********Car Details************");
			System.out.println("**********************************");
			System.out.println("Car brand : "+brand);
			System.out.println("Car model : "+model);
			System.out.println("Car price : "+price);
		}
		
	}
 public class CarDetails {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		CarDemo c1 = new CarDemo();
		c1.getdetails();
		c1.setdetais();

	}

}

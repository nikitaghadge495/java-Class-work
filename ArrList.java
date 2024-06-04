package com.java;

import java.util.*;

public class ArrList {

	public static void main(String[] args) 
	{
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Math");
		al1.add("English");
		al1.add("science");
		System.out.println("elements in arrayList one : "+al1);
		System.out.println("size of ArrayList one : "+al1.size());

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("history");
		al2.add("Marathi");
		al2.add("Hindi");
		System.out.println("elements in a ArrayList second : "+al2);
		System.out.println("size of ArrayList second is : "+al2.size());
		
		al2.addAll(al1);
		System.out.println("in al2 add a al1 : "+al2);
		System.out.println("size of arrayList after adding both list : "+al2.size());
	}

}

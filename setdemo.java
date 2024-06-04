package com.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class setdemo {

	public static void main(String[] args) 
	{

       Set<Integer> set1 = new HashSet<Integer>();
       set1.add(10);
       set1.add(20);
       set1.add(30);
       set1.add(40);
       System.out.println("Element in set 1 : "+set1);
       System.out.println("Size of set 1  : "+set1.size());
       
       Set<Integer> set2 = new HashSet<Integer>();
       set2.add(50);
       set2.add(60);
       set2.add(70);
       set2.add(80);
       System.out.println("Element in set 2 : "+set2);
       System.out.println("Size of set 2  : "+set2.size());
       
       set1.addAll(set2);
       System.out.println("After adding set 2 in set 1 then Element in set 1 : "+set1);
       System.out.println("Size of set 1  : "+set1.size());
       
       
       set2.addAll(set1);
       System.out.println("After adding set 1  in set 2 then Element in set 2 : "+set2);
       System.out.println("Size of set 2  : "+set2.size());
       
       System.out.println("element in set 1 : ");
       Iterator<Integer> itr = set1.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   
	   System.out.println("element in set 2 : ");
	   Iterator<Integer> itr2 = set2.iterator();
	   while(itr2.hasNext())
	   {
		   System.out.println(itr2.next());
	   }
       
	}
	

}

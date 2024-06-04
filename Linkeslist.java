package com.java;

import java.util.*;

public class Linkeslist {

	public static void main(String[] args) 
	{
		LinkedList<String> l1= new LinkedList<String>();
		System.out.println("Initial size of list : "+l1.size());
		
		l1.add("pune");
		l1.add("mumbai");
		l1.add("satara");
		l1.add("Nashik");
		System.out.println("Linked List Element:"+l1);
		System.out.println("size of list after adding element : "+l1.size());
		
		
		l1.remove(2);
		System.out.println("After removing 2nd element from list :"+l1);
		System.out.println("size of list : "+l1.size());
		
		l1.add("Kolhapur");
		System.out.println("Add one more element : "+l1);
		System.out.println("size of list : "+l1.size());
		
		l1.removeFirst();
		System.out.println("After removing First Element : "+l1);
		System.out.println("size of list : "+l1.size());
		
		l1.removeLast();
		System.out.println("After removing Last Element : "+l1);
		System.out.println("size of list : "+l1.size());
		
		l1.add("pune");
		l1.add("mumbai");
		l1.add("satara");
		l1.add("Nashik");
		System.out.println("Linked List Element:"+l1);
		System.out.println("size of list after adding element : "+l1.size());
		
		System.out.println("perform Iterator");
        Iterator<String> itr = l1.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        
        
	}

}

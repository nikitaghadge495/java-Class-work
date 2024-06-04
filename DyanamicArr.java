//create dynamic linked list to store a healthy vegetables and apply minimum four methods 
package com.java;

import java.util.*;

public class DyanamicArr 
{
   public static void main(String args[])
   {
	   int count;
	   Scanner sc = new Scanner(System.in);
	   LinkedList<String> l1 =new LinkedList<String>();
	   
	  
	   
	   System.out.println("how many vaegetable do you want to display : ");
	   count = sc.nextInt();
	   
	   for(int i =1;i<=count;i++)
	   {
		   System.out.println("vegee"+i+":");
		   String name = sc.next();
		   l1.add(name);
	   }
	   System.out.println("display the element in list : "+l1);
	   System.out.println("size of a list : "+l1.size());
	   
	   l1.addLast("Cabbage");
	   l1.addFirst("Spinach");
	   System.out.println("After adding display the element in list : "+l1);
	   System.out.println("size of a list : "+l1.size());
	   
	   
	   l1.removeLast();
	   System.out.println("After removing Last display the element in list : "+l1);
	   System.out.println("size of a list : "+l1.size());
	   
	   System.out.println("get the first element from list : "+l1.getFirst());
	   
	   System.out.println("disply the all element in list");
	   Iterator<String> itr = l1.iterator();
	   while(itr.hasNext())
	   {
		   System.out.println(itr.next());
	   }
	   
   }
}

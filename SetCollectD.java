package com.java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetCollectD {

	public static void main(String[] args)
	{
       Set<String> stdList = new HashSet<String>();
       stdList.add("nikita");
       stdList.add("partiksha");
       stdList.add("Aditi");
       stdList.add("Abhishek");
       stdList.add("Gayatri");
       stdList.add("Vishakha");
       
       
       System.out.println("corrent element present in a set : "+stdList);
       
      Iterator<String> itr = stdList.iterator();
      while(itr.hasNext())
      {
    	  System.out.println(itr.next());
      }
      
      stdList.remove("Abhishek");
      System.out.println("After removing the element : ");
      Iterator<String> itr1 = stdList.iterator();
      while(itr1.hasNext())
      {
    	  System.out.println(itr1.next());
      }
       
	}

}

package com.java;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args)
	{
        Map<String,Integer> treemap = new TreeMap<>();
        
        //adding element in tree map
        treemap.put("A", 1010);
        treemap.put("D", 2020);
        treemap.put("C", 3030);
        treemap.put("", 4040);
        
        System.out.println(treemap);
        
        //getting values from treemap
        System.out.println("Value of A : "+treemap.get("A"));
        
        int b = treemap.remove("B");
        System.out.println("Removed element is : "+b);
        
        //iterating element from the tree map
        
        for(String key:treemap.keySet())
        {
        	System.out.println("key : "+key+"  value : "+treemap.get(key));
        }
        
        
	}

}

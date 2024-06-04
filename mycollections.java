package com.java;
import java.util.*;

public class mycollections {

	public static void main(String[] args) 
	{
		ArrayList<String> user = new ArrayList<String>();
		user.add("nikita");
		user.add("gayatri");
		user.add("aditi");
		user.add("pranav");
		
		System.out.println("the array list is a :"+user);
		
		Iterator itr = user.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		String str = user.get(3);
		System.out.println(str);
		
		
		user.set(2,"prathmesh");
		System.out.println("newly added user"+user);
		
		user.set(3,"ayush");
		System.out.println(user);
		
		user.remove(2);
		System.out.println(user);
	}

}

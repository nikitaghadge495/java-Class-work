package example.com;

import java.util.Scanner;

public class Arrayminim 
{
	static int  minmax(int arr[])
	{
		int n = arr.length,max = arr[0];
		for (int i = 1; i<n; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
				
			}
		}
		return max;
	}
	static int  minmax2(int arr[])
	{
		int n = arr.length,min = arr[0];
		for (int i = 1; i<n; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
				
			}
		}
		return min;
	}

	static void displayArray(int arr[])
	{
		int n = arr.length;
		System.out.println("array elemet is : ");
		for(int i =0;i<n; i++)
		{
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	       System.out.println("enetr size of Array : ");
	       int n = sc.nextInt();
	       
	       int arr1[]=new int[n];
	       System.out.println("Enter array element : ");
	       for(int i = 0;i<n;i++)
	       {
	    	   arr1[i]=sc.nextInt();
	       }
	       displayArray(arr1);
	       System.out.println("the gratest  number is : "+minmax(arr1));
	       System.out.println("the smallest number is : "+minmax2(arr1));

	}

}

package example.com;

import java.util.Scanner;

public class ArraysortDemo 
{
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
	static Boolean ArraySort(int arr[])
	{
		int n = arr.length;
		Boolean check = true;
		for(int i =1;i<n;i++)
		{
			if(arr[i] < arr[i-1])
			{ 
				check = false;
				break;
			}
		}
		return check;
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the size of array : ");
		int n = sc.nextInt();
		System.out.println("eneter array elemet is : ");
		int arr[]=new int[n];
		for(int i =0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		displayArray(arr);
		System.out.println("array is sorted or not : "+ArraySort(arr));
	}

}

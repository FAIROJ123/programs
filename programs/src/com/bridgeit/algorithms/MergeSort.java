package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class MergeSort 
{
	public static void main(String[] args) 
	{
		
	
	Util util = new Util();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter number of elements");
	   int n = sc.nextInt();
	   String[] arr=new String[n];
    System.out.println("enter array elements");

		for (int i = 0; i < n; i++) 
		{
			arr[i] = sc.next();

		}
		util.mergeSort(arr);
		 util.display(arr);
	}
	

}
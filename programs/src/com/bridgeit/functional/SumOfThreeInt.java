package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class SumOfThreeInt
{
   public static void main(String[] args)
   {
	   Util util=new Util();
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter how many elements you want");
	   int n=sc.nextInt();
	   int arr[]= new int[n];
	   System.out.println("enter the array elements:");
       for(int i=0;i<n;i++)
       {
    	   arr[i]=sc.nextInt();
       }
	  
	   
	   util.findTriplets(arr, n);
	   
   }
}

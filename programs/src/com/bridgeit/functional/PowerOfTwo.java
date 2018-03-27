/*
 * @Purpose:This program takes a command-line argument N and prints a table of the powers of 2 that are less than or equal to 2^N.
 * @Author:S.Fairoj
 * @Date:14/03/2018.
 * */

package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;


public class PowerOfTwo {
   
public static void main(String[] args)
{
	    Util util=new Util();
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number");
	    int n=sc.nextInt();
	    if(n>=0&&n<31)
	    {
	       util.power(n);
	    }
	       
	       else
	       {
	    	   System.out.println("invalid integer");
	       }
	    	  
	    
	      }

}


 /* @Purpose:Print the year is a Leap Year or not.
 * @Author:S.Fairoj
 * @Date:14/03/2018. 
 * */

package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class LeapYear {
	public static void main(String[] args)
	{
		Util util=new Util();
		Scanner sc= new Scanner(System.in);
	    System.out.println("enter a year");
	    int n=sc.nextInt();
	    util.isLeapYear(n);
	   
		
		
	}

}

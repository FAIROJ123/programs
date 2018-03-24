
/*
 * @Purpose:One string is an anagram of another if the second is simply a rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
 
 *@Author:S.Fairoj.
  
 * @Date:18/3/2018. 
 
 * */

package com.bridgeit.algorithms;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

import com.bridgeit.utillity.Util;

public class Anagram 
{
	public static void main(String[] args)
	{
		Util util=new Util();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first string:");
		String s1=sc.next();
        System.out.println("enter the second string:");
        String s2=sc.next();
		boolean rs=util.isAnagram(s1,s2);
		if(rs)
		{
			System.out.println("the given strings are Anagram");
		}
		else
			System.out.println("the given strings are not a Anagram");
        
		
	}

}

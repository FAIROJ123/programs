/*
 
 * @Purpose:User Input and Replace String Template “Hello <<UserName>>, How are you?” .
 * @Author:S.Fairoj
 * @Date:14/03/2018.
 *
 * */

package com.bridgeit.functional;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Replacestring {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		String str = "Hello <<username>>,How are you ?";
		System.out.println("Enter the input string ");
		String str1 = sc.next();
		String msg="<<username>>";
		int n=str1.length();
		    
		if(n>=3) { 
		
		     System.out.println(str.replace( msg,str1));
		   }
		   else
		   {
			   System.out.println("invalid string");
		   }

	
		   
	}
	

}

package com.bridgeit.algorithms;

import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class Findnumber

{

	public static void main(String[] args) {
		Util util = new Util();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element you want to find");
		int n = sc.nextInt();

		int power = (int) Math.pow(2, n) - 1;
		int low = 0;
		
		System.out.println("your number is present between" + low + "to" + power);
		util.binarySearch(a, lo, hi);
		System.out.println("your assume number is" + n);

	}

}
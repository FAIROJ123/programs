package com.bridgeit.datastructures;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import com.bridgeit.utillity.Util;

public class OrderedList
{
	public static void main(String[] args) throws NumberFormatException, IOException{
		Util util = new Util();
		Scanner sc = new Scanner(System.in);
		OrderedNode node = new OrderedNode();
		File file = new File("/home/bridgeit/Desktop/mytext.txt");
		String string= util.readFile(file); //reading file method of Utility class is called.
		System.out.println("Contents of file are: "+string);
		string = string.trim();
		String strArray[] = string.split(" ");
		
		for(int i=0;i<strArray.length;i++){
			node.addNode(Integer.parseInt(strArray[i]));
		}
		
		System.out.print("List Elements are: ");
		node.showList();
		System.out.println("\nPlease Enter the element you want to Search: ");
		int value = sc.nextInt();
		node.search(value); 
			
			
}
}
